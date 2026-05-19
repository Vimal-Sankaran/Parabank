package org.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.parabank.utilities.BaseClass;

public class AccountOverviewPage extends BaseClass {

    public WebDriver driver;
    public AccountOverviewPage(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//table[@id='accountTable']//a")
    private WebElement firstAccount;

    public void openFirstAccount() {
        clickOnElement(firstAccount);
    }

}
