package br.ufpe.cin.ines.ress

class PickupRequest {

    int id
    Date date
    double residueAmount
    User collector
    boolean status


    static belongsTo = [generator : User]

    static constraints = {
        id unique:true, blank:false , nullable: false
        date blank:false , nullable: false
        residueAmount blank:false , nullable: false
        collector blank:false , nullable: false
        status blank:false , nullable: false
    }
}
