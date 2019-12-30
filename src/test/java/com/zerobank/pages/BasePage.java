package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;

public class BasePage {

    public void navigateTo(String tab) {

        String tabLocator = "//a[text()='" + tab + "']";

        Driver.get().findElement(By.xpath(tabLocator)).click();
    }

    public void navigateSubTab(String subTab) {

        String subTabLocator = "//a[text()='" + subTab + "']";

        Driver.get().findElement(By.xpath(subTabLocator)).click();
    }
}
