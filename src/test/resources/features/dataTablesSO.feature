@dataTableSO
Feature: Testing datatable website

  Scenario Outline: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstname "<firstname>"
    And User should enter lastname "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary <salary>
    Then User should click to create button
    And User searches first name "<firstname>" in search Box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for data tables

      |firstname|lastname|position|office|extension|date      |salary|
      |john     |Doe     |retired |london|314      |2019-04-12|125000|
      |tarik    |Jake|player  |izmir |210      |2020-10-11|85000 |
      |omer     |Can     |teacher |dallas|910      |2019-05-07|95000 |