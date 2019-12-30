Feature: Navigating to specific accounts in Accounts Activity

  @NavigateSavings
  Scenario: Savings account redirect
    Given user is on login page
    Then user logs in as authorized user
    Then user redirects to "Savings" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" is displayed
    And user verifies that "Savings" selected as default option


  @NavigateBrokerage
  Scenario: Brokerage account redirect
    Given user is on login page
    Then user logs in as authorized user
    Then user redirects to "Brokerage" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" is displayed
    And user verifies that "Brokerage" selected as default option


  @NavigateChecking
  Scenario: Checking account redirectGiven user is on login page
    Given user is on login page
    Then user logs in as authorized user
    Then user redirects to "Checking" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" is displayed
    And user verifies that "Checking" selected as default option

  @NavigateCreditCard
  Scenario: Checking account redirectGiven user is on login page
    Given user is on login page
    Then user logs in as authorized user
    Then user redirects to "Credit Card" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" is displayed
    And user verifies that "Credit Card" selected as default option

  @NavigateLoan
  Scenario: Checking account redirectGiven user is on login page
    Given user is on login page
    Then user logs in as authorized user
    Then user redirects to "Loan" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" is displayed
    And user verifies that "Loan" selected as default option

