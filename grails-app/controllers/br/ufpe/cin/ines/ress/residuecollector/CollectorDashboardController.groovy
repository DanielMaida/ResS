package br.ufpe.cin.ines.ress.residuecollector

import br.ufpe.cin.ines.ress.PickupRequest
import br.ufpe.cin.ines.ress.Role
import br.ufpe.cin.ines.ress.User
import br.ufpe.cin.ines.ress.UserRole
import grails.plugins.springsecurity.Secured
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder

@Secured(['ROLE_COLLECTOR'])
class CollectorDashboardController {

    def index() {
        def openPickups = PickupRequest.findAllByStatus(false)
        render (view:'index', model:[openPickupList : openPickups])
    }

    def collectionHistory()
    {
        def closedPickups = PickupRequest.findAllByStatus(false)
        render (view:'collectionHistory', model:[closedPickups : closedPickups])
    }

    def generatorList()
    {
        def generators = User.findAll()

        generators.removeAll {
            !it.getAuthorities().contains(Role.findByAuthority('ROLE_GENERATOR'))
        }

        render (view: 'generatorList', model: [userList:generators])

    }

}
