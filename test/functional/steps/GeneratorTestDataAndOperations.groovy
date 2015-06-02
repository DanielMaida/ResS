package steps

import residueGenerator.ResidueGenerator
import residueGenerator.ResidueGeneratorController

class GeneratorTestDataAndOperations{

    static  generators = [

            [nameGenerator:"RU",
             type: "Restaurante",
             cnpj: "testecnpj1",
             addressGenerator: "Bubble Street number 7",
             averageMonthlyMeals: 0,
             averageDailyMeals: 0],

            [nameGenerator:"Clovis Palace",
             type: "Restaurante",
             cnpj: "testecnpj2",
             addressGenerator: "Bubble Street number 4",
             averageMonthlyMeals: 0,
             averageDailyMeals: 0],

            [nameGenerator:"China Dragon",
             type: "Restaurante",
             cnpj: "testecnpj3",
             addressGenerator: "Donut Street number 5",
             averageMonthlyMeals: 0,
             averageDailyMeals: 0]

    ]

    static public def getGenerator(){
        return findGeneratorByAddress("Bubble Street number 7")
    }

    static public def findGeneratorByAddress(String address) {
        generators.find { generator ->
            generator.addressGenerator == address
        }
    }

    static public void createGenerator(String address){
        def cont = new ResidueGeneratorController()
        def novoGenerator = findGeneratorByAddress(address)
        cont.params << novoGenerator
        cont.create()
        cont.save()
        cont.response.reset()
    }

    static public void editGenerator(String address, def residueGenerator){
        def existingGenerator = findGeneratorByAddress(address)
        if(address != null && existingGenerator == null) {
            def cont = new ResidueGeneratorController()
            cont.params << [name: "Clovis Palace"] << [type: "Restaurante"] << [cnpj: "testecnpj2"] << [addressGenerator: address] << [averageMonthlyMeals: 0] << [averageDailyMeals: 0] << [id: residueGenerator.getId()]
            cont.edit()
            cont.save()
            cont.response.reset()
        }
    }

}