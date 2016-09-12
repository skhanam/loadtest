@MerchantCategory
Feature: validate merchant Category

  Scenario Outline: validate merchant exist on shoop url

    Given I go to shoop home Page
    When I click on a merchant category"<merchantCategory>" link
    Then I should be on the shoop merchant category page
   # Then I should be on the shoop "<termOnMerchantpage>" merchant page
    Examples:

      | merchantCategory      | termOnMerchantpage    |
      | achats-professionnels | Achats professionnels |
      | alimentation          | Alimentation          |
      | fleurs-cadeaux        | Fleurs & Cadeaux      |
      | banques-assurances    | Banques & Assurances  |
      | jouets                | Jouets                |
      | jeux-paris-en-ligne   | Jeux & Paris en ligne |

