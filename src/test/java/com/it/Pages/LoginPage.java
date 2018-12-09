package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


	@FindBy(xpath = "//input[@name='login']")
	private WebElement login;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pass;

	@FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
	private WebElement submit;






    public void login(String name, String password){
        login.sendKeys(name);
        pass.sendKeys(password);
        submit.click();
    }



}
