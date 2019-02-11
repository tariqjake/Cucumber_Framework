
@amazon
Feature: Amazon Title

  Background: User is on the amazon homepage
    When user goes to amazon website

  Scenario: Amazon Title verification

    Then verify it contains the word Amazon

    Scenario: Amazon url verification
      Then validate the url