Feature: Stockbit Academy Module

  Scenario: User should be able to access another module
    Given Go to Stockbit Academy page
    And Select first module
    And Click explore modules icon
    And Explore modules is displayed
    When Click any other modules
    Then Other module page should be displayed properly
    And Close browser


  Scenario: User should be able to navigate to next lesson on chapter page
    Given Go to Stockbit Academy page
    And Select first module
    And Click any chapter on module page
    When Click next lesson on chapter page
    Then User redirected to the next lesson
    And Close browser
