package br.ufpe.cin.ines.ress

class Address {

    String street
    String streetNumber
    String additionalInfo
    String city
    String state
    String cep

    static belongsTo = [user: User]

    static constraints = {
        street nullable: false, blank: false
        streetNumber nullable: false, blank: false
        city nullable: false, blank: false
        state nullable: false, blank: false
        cep nullable: false, blank: false
    }
}
