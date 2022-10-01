
Feature: Login to saucedemo
  
  Scenario Outline: Testing all login scenarios
 		Given I am on the login page
    When I provide the  <username> and <password>
    And I click on login button
    Then I should be redirected to home page
    
  Examples: 
  
  |username 									|password			|
  |standard_user							|secret_sauce	|
  |locked_out_user						|secret_sauce	|
  |problem_user								|secret_sauce	|
  |performance_glitch_user		|secret_sauce	|
