#Author: your.email@your.domain.com
#Key
@tag
Feature: Login into leaftaps application 


  @tag1
  Scenario: Login into application using valid username and password
    Given Browser launched sucessfully 
    And load the URL 
    When user login with valid username and password 
    And click on submkt button
    Then user should be able to login sucessfully 
  