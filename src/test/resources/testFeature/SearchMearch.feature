@sp-58
Feature: NOt logged user Merchant category search on shoop

 Scenario Outline: Merchant category search
   Given I go to shoop home Page
    When I click on merchant"<merchantTable>"category name
    Then I should see a category of merchant
  Examples:
   | merchantTable            |
   |Mode                      |
   |Maison & Jardin           |
   |Voyages                   |
   |High-Tech & Électroménager|
   |Mobile, Internet & TV     |
   |Mobile, Internet & TV     |
   |Divertissement            |


