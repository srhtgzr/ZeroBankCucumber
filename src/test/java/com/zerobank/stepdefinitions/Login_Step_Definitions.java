package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_Step_Definitions {

    LoginPage loginPage = new LoginPage();

    String username = ConfigurationReader.getProperty("username");

    String password = ConfigurationReader.getProperty("password");

    String expectedError = "Login and/or password are wrong.";

    @Given("user is on login page")
    public void user_is_on_login_page() {

        String url = ConfigurationReader.getProperty("url");

        Driver.get().get(url);


    }

    @Then("user logs in as authorized user")
    public void user_logs_in_as_authorized_user() {


        loginPage.login(username, password);

    }

    @Then("user verifies that {string} is displayed")
    public void user_verifies_that_is_displayed(String string) {

        String title = Driver.get().getTitle();
        Assert.assertEquals(string, title);


    }


    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.login(string, string2);


    }

    @Then("user provides {string} username and {string} password")
    public void user_provides_username_and_password(String string, String string2) {

        loginPage.login(string, string2);
    }


    @Then("user puts {string} username and {string} password")
    public void userPutsUsernameAndPassword(String arg0, String arg1) {

        loginPage.login(arg0, arg1);
    }

    @Then("user type {string} username and {string} password")
    public void userTypeUsernameAndPassword(String arg0, String arg1) {
        loginPage.login(arg0, arg1);

    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {

        Assert.assertEquals(string, loginPage.errorMessage.getText());
    }


}