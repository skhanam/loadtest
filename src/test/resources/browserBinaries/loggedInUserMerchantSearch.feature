@smoke-test
Feature: Search


  Background: Login user

    Given I go to "http://www.shoop.fr/"
    When  I click on the login button
    And I enter my username and password

    Scenario: confirm shoop member is logged in
    Then I should be logged in

