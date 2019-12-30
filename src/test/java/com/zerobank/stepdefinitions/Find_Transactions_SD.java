package com.zerobank.stepdefinitions;

import com.zerobank.pages.Account_Activity;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Find_Transactions_SD {

    Account_Activity account_activity = new Account_Activity();

    @Given("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String string) {
        BrowserUtils.waitForPageToLoad(3);
        account_activity.navigateSubTab(string);


    }

    @When("the user enters date range from {string} to {string}")
    public void theUserEntersDateRangeFromTo(String arg0, String arg1) {
        BrowserUtils.waitForVisibility(account_activity.fromDate, 5);
        BrowserUtils.waitForPageToLoad(3);
        account_activity.dateEntry(arg0, arg1);

    }

    @When("clicks search")
    public void clicks_search() {

        account_activity.searchButton();
    }


    @Then("results table should only show transactions dates from {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesFromTo(String arg0, String arg1) {
        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.wait(3);
        for (WebElement each : account_activity.datesFromTable) {

            Assert.assertTrue(each.getText().compareTo(arg0) >= 0);

            Assert.assertTrue(each.getText().compareTo(arg1) <= 0);

        }


    }


    @And("the results table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String arg0) {
        for (WebElement each : account_activity.datesFromTable) {

            Assert.assertTrue(each.getText().compareTo(arg0) > 0);

        }
    }

    @When("the user enters description {string}")
    public void theUserEntersDescription(String arg0) {

        account_activity.descriptionEntry(arg0);
    }


    @Then("results only show descriptions containing {string}")
    public void resultsOnlyShowDescriptionsContaining(String arg0) {

        for (WebElement each : account_activity.onlineDataFromDescriptionBox) {

            boolean expected = each.getText().contains(arg0);

            Assert.assertTrue(expected);
            System.out.println(each.getText());
        }
    }

    @But("results table should not show descriptions containing {string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String arg0) {

        for (WebElement each : account_activity.onlineDataFromDescriptionBox) {

            boolean expected = each.getText().contains(arg0);

            Assert.assertFalse(expected);

            System.out.println(arg0);
        }
    }

    @And("{string} is shown as a result")
    public void isShownAsAResult(String arg0) {

        Assert.assertEquals(arg0, account_activity.noResult.getText());

        System.out.println(account_activity.noResult.getText());
    }

    @Then("results table should show at least one result under Deposit")
    public void resultsTableShouldShowAtLeastOneResultUnderDeposit() {

        List<String> str = BrowserUtils.getListOfString(account_activity.depositResult);

        Assert.assertTrue(str.size() >= 1);

        System.out.println(str);
    }

    @Then("results table should show at least one result under Withdrawal")
    public void resultsTableShouldShowAtLeastOneResultUnderWithdrawal() {

        List<String> str = BrowserUtils.getListOfString(account_activity.withdrawalResult);


        Assert.assertTrue(str.size() >= 1);

        System.out.println(str);

    }

    @When("user selects type {string}")
    public void userSelectsType(String arg0) {

        BrowserUtils.waitForVisibility(account_activity.transactionDropDown, 5);
        Select select = new Select(account_activity.transactionDropDown);

        select.selectByVisibleText(arg0);

    }

    @But("results table should show no result under Withdrawal")
    public void resultsTableShouldShowNoResultUnderWithdrawal() {

        List<String> str = BrowserUtils.getListOfString(account_activity.withdrawalResult);

        Assert.assertTrue(str.size() == 0);

        System.out.println("No result Withdrawal");
    }

    @But("results table should show no result under Deposit")
    public void resultsTableShouldShowNoResultUnderDeposit() {

        List<String> str = BrowserUtils.getListOfString(account_activity.depositResult);

        Assert.assertTrue(str.size() == 0);

        System.out.println("No result Deposit");
    }
}