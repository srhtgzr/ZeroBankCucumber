package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ForeignCurrency {

    public ForeignCurrency() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "purchase_cash")

    public WebElement purchaseButton;

    @FindBy(id = "pc_amount")

    public WebElement amountBox;

    public List<String> getCurrencyOptions() {


        BrowserUtils.waitForVisibility(currencyDropdown, 5);
        Select select = new Select(currencyDropdown);

        List<WebElement> availableOptions = new ArrayList<>();

        availableOptions = select.getOptions();

        availableOptions.remove(0);

        List<String> str = BrowserUtils.getListOfString(availableOptions);

        return str;
    }

}
