Feature: Deletar pontos de coleta
  As a membro da empresa coletora
  I want to deletar pontos de coleta
  so that eles sejam apagados do sistema

  Scenario: Deletar ponto de coleta
    Given Estou na pagina de editar do ponto "RU"
    When deleto o ponto aceitando a mensagem de confirma��o
    Then a dele��o � confirmada