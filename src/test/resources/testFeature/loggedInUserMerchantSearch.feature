@ignore
Feature: Search


 Scenario: login with valid details

    Given I go to "http://www.shoop.fr/"
    When  I click on the login button
    And I enter my username and password
    Then I should be logged in

 # Scenario: log out user
  #  Given I am currently signed out

  #Scenario: login with valid details
  #  Given I go to "http://www.shoop.fr/"
   # When  I click on the login button
 #   And I enter my username and an incorrect password
 #   Then I should not be logged in


