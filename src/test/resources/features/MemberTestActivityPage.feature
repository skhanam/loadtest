@MemberActivity

Feature: Testing login to my shoop member account and edit details

  As Shoop count holder I should be able to login with my email and password

  Background: Shoop member Login

    Given user is logged in


  Scenario: Validate member area tabs

    And I click on a member my activity link
    Then I should be on the my activity page
    And I click on the  my payments  tab link
    Then I should verify the title of the page as "Paiement | Shoop - Le Meilleur du Cashback & du Code Promo"
    And I click on the signout link

    
    
  Scenario: General setting tab
    
    And I click on a member my activity link
    And I click on the setting link
    Then I should see the  edit emaillink
   And I click on the signout link
 

  Scenario: Validate User Account Signout

    Given I click on a member my activity link
    And I click on the signout link
    Then I should be logged out of my account
    


