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
    When I click on the aid link in the top right hand corner
    Then the user should be transferred with SSO into their own zendesk portal

  Scenario: directed user to a support article
    When I selects a support article "Qui-valide-mon-cashback"
    Then the user just be directed the this article

  Scenario:
    When I click on "Contacter le Service Client" link
    And I enter inserts the appropriate form with data
    And submit the form
    Then the user should get a confirmation that request has been sent

