Feature:Account Types

  @PageTitle
  Scenario: Verify page title
    Given user is on login page
    Then user logs in as authorized user
    And user verifies that "Zero - Account Summary" is displayed

  @Account_Types
  Scenario: Account Types
    Given user is on login page
    Then user logs in as authorized user
    And verify following account types are displayed
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |












