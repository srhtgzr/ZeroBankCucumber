Feature: Account Activity

  @pageTitle_AccountActivity
  Scenario: Verify page title
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Account Activity"
    And user verifies that "Zero - Account Activity" is displayed


  @DefaultDropDown
  Scenario: Verify Savings is selected as a default option
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Account Activity"
    Then user verifies that "Savings" selected as default option

  @DropDownOptions
  Scenario: DropDOwn options are as listed below
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Account Activity"
    And verify following dropdown options are displayed
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  @transactionTable
  Scenario: DropDOwn options are as listed below
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Account Activity"
    And verify following table head options are displayed
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |



