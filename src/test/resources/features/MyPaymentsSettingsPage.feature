@MyPayementsPage

Feature: Member updates account details

  Background: Shoop member Login
    Given user is logged in

  Scenario: Validate member update details
    Given I click on a member my activity link
    Then I should be on the my activity page
    And I click on the setting link
    And I click on the banking information link
     When I click on modify link for payment account
    And I enter my account number as "BESCPTPL"
    And I enter my sort as "FR7630066100410001057380116"
    And I enter my new email as "Tester"
    And I enter my new password as"testQA!12"
    And I click on account payment record button
    And I click on Yes to accept user account update terms and conditions
    Then I should see successfuly"Les modifications ont bien été effectuées" updated text

