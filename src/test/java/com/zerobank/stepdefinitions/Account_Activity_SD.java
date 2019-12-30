package com.zerobank.stepdefinitions;

import com.zerobank.pages.Account_Activity;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Account_Activity_SD {

    Account_Activity account_activity = new Account_Activity();

    @Then("user navigates to Account Activity")
    public void userNavigatesToAccountActivity() {

        account_activity.getAccountActivity();

    }


    @Then("user verifies that {string} selected as default option")
    public void userVerifiesThatSelectedAsDefaultOption(String arg0) {
        String actualDropdownSelection = account_activity.getdefaultdropdown();

        Assert.assertEquals(arg0, actualDropdownSelection);

    }

    @Then("verify following dropdown options are displayed")
    public void verify_following_dropdown_options_are_displayed(List<String> dataTable) {

        Assert.assertEquals(dataTable, account_activity.getDropDowns());
    }

    @Then("verify following table head options are displayed")
    public void verify_following_table_head_options_are_displayed(List<String> dataTable) {

        Assert.assertEquals(dataTable, account_activity.getTableHeadOptions());

    }


    @Then("user redirects to {string} link on the Account Summary page")
    public void userRedirectsToLinkOnTheAccountSummaryPage(String arg0) {

        account_activity.getAccountTypes(arg0);
    }

    @Then("user navigates to {string}")
    public void userNavigatesTo(String arg0) {

        account_activity.navigateTo(arg0);
    }
}
