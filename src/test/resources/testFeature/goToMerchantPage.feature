Feature: User clicks out of shoop to merchant site




  Scenario: validate user is able to click out to merchant page
    Given are is on a merchant page https://www.shoop.fr/groupon/
    And clicks on the 'click out' link (Obtenir mon cashback)
    Then the user is directed to the merchants home page (https://www.groupon.fr)
