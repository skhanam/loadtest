#@smoke-testA

#@UpdateUserDetails
@ignore
Feature: Testing login to my shoop member account and edit details

  As Shoop count holder I should be able to login with my email and password

  Background: Shoop member Login

    Given I go to shoop home Page
    When I click on the login link
    And I enter my username
    And I enter my password
    And I click on the login button
    Then I should be logged in to my account


  Scenario: Validate member area tabs

    Given I click on a member my activity link
    Then I should be on the my activity page
    And I click on the  my payments  tab link
    Then i should  see  the your balance on payments page

    Scenario: General setting tab
    And I click on the setting link
    Then I should see the  edit emaillink

   Scenario: Search a merchant
     When I enter merchant name "Groupon" in the search field
     And click on the search result
     Then I should be on shoop merchant page

  Scenario: Validate User Account Signout

    When I click on the signout link
    Then I should be logged out of my account
