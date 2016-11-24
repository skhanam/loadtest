@ErrorMessage
Feature:  Login user with Admin preverages

  As Shoop Admin user I should be able to view error message with empty email and password fields

  Scenario: Login as shoop member

    Given I go to shoop home Page
    When I click on the login link
    And I click on SignIn button
    Then I should see email error message stating "Veuillez renseigner ce champ"
    And I should also see pass error message as "Vous n'avez pas renseigné de mot de passe."