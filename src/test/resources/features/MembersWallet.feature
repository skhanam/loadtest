@MemberWallet
Feature: As a user
  I want to validate the wallet page is up and running
  So users can navigate to their and withdraw funds


  Background: loging into shoop home page
  
       Given user is logged in

  Scenario: Validating wallet pages


    When I click on a member my activity link
    Then I should be on the my activity page
    When I click on the  my payments  tab link
    Then I should see transactions in my wallet
   # Then I should see the wallet available "60" balance
   # Given I have balance more than 10 euros





