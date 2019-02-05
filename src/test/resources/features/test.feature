Feature: This is my first Feature
  # Whatever the comment here
  @Google
  Scenario: Google search scenario
    When user goes to google application
    Then user should searches for apple
    And user should see apple related results