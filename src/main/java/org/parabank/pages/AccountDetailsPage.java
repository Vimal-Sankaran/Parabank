package org.parabank.pages;

import org.parabank.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage extends BaseClass {

    public WebDriver driver;

    public AccountDetailsPage(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    /*
     * Account Number
     */
    @FindBy(id = "accountId")
    private WebElement accountNumber;

    /*
     * Account Type
     */
    @FindBy(id = "accountType")
    private WebElement accountType;

    /*
     * Balance
     */
    @FindBy(id = "balance")
    private WebElement balance;

    /*
     * Available Balance
     */
    @FindBy(id = "availableBalance")
    private WebElement availableBalance;

    /*
     * Getters
     */
    public String getAccountNumber() {
        return getElementText(accountNumber);
    }

    public String getAccountType() {
        return getElementText(accountType);
    }

    public String getBalance() {
        return getElementText(balance);
    }

    public String getAvailableBalance() {
        return getElementText(availableBalance);
    }
}