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
    Então o valor do contador deve ser 18
