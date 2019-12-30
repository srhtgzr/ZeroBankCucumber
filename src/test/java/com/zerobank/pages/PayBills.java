package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills extends BasePage {

    public PayBills() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "pay_bills_tab")

    public WebElement payBillsTab;

    @FindBy(id = "sp_amount")

    public WebElement amountBox;

    @FindBy(id = "sp_date")

    public WebElement datebox;

    @FindBy(id = "sp_description")

    public WebElement descriptionBox;

    @FindBy(id = "pay_saved_payees")

    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='alert_content']/span")

    public WebElement paymentSuccessfulAlert;


    public void getPayBillsTab() {

        payBillsTab.click();
    }

    public String toolTip() {


        Actions action = new Actions(Driver.get());

        action.moveToElement(amountBox).build().perform();

        // BrowserUtils.wait(3);

        String message = Driver.get().findElement(By.name("amount")).getAttribute("required");


        // String actual = tooltip.getText();

        return message;
    }


}
