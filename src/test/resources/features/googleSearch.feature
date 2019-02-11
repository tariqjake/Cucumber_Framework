
Feature:  Google search feature

  @gogo
  Scenario: Making sure google search is working as expected

    Given User is on the google homepage
    And User puts flowers into search engine
    When User clicks search button
    Then User should see results related to flowers

