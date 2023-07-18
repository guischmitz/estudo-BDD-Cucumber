#Cinco passos possíveis ao executar um cenário:
#  Passed: Passou o passo com sucesso
#  Failed: Falhou o passo
#  Skipped: Ignorou e seguiu
#  Undefined: Não encontrou as definições do passo
#  Pending: Quando existe Given, When ou Then, mas não foi feita implementação

Feature:
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

Scenario: Deve executar especificação
  Given que criei o arquivo corretamente
  When executá-lo
  Then especificação deve finalizar com sucesso