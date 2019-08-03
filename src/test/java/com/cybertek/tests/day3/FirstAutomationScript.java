package com.cybertek.tests.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstAutomationScript {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://azattyk.org");
//        driver.manage().window().maximize();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver fire = new FirefoxDriver();
//        fire.get("http://azattyk.org");
//        fire.manage().window().maximize();
//
        WebDriver safa = new SafariDriver();
        safa.get("http://facebook.com");
        safa.manage().window().maximize();

    }

}
