@SH-62
Feature:Sign in with un-registered email address


  Scenario: Sign up with un-registered email address
    Given I go to shoop home Page
    When I click on the login link
    And I enter an email address that is not registered with Shoop
    And I enter my password
    And I click on the login button

    Scenario:
    Then I should see "Nous sommes désolés, l'adresse e-mail et/ou le mot de passe sont incorrects" text displayed


#  Scenario: Sign up and do not tick to agree to terms and conditions (not registered)
#    When I navigate to the registration page
#    And I enter an email address that is not registered with Shoop
#    And I enter a password
#    And I do not tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should see error message advising me to accept the terms and conditions
#
#  Scenario: Sign up and do not tick to agree to terms and conditions (already registered)
#    When I navigate to the registration page
#    And I enter an email address that is already registered with Shoop
#    And I enter a password
#    And I do not tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should be presented with an error message advising me to accept the terms and conditions
#    And I should be presented with an error message advising me that my email address is already registered
