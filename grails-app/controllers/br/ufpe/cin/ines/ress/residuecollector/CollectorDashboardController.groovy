package br.ufpe.cin.ines.ress.residuecollector

import br.ufpe.cin.ines.ress.PickupRequest
import br.ufpe.cin.ines.ress.Role
import br.ufpe.cin.ines.ress.User
import br.ufpe.cin.ines.ress.UserRole
import grails.plugins.springsecurity.Secured
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder

import static br.ufpe.cin.ines.ress.User.*

@Secured(['ROLE_COLLECTOR'])
class CollectorDashboardController {

    def springSecurityService

    def index() {
        def openPickups = PickupRequest.findAllByStatus(false)
        render (view:'index', model:[openPickupList : openPickups])
    }


    def collectionHistory(Integer max)
    {
        params.max = Math.min(max ?: 2, 100)
        def closedPickups = PickupRequest.findAllByStatus(true).sort{it.generator.name}
        render (view:'collectionHistory', model:[closedPickups : closedPickups])
    }

    def generatorList()
    {
        def generators = User.findAll()
        generators.removeAll {
            !it.getAuthorities().contains(Role.findByAuthority('ROLE_GENERATOR'))
        }

        render (view: 'generatorList', model: [userList: generators])
    }

    def collect(int id)
    {
        def pickup = PickupRequest.findById(id)
        pickup.status = true;
        pickup.save()
        redirect(action: 'index')
    }

    def accountConfig(){
        User user = (User) springSecurityService.currentUser
        render(view: "accountConfig", model:[user:user])
    }

    def saveAccountChanges(){
        def user = new User(params)
        user.save();
    }

    def editAccountConfig(){
        def user = new User()
        render(view:'editAccount', model: [user: user])
    }

    def saveUserChanges(){
        def newUserInfo = new User(params);
        User userToChange = (User) springSecurityService.currentUser
        userToChange.username = newUserInfo.username
        userToChange.email = newUserInfo.email
        userToChange.password = newUserInfo.password
        userToChange.save()
        redirect (action: 'accountConfig')
    }

}
