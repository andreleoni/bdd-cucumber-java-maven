Feature: AdvertisementSales (Manutenção de Promoções)

  Scenario: "Requisitos de promoção não atendem"
    Given exista promoções nas companhias
    When a diferença for de "5"% de diferença de valor atual do ticket
	Then não será notificado o usuário

  Scenario: "Existe promoções nas companhias"
    Given exista promoções nas companhias
    When a diferença for de "10"% de diferença de valor atual do ticket
    Then será notificado o usuário da promoção