Feature: login functionality


  Background: user on the login page
    Given user on the login page

  @wip
  Scenario: teacher login
    # use login info of a teacher
    When user logs in using "myemail@hotmail.com" and "mysecurepassword"
    Then homepage should be displayed
    And title should be "homepage "
    And there should be 44 menu options


  Scenario: team leader login
    # use the login info of a team lead
    When user logs in using "myemail@gmail.com" and "regularpassword"
    Then homepage should be displayed
    And title should be "homepage"