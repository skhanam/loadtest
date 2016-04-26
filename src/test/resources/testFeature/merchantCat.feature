
@smoke-testA
Feature: As a new user i should be able to join Quidco

  Scenario Outline: Merchant category search
    Given I go to "https://www.shoop.fr/"
    When I click on merchant"<merchantTable>"category name
    Then I should see a category of merchant
    Examples:
      | merchantTable            |
      |Mode                      |
      |Maison & Jardin           |
      |Voyages                   |
      |High-Tech & Électroménager|
      |Mobile, Internet & TV     |
      |Beauté & Santé            |
      |Divertissement            |

  Scenario: Login to to User Account

    Given I go to "https://www.shoop.fr/"
    When I click on the login link
    And I enter my username and password
    And I click on the login button


