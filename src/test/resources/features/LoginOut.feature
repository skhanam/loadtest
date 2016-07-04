@LoginOut
Feature: Testing login to my shoop member account and edit details

  As Shoop count holder I should be able to login with my email and password

  Scenario: Login as shoop member

    Given I go to shoop home Page
    When I click on the login link
    And I enter my username
    And I enter my password
    And I click on the login button


  Scenario: Validate User Account Signout

    When I click on the signout link
    Then I should be logged out of my account