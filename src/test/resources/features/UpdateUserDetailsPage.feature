@UpdateUserDetails

Feature: As a shoop member I should be able to edit personal details on general settings page

  Scenario: Member Login
    Given I am logged into shoop
    When I click on a member my activity link
    Then I should be on the my activity page
    And I click on the my account settings tab

  Scenario: A member is able to edit first and last names

    When I click on modifier link for member names
    And I enter a new first name as "Thadeus" and last name as"QATester"
    And I click on name record button
 #   Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed


  Scenario: A member is able to edit current email and password

    Given I click on modifier email modifier link
    When I enter my new email "quidcoqa@quidco.com" and enter email to confirm "quidcoqa@quidco.com"
    And I enter my new password as "testQA!12"
    And I click on email record button
   # Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed


  Scenario: A member is able to edit username

    Given i click on modify link for username
    When I enter my new username as "Quality"
    And I click on username record button
  #  Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed


#  Scenario:A member is able to edit gender to female
#
#    Given I click on the modify link for gender
#    When I click to select the "female" gender
#    And I click on gender record button
#    Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed

  Scenario: A member is able to edit gender to male

    Given I click on the modify link for gender
    When I click to select the "male" gender
    And I click on gender record button
   # Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed


  Scenario: A member is able to edit DOB

    Given i click on modify link for date of birth
    When I enter my new day of bith as"09"
    And I enter my month of as"09"
    And I enter and "1996"of birth as
    And I click on DOB record button
   # Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed

  Scenario: A member is able to edit post code

    Given I click on the modify link for Postcode
    When I enter my new post code as"75016"
    And I click on postcode record button
    #Then I should see details changed succefully message"Les modifications ont bien été effectuées" displayed


