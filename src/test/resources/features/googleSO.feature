@googleSO
Feature: Google search feauture

  Scenario Outline: Testing the search function

    Given User is on the google homepage
    When user enters "<searchValue>"
    Then User should see "<searchValue>" in the title

    Examples: Test data for google search functionality

    |searchValue|
    |flower     |
    |cars       |
    |trucks     |