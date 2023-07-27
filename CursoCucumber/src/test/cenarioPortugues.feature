# language: pt
Funcionalidade: Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar especificação
    Dado Que criei o cenário Português
    Quando executar o cenario Português
    Então deve rodar com sucesso

  Cenário: Contador
    Dado que o valor do contator é 12
    Quando eu somar 3
    Então o valor do contador deve ser 15



  Cenário: Calcular atraso na entrega
    Dado que a entrega deve ser realizada em 20/07/2023
    Quando atrasar em 2 dias
    Então a entrega deverá ser feita em 22/07/2023

  Cenário: Calcular atraso na entrega da China
    Dado que a entrega deve ser realizada em 20/10/2023
    Quando atrasar em 2 meses
    Então a entrega deverá ser feita em 20/12/2023