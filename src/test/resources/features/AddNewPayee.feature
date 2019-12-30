Feature: Add new payee under pay bills


  Background: Login and navigation to add payee
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Pay Bills"
    Then the user accesses the "Add New Payee" tab


  @addPayee
  Scenario: add new payee
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
