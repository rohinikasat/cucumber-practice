Feature: Check login functionality

  Scenario Outline: testing login
    Given user is on login page
    When user provides the  <username> and <password>
    And clicks on login button
    Then user is logged in

    Examples: 
  
  |username 									|password			|
  |standard_user							|secret_sauce	|
  |locked_out_user						|secret_sauce	|
  |problem_user								|secret_sauce	|
  |performance_glitch_user		|secret_sauce	|