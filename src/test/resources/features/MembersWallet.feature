@MemberWallet
Feature: As a user
  I want to validate the wallet page is up and running
  So users can navigate to their and withdraw funds

<<<<<<< HEAD
  Background:
    Given user is logged in
=======
  Background: loging into shoop home page
  
       Given user is logged in
  
  Scenario: Validating wallet pages
    
>>>>>>> refs/heads/shoopdevelop
    When I click on a member my activity link
    Then I should be on the my activity page
<<<<<<< HEAD
  Scenario: Users navigates to the payment page
    Given I click on the  my payments  tab link
=======
    When I click on the  my payments  tab link
>>>>>>> refs/heads/shoopdevelop
    Then I should see transactions in my wallet
<<<<<<< HEAD
    Then I should see the wallet available "60" balance
    Given I have balance more than 10 euros
=======
   # Then I should see the wallet available "60" balance
   # Given I have balance more than 10 euros
>>>>>>> refs/heads/shoopdevelop




