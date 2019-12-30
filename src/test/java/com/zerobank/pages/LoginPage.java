package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "signin_button")

    public WebElement singinButtonHomePage;

    @FindBy(id = "user_login")

    public WebElement userNameInput;

    @FindBy(id = "user_password")

    public WebElement passwordInput;

    @FindBy(css = "[value='Sign in']")

    public WebElement signInButton;

    @FindBy(css = "[class='alert alert-error']")

    public WebElement errorMessage;

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    public void login(String username, String password) {

        singinButtonHomePage.click();
        BrowserUtils.waitForVisibility(userNameInput, 5);

        userNameInput.sendKeys(username);

        passwordInput.sendKeys(password, Keys.ENTER);
    }


}
