Feature: Criação de ticket    
    	
  Scenario: "Deve receber mensagem de que a data é inválida"
    Given informo data de chegada "01/01/2017" inferior a data de partida "01/12/2016"
	When clico em comprar passagem
	Then recebo mensagem de que a data é inválida                 

  Scenario: "Deve avisar a companhia para reservar uma passagem"    
    Given o ticket foi cadastrado com data de partida "01/01/2017" e data de retorno "01/02/2017"
    When ele gerar o boleto de pagamento
    Then reservo a passagem com a companhia aerea    