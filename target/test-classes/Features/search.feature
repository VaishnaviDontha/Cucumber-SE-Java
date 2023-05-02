Feature: Search Functionality of Google website in chrome browser

  Scenario: Validate search functionality is working on google website
    Given Launch Browser
    And User is on google search page
    When User enters text in search bar
    And User hits enter
    Then User must be navigated to respective search results page