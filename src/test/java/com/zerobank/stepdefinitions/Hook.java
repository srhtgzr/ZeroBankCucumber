package com.zerobank.stepdefinitions;


import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {


    @Before
    public void setup() {

        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown() {

        Driver.close();
    }

}
