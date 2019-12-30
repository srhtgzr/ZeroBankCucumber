package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummary;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Account_Summary_SD {

    AccountSummary accountSummary = new AccountSummary();


    @Then("verify following account types are displayed")
    public void verify_following_account_types_are_displayed(List<String> dataTable) {

        Assert.assertEquals(dataTable, accountSummary.getColumnNames());

        System.out.println(accountSummary.getColumnNames());

    }
}
