@Regression
@ErrorRegister

Feature: As a user I should be able to view relevant error messages with empty input fields

  Scenario: Validating error message for Register message

    Given I go to shoop home Page
    When I click on the register link
    And I click on the register for free button on regiser page
    Then I should see a error message as "Veuillez renseigner ce champ" for email field
    And I should see a error message as "Vous n'avez pas renseigné de mot de passe." for password field
    And I should see a error message as "Veuillez accepter les conditions générales d'utilisation" for terms section