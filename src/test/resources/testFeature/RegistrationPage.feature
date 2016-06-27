
@QA-50
Feature: As new user I should be able to Register

  Scenario: New user Registering on Shoop
    Given I go to shoop home Page
    When I click on the register link
    And  I enter my email and password
    And I accept shoop terms and conditions
    #And I click on to accept latest email offers
    And I click on the register for free button
    Then I should see agreeting message"Bonjour" for new registered user