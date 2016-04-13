@smoke-test1
Feature: Search


 Scenario: login with valid details

    Given I go to "http://www.shoop.fr/"
    When  I click on the login button
    And I enter my username and password
    Then I should be logged in
    And I click on merchant category "category"




   Scenario: log out user
   Given I am currently signed in
   Then I should be logged out




