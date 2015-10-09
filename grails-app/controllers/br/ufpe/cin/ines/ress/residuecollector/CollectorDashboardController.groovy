package br.ufpe.cin.ines.ress.residuecollector

import grails.plugins.springsecurity.Secured

@Secured(['ROLER_ADMIN'])
class CollectorDashboardController {

    def index() {}
}
