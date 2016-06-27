
  @QA-74
  Feature: User clicks out of shoop to merchant site


  Scenario: validate user is able to click out to merchant page

    When I go to a merchant page "groupon"
    And I click on the cashback link Obtenir mon cashback
    Then the user is directed to the merchants home page "groupon"


