import br.ufpe.cin.ines.ress.Address
import br.ufpe.cin.ines.ress.User
import br.ufpe.cin.ines.ress.Role
import br.ufpe.cin.ines.ress.UserRole
class BootStrap {

    def init = { servletContext ->
        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
        def user = User.findByUsername('admin') ?: new User(username: 'admin',
                password: 'pass',
                name: 'Ronaldo',
                address: new Address(street: 'Rua dos bobos', cep: '52912-123', city: 'Recife', state: 'Pernambuco', streetNumber: '0'),
                enabled: true).save(failOnError: true)
        if(!user.authorities.contains(adminRole)){
            UserRole.create(user, adminRole, true)
        }
    }
    def destroy = {
    }
}
