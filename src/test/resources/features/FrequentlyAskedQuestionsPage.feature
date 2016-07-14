@FrequentlyAsked
Feature: view shoop Questions fréquentes
  As a user
  I want to view shoop frequently questions on the registration page

  Background: how to get FrequentlyAsked

    Given I go to shoop home Page
    When I click on the register link


  Scenario: By the way what's the cashback link

    And I click on the Au fait cest quoi le cashback link
    Then I should see text containing " Le cashback existe depuis de nombreuses années en Europe et aux USA, il est notamment très populaire "

  Scenario: Is it safe and secure link
    And I click on the Comment Shoop gagne-t-il de l'argent link
    Then I should see text containing " certains emplacements publicitaires payants sont également une source de revenu"

  Scenario: Can we consult the offers before signing up?

    And I click on the "Peut-on consulter les offres avant de s'inscrire  link
    Then I should see text containing " Oui. Pour assurer la sécurité de vos renseignements personnels"

  Scenario: CHow much will I earn?link

    And I click on the Combien vaisje gagner  link
    Then I should see text containing " il n'y a pas de petites économies !"


  Scenario: How it works ? link

    And I click on the Comment ça marche link
    Then I should see text containing " Vous pourrez transférer votre solde sur votre compte bancaire dès que vous atteignez le montant minimum de cashback nécessaire."


  Scenario: You have questions link

    And I click on the Contact us link
    Then I should be on customer service page