package steps

import pages.ResidueGeneratorEditPage
import residueGenerator.ResidueGenerator
import pages.PesquisaPages
import static cucumber.api.groovy.EN.*

Given(~'^Estou na pagina de editar do ponto "([^"]*)"$'){
    to ResidueGeneratorEditPage
}

When(~'^deleto o ponto aceitando a mensagem de confirma��o'){ ->
    assert withConfirm(true) {$("input", name: "_action_delete").click() } != "Tem certeza?"
}

Then(~'^a dele��o � confirmada'){ ->
    at PesquisaPages
}