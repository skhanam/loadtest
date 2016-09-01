@FrequentlyAsked
Feature: view shoop Questions fréquentes
  As a user
  I want to view shoop frequently questions on the registration page

  Background: how to get FrequentlyAsked

    Given I go to shoop home Page
    When I click on the register link

  Scenario: By the way what's the cashback?
    And I click on the Au fait, c'est quoi le cashback link
    Then I should see text containing "nous recevons une commission de sa part"

  Scenario: Shoop how he makes money
    And I click on the Comment Shoop gagne-t-il de l'argent link
    Then I should see text containing "Une partie de la commission perçue des marchands nous permet de" in how he makes money


  Scenario: Is it safe and secure link
    And I click on the Est-ce que c'est sûr et sécurisé link
    Then I should see text containing "Oui. Pour assurer la sécurité de vos renseignements personnels" how shoop is secure

  Scenario: Can we consult the offers before signing up?

    And I click on the Peut-on consulter les offres avant de s'inscrire  link
    Then I should see text containing "Bien sûr ! Nous travaillons déjà avec des centaines de marchands avec qui nous négocions pour vous les" offers

  Scenario: How much will I earn?link

    And I click on the Combien vaisje gagner  link
   Then I should see text containing "Il n'y a pas de limite. Vous pouvez accumuler autant de cashback que vous le souhaitez" how much can earn


  Scenario: How it works ?

    And I click on the Comment ça marche link
   Then I should see text containing "Une fois votre achat effectué, nous enregistrons automatiquement votre cashback et nous vous envoyons un " how shoop works


  Scenario: You have questions link

    And I click on the Contact us link
    Then I should be on customer service page
    
    
    
    
    
    
    
    