package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected static WebDriver driver ;

     static {
         System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://www.i.ua");
     }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
