package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By selectYourNameDropDown = By.id("userSelect");
    By customerLogInButton = By.cssSelector("button[type='submit']");
    By customerLogOutButton = By.xpath("//button[normalize-space()='Logout']");
    By yourNameLabel = By.xpath("//label[normalize-space()='Your Name :']");

    public void selectYourNameFromDropDown(String fullName){
        doSendTextToElement(selectYourNameDropDown, fullName);
    }

    public void clickOnTheLoginButton (){
        doClickOnElement(customerLogInButton);
    }

    public void verifyTheLogOutButton(){
        verificationMethodUsingWait("Logout", customerLogOutButton, 100);
    }

    public void clickOnLogOutButton(){
        doClickOnElement(customerLogOutButton);
    }

    public void verifyYourNameLabel(){
        verificationMethodUsingWait("Your Name :", yourNameLabel, 100);
    }




}
