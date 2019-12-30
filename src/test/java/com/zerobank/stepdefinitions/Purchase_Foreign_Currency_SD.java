package com.zerobank.stepdefinitions;

import com.zerobank.pages.ForeignCurrency;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Purchase_Foreign_Currency_SD {

    ForeignCurrency foreignCurrency = new ForeignCurrency();

    WebDriverWait wait = new WebDriverWait(Driver.get(), 5);

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> dataTable) {

        Assert.assertTrue(foreignCurrency.getCurrencyOptions().containsAll(dataTable));

    }


    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {

        BrowserUtils.waitForVisibility(foreignCurrency.amountBox, 5);

        foreignCurrency.amountBox.sendKeys("20");
        BrowserUtils.waitForVisibility(foreignCurrency.purchaseButton, 5);
        foreignCurrency.purchaseButton.submit();
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = Driver.get().switchTo().alert();

        alert.accept();


    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {

        BrowserUtils.waitForVisibility(foreignCurrency.currencyDropdown, 5);

        Select select = new Select(foreignCurrency.currencyDropdown);

        select.selectByIndex(4);

        foreignCurrency.purchaseButton.submit();

    }
}