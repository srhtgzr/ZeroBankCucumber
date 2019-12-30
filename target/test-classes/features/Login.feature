@all
Feature: Login

  @authorized_user
  Scenario: Login as authorized user
    Given user is on login page
    Then user logs in as authorized user
    And user verifies that "Zero - Account Summary" is displayed

  @wrong_password
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on login page
    Then user enters "username" username and "wrong" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @wrong_username
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on login page
    Then user enters "wrong" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @blank_username
  Scenario: Verify that warning message is displayed when username is empty
    Given user is on login page
    Then user enters "" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @blank_password
  Scenario: Verify that warning message is displayed when password is empty
    Given user is on login page
    Then user enters "username" username and "" password
    And user verifies that "Login and/or password are wrong." message is displayed

