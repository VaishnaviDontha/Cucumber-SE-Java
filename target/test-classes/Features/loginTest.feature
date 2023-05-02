Feature: Login Funtionality tests

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And User is on the login page
    When User enters valid username and password and clicks on Login button
    Then User must be able to navigate to the home page