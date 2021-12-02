package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");


    public void clickOnAddCustomerTab() {
        doClickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        doClickOnElement(openAccountTab);
    }

}







