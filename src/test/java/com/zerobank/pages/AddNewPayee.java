package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPayee {

    public AddNewPayee() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement account;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addANewPayee;

    @FindBy(xpath = "//*[text()='The new payee The Law Offices of Hyde, Price & Scharks was successfully created.']")
    public WebElement successfulPayee;


}
