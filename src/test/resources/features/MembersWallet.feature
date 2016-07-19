Feature: As a user
  I want to validate the wallet page is up and running
  So users can navigate to their and withdraw funds

  Background:
    Given user logged in
    When I click on a member my activity link
    Then I should be on the my activity page

  Scenario: Users navigates to the payment page
    Given I click on the  my payments  tab link
    Then I should see transactions in my wallet
    Then I should see the wallet available balance

  Scenario: User Account balance more than 10 Euros
    Given I have balance more than 10 euros
    Then I should see the withdraw cash button visible
