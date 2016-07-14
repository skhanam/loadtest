


@Registration
Feature: As new user I should be able to Register

  Scenario: New user Registering on Shoop

    Given I go to shoop home Page
    When I click on the register link
    And  I enter my email and password
    And I accept shoop terms and conditions
    And I click on the register for free button
    Then I should see agreeting message"Bonjour" for new registered user

  Scenario: Sign up and do not tick to agree to terms and conditions (not registered)
    Given I go to shoop home Page
    When I register with my email address and password
    And I click on the register button
    Then I should see message "Veuillez accepter les conditions générales d'utilisation" advising me to accept the terms and conditions


