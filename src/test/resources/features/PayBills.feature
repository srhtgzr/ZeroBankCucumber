Feature: Paybills

  @PageTitleVerf
  Scenario: Verify page title
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Pay Bills"
    And user verifies that "Zero - Pay Bills" is displayed

  @SuccessfulPayment
  Scenario: Verify successful payment
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Pay Bills"
    Then user enters "200" for amount box, "12/26/2019" for date box, "Gas Bills" for description box and pay
    And user verifies that "The payment was successfully submitted." message is displayed in PayBillsPage

  @NegativePayment1
  Scenario: Please fill out this field message! should be displayed.
    Given user is on login page
    Then user logs in as authorized user
    Then user navigates to "Pay Bills"
    Then user enters "" for amount box, "12/26/2019" for date box, "Gas Bills" for description box and pay
    And  user verifies that "Please fill out this field" tooltip is displayed in PayBillsPage





