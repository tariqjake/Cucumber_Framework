@dataTableParams
Feature: Testing datatable website

  Scenario: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstname "Shinji"
    And User should enter lastname "Yilmaz"
    And User should enter position "NBA player"
    And User should enter office "Paris"
    And User should enter extension "312"
    And User should enter start date "2019-02-10"
    And User should enter salary 124000
    Then User should click to create button
    And User searches first name "Shinji" in search Box
    Then User should see first name "Shinji" is inserted in the table