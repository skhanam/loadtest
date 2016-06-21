@SH-70
Feature: validate merchant url

  Scenario Outline: validate merchant exist on shoop url


    Given I go to "<merchant>" page
    Then I should be on the shoop "<merchantpage>" merchant page
    Examples:
      | merchant              | merchantpage          |
      | achats-professionnels | Achats professionnels |
    #  | sports-loisirs        | Sports & Loisirs      |
      | alimentation          | Alimentation          |
      | fleurs-cadeaux        | Fleurs & Cadeaux      |
      | banques-assurances    | Banques & Assurances  |
 #     | auto-moto             | Auto-Moto             |
      | jouets                | Jouets                |
      | jeux-paris-en-ligne   | Jeux & Paris en ligne |




