@Regression
@Registration
Feature: As new user I should be able to Register

  Scenario: New user Registering on Shoop

    Given I go to shoop home Page
    When I click on the register link
    And I enter firstname as "quico" and last name as "test"
    And I enter my email and password
    And I accept shoop terms and conditions
    And I click on the register for free button
    Then I should see agreeting message"Bonjour" for new registered user
    
    
    Scenario: Validating Error message in Banking Information page

    When I click on a member my activity link
    Then I should be on the my activity page
    And I click on the setting link
    And I click on the banking information link
    And I click on modify link for payment account
    When I click on account payment record button
    Then I should see error message as "Veuillez saisir votre code BIC" for BIC
    And I should see error message as "Veuillez renseigner votre numéro IBAN" for IBAN
    And I should see error message as "Veuillez renseigner le titulaire du compte" for email field
    And I should see error message as "Veuillez saisir votre mot de passe" for password field

  Scenario: Validate User Account Signout

    And I click on the signout link
    Then I should be logged out of my account


  Scenario: Sign up and do not tick to agree to terms and conditions (not registered)
    Given I go to shoop home Page
    When I register with my email address and password
    And I click on the register button
    Then I should see message "Veuillez accepter les conditions générales d'utilisation" advising me to accept the terms and conditions



