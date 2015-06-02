package residueGenerator

class ResidueGenerator {

    String nameGenerator // nome do estabelecimento
    String type// tipo de estabelecimento
    String addressGenerator // endere�o do gerador n�o confundir...

    String cnpj
    int averageDailyMeals
    int averageMonthlyMeals


    static constraints = {

        nameGenerator blank: true // no caso de ser ecoponto pode n�o ter nome
        type inList: ["Restaurante","Cantina","Ecoponto"]


        addressGenerator blank: false, nullable: false, maxSize: 40
        averageDailyMeals  nullable: true, min: 0
        averageMonthlyMeals  nullable: true, min: 0

        cnpj blank:true

    }
    String toString(){
        if(!nameGenerator){
            return addressGenerator
        }else{
            return nameGenerator
        }
    }
}