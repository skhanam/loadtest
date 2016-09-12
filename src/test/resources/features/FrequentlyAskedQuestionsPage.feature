@FrequentlyAsked
Feature: view shoop Questions fréquentes
  As a user
  I want to view shoop frequently questions on the registration page

  Background: how to get FrequentlyAsked

    Given I go to shoop home Page
    When I click on the register link

  Scenario: By the way what's the cashback?
    And I click on the Au fait, c'est quoi le cashback link
    #Then I should see text containing "nous recevons une commission de sa part"

  Scenario: Shoop how he makes money
    And I click on the Comment Shoop gagne-t-il de l'argent link
    #Then I should see text containing "Une partie de la commission perçue des marchands nous permet de"


  Scenario: Is it safe and secure link
    And I click on the Est-ce que c'est sûr et sécurisé link
    #Then I should see text containing " Oui. Pour assurer la sécurité de vos renseignements personnels" how shoop is secure

  Scenario: Can we consult the offers before signing up?

    And I click on the "Peut-on consulter les offres avant de s'inscrire  link
    #Then I should see text containing "Of course ! We are already working with hundreds of merchants with whom we negotiate for you the best deals" offers

  Scenario: How much will I earn?link

    And I click on the Combien vaisje gagner  link
   # Then I should see text containing "There is no limit. You can collect as many as you want cashback" how much can earn


  Scenario: How it works ?

    And I click on the Comment ça marche link
   # Then I should see text containing "After your purchase, we automatically log your cashback and send you a confirmation email" how shoop works


  Scenario: You have questions link

    And I click on the Contact us link
    Then I should be on customer service page