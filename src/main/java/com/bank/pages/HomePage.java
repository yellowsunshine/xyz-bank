package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginButton = By.xpath("//button[normalize-space()='Bank Manager Login']");
    By customerLoginButton = By.xpath("//button[contains(text(),'Customer Login')]");
    By homeButton = By.xpath("//button[contains(text(),'Home')]");


    public void clickOnBankManagerLoginTab(){
        doClickOnElement(bankManagerLoginButton);
    }

    public void clickOnCustomerLoginButton(){doClickOnElement(customerLoginButton);}

    public void clickOnHomeButton(){doClickOnElement(homeButton);}
}


