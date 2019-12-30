Feature: Purchase Foreign Currency

  Background: Login and navigation
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Pay Bills"
    Then the user accesses the "Purchase Foreign Currency" tab

  @Currencies
  Scenario: Available currencies
    Then following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  @NoCurrencyMessage
  Scenario: Error message for not selecting currency
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed

  @NoAmountMessage
  Scenario: Error message for not entering value
    When user tries to calculate cost without entering a value
    Then error message should be displayed