package com.cybertek.MyPractice;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsConcept {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://login.yahoo.com");
      //  driver.manage().window().maximize();
        //1. id:

//      WebElement username = driver.findElement(By.id("login-username"));
//      username.sendKeys("maro_mc405");
//      WebElement nextBtn = driver.findElement(By.id("login-signin"));
//      nextBtn.click();

//        driver.findElement(By.id("login-username")).sendKeys("maro_mc405");
//        driver.findElement(By.id("login-signin")).click();

// 2. name

//        driver.findElement(By.name("username")).sendKeys("maro_mc405");
//        driver.findElement(By.name("signin")).click();


    //3. xpath
//       driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("maro_mc405");
//       driver.findElement(By.xpath("//input[@id='login-signin']")).click();


       //4. cssSelector
//        driver.findElement(By.cssSelector("#login-username")).sendKeys("maro_mc405");
//        driver.findElement(By.cssSelector("#login-signin")).click();






    }
}
