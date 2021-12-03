package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amountToDeposit = By.cssSelector("input[placeholder='amount']");
    By depositButton = By.cssSelector("button[type='submit']");
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountToBeWithdrawn = By.xpath("(//input[@placeholder='amount'])[1]");
    By transactionSuccessfulMessage = By.xpath("//span[@class='error ng-binding']");
    By submitWithdrawalButton = By.cssSelector("button[type='submit']");

    public void clickOnDepositTab(){
        doClickOnElement(depositTab);
    }

    public void enterAmountToDeposit(String depositAmount){
        doSendTextToElement(amountToDeposit, depositAmount);
    }

    public void clickOnDepositButton(){
        doClickOnElement(depositButton);
    }

    public void clickOnWithdrawlButton(){
        doClickOnElement(withdrawalButton);
    }

    public void enterAmountToBeWithdrawn(String withdrawAmount){
        doSendTextToElement(amountToBeWithdrawn,withdrawAmount );
    }

    public void verifyTheDepositTransactionSuccessfulMessage(){
        verificationMethodUsingWait("Deposit Successful", transactionSuccessfulMessage, 100);
    }

    public void clickOnWithdrawalSubmitButton(){
        doClickOnElement(submitWithdrawalButton);
    }

    public void verifyTheWithdrawalTransactionSuccessfulMessage(){
        //verificationMethodUsingWait("Transaction Successful", transactionSuccessfulMessage, 100);
    }
}
