@CreateSupportTicket

Feature: Users creates a support ticket

  As a user
  I want to validate users are able to log into zendesk helpdesk
  and create a support ticket
  Background: Login a member
    Given I go to shoop home Page
    When I click on the login link
    And I enter my username
    And I enter my password
    And I click on the login button

  Scenario: Go to user zendesk portal
    When I click on the 'Aide' link in the top right hand corner
    Then the user should be transferred with SSO into their own zendesk portal

