package br.ufpe.cin.ines.ress.residuecollector

import br.ufpe.cin.ines.ress.User
import grails.plugins.springsecurity.Secured
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder

@Secured(['ROLE_COLLECTOR'])
class CollectorDashboardController {

    def index() {}
}
