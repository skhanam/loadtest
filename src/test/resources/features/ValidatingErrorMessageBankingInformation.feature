@ErrorBanking
Feature: As a user, I should validate error message in banking information with empty input fields

Scenario: Validating Error message in Banking Information page

    Given user is logged in
    When I click on a member my activity link
    Then I should be on the my activity page
    And I click on the setting link
    And I click on the banking information link
    And I click on modify link for payment account