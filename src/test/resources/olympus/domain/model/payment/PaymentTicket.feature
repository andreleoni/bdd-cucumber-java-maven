Feature: Payment (Pagamento de ticket)

  Scenario: "Não deve receber a baixa do boleto pelo banco"
  	Given pagamento não foi efetuado em até 48hrs
    When vou validar o pagamento do ticket
    Then a reserva do ticket, será cancelada
    Then o cliente receberá notificação de que a reserva foi cancelada  
    
  Scenario: "Deve receber a baixa do boleto pelo banco"
  	Given pagamento foi efetuado
  	When vou validar o pagamento do ticket
  	Then a reserva do ticket será efetuada
  	Then o cliente receberá notificação com o cartão de embarque
