@Regression
@copycode


   Feature: As a user, I should be able to validate the copy code
          so that there is no regression for this scenario
          
          
       Background: As a logged in user
         Given user is logged in
         Then I should see a greeting message "Bonjour"
         
        Scenario: Validating copy code of merchant voucher
         
         When I enter merchant name in the search field
         And I click on Merchant name 
         And I click on view code option
         Then I should see copy option beside the code
       
          