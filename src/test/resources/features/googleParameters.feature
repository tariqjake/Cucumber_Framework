@googleParams
Feature: Google search functionality

  Scenario: Testing google search
    Given User is on the google homepage
    When user enters "flowers"
    Then User should see "flowers" in the title
