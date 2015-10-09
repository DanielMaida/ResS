package br.ufpe.cin.ines.ress.residuecollector

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_COLLECTOR'])
class CollectorDashboardController {

    def index() {}
}
