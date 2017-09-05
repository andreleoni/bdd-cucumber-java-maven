Feature: AdvertisementSales (Manutenção de Promoções)

  Scenario: "Requisitos de promoção não atendem"
    Given exista promoções nas companhias,
    When a diferença for menor ou igual a 5% de diferença de valor atual do ticket,
	Then não será notificado o usuário

  Scenario: "Existe promoções nas companhias"
    Given exista promoções nas companhias,
    When a diferença for maior que 5% de diferença atual do ticket,
    Then será notificado o usuário da promoção