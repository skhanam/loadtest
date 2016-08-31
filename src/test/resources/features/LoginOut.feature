@LoginOut
Feature:  Shoop member account login test

  As Shoop Acount holder I should be able to login with my email and password

  Scenario: Login as shoop member

    Given I go to shoop home Page
    When I click on the login link
    And I enter my username
    And I enter my password
    And I click on the login button
    Then I should see a greeting message "Bonjour"
    And I should be logged out



#  Scenario: Validate User Account Signout
#
#    Given I click on a member my activity link
#    And I click on the signout link
#    Then I should be logged out of my account

