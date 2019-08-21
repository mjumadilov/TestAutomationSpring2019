package com.cybertek.MyPractice;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Testing {

    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        driver.manage().window().maximize();

    }
}