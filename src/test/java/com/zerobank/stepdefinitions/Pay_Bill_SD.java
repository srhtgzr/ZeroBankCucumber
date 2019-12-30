package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBills;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Pay_Bill_SD {

    PayBills payBills = new PayBills();

    @Then("user navigates to Pay Bills")
    public void user_navigates_to_Pay_Bills() {
        payBills.getPayBillsTab();
    }

    @Then("user enters {string} for amount box, {string} for date box, {string} for description box and pay")
    public void userEntersForAmountBoxForDateBoxForDescriptionBoxAndPay(String arg0, String arg1, String arg2) {

        payBills.amountBox.sendKeys(arg0);

        payBills.datebox.sendKeys(arg1);

        payBills.descriptionBox.sendKeys(arg2);

        payBills.submitButton.submit();


    }

    @And("user verifies that {string} message is displayed in PayBillsPage")
    public void userVerifiesThatMessageIsDisplayedInPayBillsPage(String arg0) {

        Assert.assertEquals(arg0, payBills.paymentSuccessfulAlert.getText());
    }

    @And("user verifies that {string} tooltip is displayed in PayBillsPage")
    public void userVerifiesThatTooltipIsDisplayedInPayBillsPage(String arg0) {

        Assert.assertEquals(arg0, payBills.toolTip());
    }
}
