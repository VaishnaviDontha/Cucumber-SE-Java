Feature: Login Funtionality tests using Data Driven Testing

  Scenario Outline: Check login is successful
    Given User must navigate to the respective Browser
    And User navigates to Login Page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is navigated to the homepage or views "<errorMessage>"

    Examples:
      | username | password | errorMessage |
      | uname | password  | Invalid credentials |
