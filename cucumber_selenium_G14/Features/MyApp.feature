Feature: Test for CIS (cis.del.ac.id)

	Scenario: Test Login with Valid Credentials
		Given open chrome and start application
		When I enter valid username and valid password
		Then I can login succesfully