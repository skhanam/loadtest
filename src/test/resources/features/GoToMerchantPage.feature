
@GotoMerchantSite
  Feature: User clicks out of shoop to merchant site

  Scenario: login through the merchant site
   validate user is able to click out to merchant page
    Given I go to shoop home Page
    When I go to a merchant page "groupon"
    And I click on the cashback link Obtenir mon cashback
    Then I am prompted to login as shoop member
    And I click again on cashback
    Then the user is directed to the merchants home page "groupon"
    

#    Then I see results <merchantname>
#    Then I click on cashback of merchant
#    T
#    Then I Verify that i am logged in
#
#    Then Verify i that i am on merchant page
#    Then I accept the popup
#    Then Verify that merchant page is open



