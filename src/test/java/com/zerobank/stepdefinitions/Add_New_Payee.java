package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayee;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class Add_New_Payee {

    AddNewPayee addNewPayee = new AddNewPayee();


    @Then("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> dataTable) {

        BrowserUtils.waitForVisibility(addNewPayee.payeeName, 5);
        addNewPayee.payeeName.sendKeys(dataTable.get("Payee Name"));

        addNewPayee.payeeAddress.sendKeys(dataTable.get("Payee Address"));

        addNewPayee.account.sendKeys(dataTable.get("Account"));

        addNewPayee.payeeDetails.sendKeys(dataTable.get("Payee details"));

        addNewPayee.addANewPayee.submit();

        BrowserUtils.waitForVisibility(addNewPayee.successfulPayee, 5);

        String actual = addNewPayee.successfulPayee.getText();

        String expected = "The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";

        Assert.assertEquals(expected, actual);


    }


}
