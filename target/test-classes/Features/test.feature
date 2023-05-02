


Feature: To Verify Login Functionality

  Scenario: Check Login is successful with login credentials
    Given User is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to home page
