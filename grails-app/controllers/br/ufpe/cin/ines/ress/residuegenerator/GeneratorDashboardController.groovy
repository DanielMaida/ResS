package br.ufpe.cin.ines.ress.residuegenerator

import br.ufpe.cin.ines.ress.DashboardController
import br.ufpe.cin.ines.ress.PickupRequest
import br.ufpe.cin.ines.ress.User
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_GENERATOR'])
class GeneratorDashboardController{

    def springSecurityService

    def index()
    {
        def pickupHistory = PickupRequest.findAll()
        render(view: 'index', model: [history : pickupHistory])
    }

    def pickupRequest()
    {
        User currentUser = (User)springSecurityService.currentUser;
        PickupRequest pickupRequest = PickupRequest.findByGeneratorAndStatus(currentUser, true)
        render (view: "pickup", model:[pickup:pickupRequest])
    }

    def savePickup()
    {
        def pickupRequest = new PickupRequest(params)
        pickupRequest.save()
        redirect(action: pickupRequest)
    }
}
