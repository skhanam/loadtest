Feature: Search

  Background: Login user

    Given I go to "http://www.shoop.fr/"
    When  I click on the login button
    And I enter my username and password
    Then I should be logged in

  Scenario Outline: Merchant category search
    Given I go to "https://www.shoop.fr/"
    When I click on merchant"<merchantTable>"category name
    Then I should see a category of merchant
    Examples:
      | merchantTable            |
      |Mode                      |
      |Maison & Jardin           |
      | Voyages                  |
      |High-Tech & Électroménager|
      |Mobile, Internet & TV     |
      |Mobile, Internet & TV     |
      |Divertissement            |