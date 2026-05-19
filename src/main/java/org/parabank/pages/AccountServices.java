package org.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.parabank.utilities.BaseClass;

public class AccountServices extends BaseClass {

    public WebDriver driver;
    public AccountServices(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Accounts Overview')]")
    private WebElement accountOverview;

    public void clickAccountOverview(){
        clickOnElement(accountOverview);
    }
}
