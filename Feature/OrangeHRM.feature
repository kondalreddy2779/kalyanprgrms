Feature: login and logout of orangeHRM
 
Scenario: verify login functionality
	Given the browser is launched and the url is navigated to 
	When we enter the username and password
	And click on the login button
	Then welcome admin msg displayed
	 
Scenario: verify logout functionality
	When we click on welcome admin
	And then click on logout
	Then home page url should be displayed
	