Feature: Login
@SmokeTest
Scenario: Login to a hotel app
	Given I am on HotelApp login page
  When I want to give the username as "ashwiniaddepalli"
  And I want to give the password as "Y765N8"
  And I click on login button
  Then It should redirect to the hotel booking page
 
@E2ETest
Scenario: Click on to search page
Given I am on HotelApp login page
When I want to give the username as "ashwiniaddepalli"
And I want to give the password as "Y765N8"
And I click on login button
Then It should redirect to the hotel booking page
Given I am on the Search Hotel Page
When I want to give the location as "Sydney"
Then I want to click on search button