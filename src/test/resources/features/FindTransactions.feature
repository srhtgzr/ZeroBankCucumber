Feature: Find Transactions in Account Activity

  Background: Log in to zerobank
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Account Activity"

  @DateRange
  Scenario: Search date range
    Given the user accesses the "Find Transactions" tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates from "2012-09-01" to "2012-09-06"
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates from "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"

  @DecriptionONLINEOFFICE

  Scenario: Search description

    Given the user accesses the "Find Transactions" tab
    When the user enters description "ONLINE"
    And clicks search
    Then results only show descriptions containing "ONLINE"
    When the user enters description "OFFICE"
    And clicks search
    Then results only show descriptions containing "OFFICE"
    But results table should not show descriptions containing "ONLINE"

  @Descriptiononline

  Scenario: Search description case sensitive

    Given the user accesses the "Find Transactions" tab
    When the user enters description "ONLINE"
    And clicks search
    Then results only show descriptions containing "ONLINE"
    When the user enters description "online"
    And clicks search
    And "No results." is shown as a result


  @Type
  Scenario: Type
    Given the user accesses the "Find Transactions" tab
    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type "Deposit"
    And clicks search
    Then results table should show at least one result under Deposit
    But results table should show no result under Withdrawal
    When user selects type "Withdrawal"
    And clicks search
    Then results table should show at least one result under Withdrawal
    But results table should show no result under Deposit










