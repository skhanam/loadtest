#@QA-80
Feature:
When I navigate to the search bar
    And type out a full merchant name
    And the merchant is active
    Then I should be presented with results that match the merchant's name

  Scenario: Searching for a merchant's full name, merchant is not active/does not exist
    When I navigate to the search bar
    And type out a full merchant name
    And the merchant is not active
    Then I should be presented with message to advise me that no results can be found

  Scenario: Searching for a text string, matches a merchant name
    When I navigate to the search bar
    And type out a string of text
    And the string of text can be found within a merchant name
    Then I should be presented with matching results, with the most relevant first

  Scenario: Searching for a text string, does not match a merchant name
    When I navigate to the search bar
    And type out a string of text
    And no merchant names contain that string
    Then I should be presented with message to advise me that no results can be found
