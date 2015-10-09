package br.ufpe.cin.ines.ress.residuegenerator

import br.ufpe.cin.ines.ress.PickupRequest
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_GENERATOR'])
class GeneratorDashboardController {

    def index()
    {
        def pickupHistory = PickupRequest.findAll()
        render(view: 'index', model: [history : pickupHistory])
    }
}
