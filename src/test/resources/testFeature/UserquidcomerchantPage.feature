Feature: Signed member navigates to quidco merchant

  Scenario Outline: navigating to a merchant page

Given I am on "https://www.quidco.com"
When I sign in with my username and password
And I navigate to a merchant page"<MerchantUrl>"
Then I should get responses "<responses> containing status "<status>" message
And the response contains confirmation message

  Examples:
  |MerchantUrl                                                   | responses      |status   |
  |http://www.quidco.com/visit/2188/TDq/cashback/voucher/72763/  |      Success   |   302   |


#Background:
#    Given I am currently signed out
#
#  Scenario: Sign up with un-registered email address
#    When I navigate to the registration page on mvpbeta5
#    And I enter an email address that is not registered with Shoop
#    And I enter a password
#    And I tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should be taken to the logged in home page
#    And I should receive an activation email
#
#  Scenario: Sign up with email address already registered
#    When I navigate to the registration page
#    And I enter an email address that is already registered with Shoop
#    And I enter a password
#    And I tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should see an error message advising me that my email address is already registered
#
#  Scenario: Sign up and do not tick to agree to terms and conditions (not registered)
#    When I navigate to the registration page
#    And I enter an email address that is not registered with Shoop
#    And I enter a password
#    And I do not tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should see error message advising me to accept the terms and conditions
#
#  Scenario: Sign up and do not tick to agree to terms and conditions (already registered)
#    When I navigate to the registration page
#    And I enter an email address that is already registered with Shoop
#    And I enter a password
#    And I do not tick to agree to the terms and conditions of Shoop
#    And I press the register button
#    Then I should be presented with an error message advising me to accept the terms and conditions
#    And I should be presented with an error message advising me that my email address is already registered
