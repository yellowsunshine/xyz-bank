package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerTab = By.xpath("//button[@type='submit']");

    public void enterFirstName(String fName) {
        doSendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName){

        doSendTextToElement(lastName, lName);
    }

    public void enterCustomersPostCode(String pcode){
        doSendTextToElement(postCode, pcode);
    }

    public void clickOnTheAddCustomerButton(){
        doClickOnElement(addCustomerTab);
    }

    public void getTextFromAlertAndVerifyIt(){
        String actualAlertText = doGetTextFromAlert();
        String subString1 = actualAlertText.substring(0, 27);
        String expectedAlertText = "Customer added successfully with customer id: 6";
        String subString2 = expectedAlertText.substring(0, 27);
        doVerifyElements(subString2, subString1, "Message has been displayed correctly" );

    }

    public void clickOnOKButtonOfTheAlert(){
        doAcceptAlert();
    }
}
