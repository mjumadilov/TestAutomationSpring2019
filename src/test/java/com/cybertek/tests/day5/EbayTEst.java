package com.cybertek.tests.day5;
import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EbayTEst {

   static  WebDriver driver = BrowserFactory.getDriver("chrome");


    public static void main(String[] args) throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("drone");
        driver.findElement(By.id("gh-btn")).click();
        String results = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(results);

        Thread.sleep(10000);
        driver.quit();
    }

}