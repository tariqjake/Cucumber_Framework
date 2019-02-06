@amazonSearch
Feature: Amazon search feature

  Scenario: Amazon search test

    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to search button
    Then User should see headphones in results
