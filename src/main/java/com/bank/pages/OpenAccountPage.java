package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By customerNameDropDown = By.xpath("//select[@id='userSelect']");
    By currencyDropDown = By.xpath("//select[@id='currency']");
    By processButton = By.cssSelector("button[type='submit']");


    public void searchForTheCustomerByName(String customerName) {
        doClickOnElement(customerNameDropDown);
        doSendTextToElement(customerNameDropDown, customerName);

    }

    public void selectPoundAsCurrencyChoice() {
        doSelectByIndex(currencyDropDown, 2);
    }
    public void clickOnTheProcessButton() {
        doClickOnElement(processButton);
    }


    public void getAPartOfTextFromAlertAndVerifyIt() {
        String actualAlertText = doGetTextFromAlert();
        String subString1 = actualAlertText.substring(0, 27);
        String expectedAlertText = "Account created successfully with account Number :1016";
        String subString2 = expectedAlertText.substring(0, 27);
        doVerifyElements(subString2, subString1, "Message has been displayed correctly");

    }

}

