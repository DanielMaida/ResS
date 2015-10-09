package br.ufpe.cin.ines.ress.residuegenerator

import grails.plugins.springsecurity.Secured

@Secured(['ROLER_ADMIN'])
class CollectorDashboardController {

    def index() {redirect(controller: "dashboard", action: "index")}
}
