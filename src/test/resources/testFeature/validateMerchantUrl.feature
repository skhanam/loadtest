@SH-70
Feature: validate merchant url

  Scenario Outline: validate merchant exist on shoop url


    Given I go to "<merchantCategory>" page
    Then I should be on the shoop "<termOnMerchantpage>" merchant page
    Examples:

      | merchantCategory      | termOnMerchantpage    |
      | achats-professionnels | Achats professionnels |
      | alimentation          | Alimentation          |
      | fleurs-cadeaux        | Fleurs & Cadeaux      |
      | banques-assurances    | Banques & Assurances  |
      | jouets                | Jouets                |
      | jeux-paris-en-ligne   | Jeux & Paris en ligne |
      | rugby-center          | Rugby-center          |

