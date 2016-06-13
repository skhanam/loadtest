@smoke-testA
Feature: Testing login to my shoop memeber account and edit details

  As Shoop count holder I should be able to login with my email and password

  Scenario: Login as shoop member

    Given I go to shoop home Page
    When I click on the login link
    And I enter my username and password
    And I click on the login button


  Scenario: Login to Myaccount

    Then I should be logged in to my account


  Scenario: Validate member area tabs
    Given I click on a member my activity link
    Then I should be on the my activity page
    And I click on the  my payments  tab link
    Then i should  see  the your balance on payments page
    And I click on the setting link
    Then I should see the  edit emaillink

   Scenario: Search a merchant
     When I enter merchant name "merchantName" in the search field
     Then I should see my search name in the search results
     And click on the merchant name
     Then I should be on shoop merchant page

  Scenario: Validate User Account Signout

    When I click on the signout link
    Then I should be logged out of my account
