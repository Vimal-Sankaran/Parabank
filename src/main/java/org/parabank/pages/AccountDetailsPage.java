package org.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.parabank.utilities.BaseClass;

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
    private WebElement accountNo;

    /*
     * Account Type
     */
    @FindBy(id = "accountType")
    private WebElement acctType;

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
        return getElementText(accountNo);
    }

    public String getAccountType() {
        return getElementText(acctType);
    }

    public String getBalance() {
        return getElementText(balance);
    }

    public String getAvailableBalance() {
        return getElementText(availableBalance);
    }
}