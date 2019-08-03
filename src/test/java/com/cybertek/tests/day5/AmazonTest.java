package com.cybertek.tests.day5;
import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class AmazonTest {
    static  WebDriver driver = BrowserFactory.getDriver("chrome");


    public static void main(String[] args) throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("drone");
        driver.findElement(By.className("nav-input")).click();

        Thread.sleep(10000);
       driver.quit();
    }

}

