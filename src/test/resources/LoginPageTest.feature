Feature: Stockbit Login Page

  Scenario: Login Page should be displayed properly
    Given Go to Stockbit URL
    When Click on login page
    Then Verify login page is displayed properly
    And Close browser


  Scenario: User should be able to input username and password on Login Page
    Given Go to Stockbit URL
    When Click on login page
    Then User able to input username and password successfully
    And Close browser

  Scenario: Login fail alert should be displayed when user input invalid field on login page
    Given Go to Stockbit URL
    When Click on login page
    And User able to input username and password successfully
    And Click on login button
    Then Login fail alert is displayed
    And Close browser