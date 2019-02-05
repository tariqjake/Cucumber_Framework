Feature: Amazon Title
  @Amazon
  Scenario: Amazon Title verification
    When user goes to amazon website
    Then verify it contains the word Amazon

  @Amazon
    Scenario: Amazon url verification
      When user goes to amazon website
      Then validate the url