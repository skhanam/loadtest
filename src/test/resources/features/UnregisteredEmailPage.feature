@UnregisteredEmail
Feature: Sign in with un-registered email address


  Scenario: Sign up with un-registered email address
  
    Given I go to shoop home Page
    When I click on the login link
    And I enter an email address that is not registered on Shoop
    And I enter my password
    And I click on the login button
    Then I should see "Nous sommes désolés, l'adresse e-mail et/ou le mot de passe sont incorrects" text displayed




