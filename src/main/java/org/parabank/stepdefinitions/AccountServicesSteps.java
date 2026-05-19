package org.parabank.stepdefinitions;

import io.cucumber.java.en.Given;
import org.parabank.pages.AccountServices;
import org.parabank.utilities.BaseClass;

public class AccountServicesSteps extends BaseClass {

    AccountServices accountServices;
    public AccountServicesSteps(){
        accountServices = new AccountServices(driver);
    }

    @Given("I click on Account Overview in account services menu")
    public void clickAccountOverview(){
        accountServices.clickAccountOverview();
    }
}
