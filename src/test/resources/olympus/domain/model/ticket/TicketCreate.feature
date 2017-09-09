Feature: Criação de ticket    
    	
  Scenario: "Deve receber mensagem de que a data é inválida"
    Given informo data de chegada inferior a data de partida
      | ticketId | dateDeparture    | dateReturn   |
      | 1        | 01/01/2017       | 01/12/2016   |      
	When clico em comprar passagem
	Then recebo mensagem de que a data é inválida                 

  Scenario: "Deve avisar a companhia para reservar uma passagem"    
    Given o ticket foi cadastrado
      | ticketId | dateDeparture    | dateReturn   |
      | 1        | 01/01/2017       | 01/02/2017   |
    When ele gerar o boleto de pagamento
    Then reservo a passagem com a companhia aerea    