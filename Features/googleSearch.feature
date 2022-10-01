
Feature: Google search
  
  Scenario: Search results page displayed successfully when user searches any text on google
 		Given I am on the google search page
    When I enter any search keyword in search textbox
    And I click on search button
    Then I should be redirected to search results page
