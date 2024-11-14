
Feature: Create user using salesforce application


  @assignments
  Scenario: TC_01 Verify user is able to create a account
 Given Login into the application 
 And Click on toggle menu button from the left corner
 And Click view All and click Sales from App Launcher
 And Click on Accounts tab
 When I Click on New button
 And Enter "Karthi" as account name
 And Select Ownership as Public
 Then Click save 
 And verify Account name 

