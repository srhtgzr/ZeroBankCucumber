package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummary extends BasePage {

    LoginPage loginPage = new LoginPage();

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//table[@class='table']//thead//tr//th")

    public List<WebElement> tableheads;

    public AccountSummary() {

        PageFactory.initElements(Driver.get(), this);
    }


    public List<String> getColumnNames() {


        return BrowserUtils.getListOfString(accountTypes);
    }


}









