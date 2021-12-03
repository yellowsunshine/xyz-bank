package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.Test;

public class BankTest extends TestBase {

    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    String firstName = "Harry";
    String lastName = "Potter";
    String fullName = firstName + " " + lastName;
    String postCode = "HA7 6JJ";
    String depositAmount = "100";
    String withdrawalAmount = "50";



    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        //enter FirstName
        addCustomerPage.enterFirstName(firstName);
        //enter LastName
        addCustomerPage.enterLastName(lastName);
        //enter PostCode
        addCustomerPage.enterCustomersPostCode(postCode);
        //click On "Add Customer" Button
        addCustomerPage.clickOnTheAddCustomerButton();
        // popup display
        //verify message "Customer added successfully"
        addCustomerPage.getTextFromAlertAndVerifyIt();
        //click on "ok" button on popup.
        addCustomerPage.clickOnOKButtonOfTheAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        // click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
        // Search customer that created in first test
        openAccountPage.searchForTheCustomerByName(fullName);
        // Select currency "Pound"
        openAccountPage.selectPoundAsCurrencyChoice();
        // click on "process" button
        openAccountPage.clickOnTheProcessButton();
        // popup displayed
        // verify message "Account created successfully"
        openAccountPage.getAPartOfTextFromAlertAndVerifyIt();
        // click on "ok" button on popup.
        openAccountPage.doAcceptAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        //search customer that you created.
        customerLoginPage.selectYourNameFromDropDown(fullName);
        //click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
        //verify "Logout" Tab displayed.
        customerLoginPage.verifyTheLogOutButton();
        //click on "Logout"
        customerLoginPage.clickOnLogOutButton();
        //verify "Your Name" text displayed.
        customerLoginPage.verifyYourNameLabel();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        // click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        // search customer that you created.
        customerLoginPage.selectYourNameFromDropDown(fullName);
        // click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
        // click on "Deposit" Tab
        customersPage.clickOnDepositTab();
        // Enter amount 100
        customersPage.enterAmountToDeposit(depositAmount);
        // click on "Deposit" Button
        customersPage.clickOnDepositButton();
        // verify message "Deposit Successful"
        customersPage.verifyTheDepositTransactionSuccessfulMessage();

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {

        // click on "Customer Login" Tab
        homePage.clickOnCustomerLoginButton();
        // search customer that you created
        customerLoginPage.selectYourNameFromDropDown(fullName);
        // click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
        //make a deposit before withdrawal
        customersPage.clickOnDepositTab();
        // Enter amount 100
        customersPage.enterAmountToDeposit(depositAmount);
        // click on "Deposit" Button
        customersPage.clickOnDepositButton();
        // go back to home page
        homePage.clickOnHomeButton();
        //click on customer login Button
        homePage.clickOnCustomerLoginButton();
        //search the customer you created
        customerLoginPage.selectYourNameFromDropDown(fullName);
        // click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
        // click on "Withdrawal" Tab
        customersPage.clickOnWithdrawlButton();
        //customersPage.clickOnWithdrawlButton();
        // Enter amount 50
        customersPage.enterAmountToBeWithdrawn(withdrawalAmount);
        // click on "Deposit" Button
        customersPage.clickOnWithdrawalSubmitButton();
        // verify message "Transaction Successful"
        customersPage.verifyTheWithdrawalTransactionSuccessfulMessage();

    }
}
