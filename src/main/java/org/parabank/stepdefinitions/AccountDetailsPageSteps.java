package org.parabank.stepdefinitions;

import io.cucumber.java.en.Then;
import org.parabank.helpers.Account;
import org.parabank.helpers.EntityHelper;
import org.parabank.helpers.ParabankData;
import org.parabank.pages.AccountDetailsPage;
import org.parabank.pages.AccountOverviewPage;
import org.parabank.utilities.BaseClass;

import java.util.List;

public class AccountDetailsPageSteps extends BaseClass {

    AccountOverviewPage overviewPage;

    AccountDetailsPage detailsPage;

    EntityHelper entityHelper;

    public AccountDetailsPageSteps() {
        overviewPage = new AccountOverviewPage(driver);
        detailsPage = new AccountDetailsPage(driver);
        entityHelper = new EntityHelper();
    }

    @Then("I capture default account details for customer {string}")
    public void captureAccountDetails(String id) throws InterruptedException {


        // Open account from table
        overviewPage.openFirstAccount();
        Thread.sleep(1000);
        // Capture account details
        Account account = new Account();
        account.setAccountNumber(
                detailsPage.getAccountNumber()
        );
        account.setAccountType(
                detailsPage.getAccountType()
        );
        account.setBalance(
                detailsPage.getBalance()
        );
        account.setAvailableBalance(
                detailsPage.getAvailableBalance()
        );
        // Read JSON
        List<ParabankData> allData =
                entityHelper.readJson();

        // Update customer
        for (ParabankData data : allData) {
            if (data.getId().equals(id)) {
                data.getAccounts().add(account);
            }
        }
        System.out.println(account);

        // Write JSON
        entityHelper.writeJson(allData);

        System.out.println(
                "Account Details Captured Successfully"
        );
    }
}