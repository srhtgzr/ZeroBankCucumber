package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account_Activity extends BasePage {

    @FindBy(xpath = "//a[text()='Account Activity']")

    public WebElement accountActivityTab;


    @FindBy(id = "aa_accountId")

    public WebElement dropdown;

    @FindBy(xpath = "//table//thead//tr//th")

    public List<WebElement> tableHead;

    @FindBy(css = "[name='fromDate']")

    public WebElement fromDate;

    @FindBy(id = "aa_toDate")

    public WebElement toDate;

    @FindBy(css = "[type='submit']")

    public WebElement findButton;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(1)")

    public List<WebElement> datesFromTable;

    @FindBy(id = "aa_description")

    public WebElement descriptionBox;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(2)")

    public List<WebElement> onlineDataFromDescriptionBox;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(2)")

    public WebElement officeSupply;

    @FindBy(css = "[id='filtered_transactions_for_account'] div")

    public WebElement noResult;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(3)")

    public List<WebElement> depositResult;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(4)")

    public List<WebElement> withdrawalResult;

    @FindBy(id = "aa_type")

    public WebElement transactionDropDown;


    public Account_Activity() {

        PageFactory.initElements(Driver.get(), this);
    }


    public void getAccountActivity() {
        BrowserUtils.waitForVisibility(accountActivityTab, 5);
        accountActivityTab.click();

    }

    public String getdefaultdropdown() {

        Select select = new Select(dropdown);

        String str = select.getFirstSelectedOption().getText();

        return str;
    }

    public List<WebElement> getDropDownOptions() {

        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();

        return options;
    }

    public List<String> getDropDowns() {
        return BrowserUtils.getListOfString(getDropDownOptions());
    }

    public List<String> getTableHeadOptions() {

        List<WebElement> options = tableHead;
        List<String> str = new ArrayList<>();

        for (WebElement each : options) {

            String value = each.getText();

            str.add(value);
        }
        return str;
    }

    public void getAccountTypes(String accounts) {

        Driver.get().findElement(By.linkText(accounts)).click();
    }

    public void dateEntry(String date1, String date2) {

        fromDate.clear();

        fromDate.sendKeys(date1);

        toDate.clear();

        toDate.sendKeys(date2);

    }

    public void descriptionEntry(String description) {

        BrowserUtils.waitForVisibility(descriptionBox, 5);
        descriptionBox.clear();

        descriptionBox.sendKeys(description);

    }

    public void searchButton() {

        BrowserUtils.waitForVisibility(findButton, 5);
        findButton.submit();

        BrowserUtils.wait(2);
    }


    public static void main(String[] args) {

//        Driver.get().get("http://zero.webappsecurity.com/login.html");
//
//        Driver.get().findElement(By.id("user_login")).sendKeys("username");
//
//        Driver.get().findElement(By.id("user_password")).sendKeys("password");
//        Driver.get().findElement(By.cssSelector("[value='Sign in']")).click();


//
//
//    } Account_Activity

        Account_Activity account_activity = new Account_Activity();

        Driver.get().get("http://zero.webappsecurity.com/login.html");

        Driver.get().findElement(By.id("user_login")).sendKeys("username");

        Driver.get().findElement(By.id("user_password")).sendKeys("password");
        Driver.get().findElement(By.cssSelector("[value='Sign in']")).click();

        Driver.get().findElement(By.xpath("//a[text()='Account Activity']")).click();

        Driver.get().findElement(By.xpath("//*[text()='Find Transactions']")).click();

        account_activity.descriptionEntry("ONLINE");

        account_activity.searchButton();

        BrowserUtils.wait(3);


        List<String> str = new ArrayList<>();

        for (WebElement each : account_activity.onlineDataFromDescriptionBox) {

            str.add(each.getText());

            if (str.contains("ONLINE TRANSFER REF #UKKSDRQG6L")) {

                System.out.println("Online");
            }
        }


    }

//        System.out.println(str);
//
//        System.out.println(Driver.get().findElement(By.xpath("//*[@id=all_transactions_for_account]/table/thead/tr/th[1]")).getText());
//
//        List<WebElement> tablehad = Driver.get().findElements(By.xpath("//table[@class='table table-condensed table-hover']//tbody//tr[1]//td"));
//
//       for(WebElement each :tablehad){
////
////            System.out.println(each.getText());
////        }
//
//        Driver.get().quit();


//    }

}