#Author: your.email@your.domain.com
#Key

Feature: Login into leaftaps application 


  Scenario: TC01_Login into application using valid username and password
    Given Browser launched sucessfully
    When enter the username as  "DemoSalesManager"
    And enter the password as "crmsfa"
    And click on submit button
    Then user should be able to login sucessfully 
    
   Scenario: TC02_Login into application using Invalid username and password
    Given Browser launched sucessfully
    When enter the username as  "DemoSalesManag1er"
    And enter the password as "crmsf1a"
    And click on submit button
    Then user should  not be able to login sucessfully 
 