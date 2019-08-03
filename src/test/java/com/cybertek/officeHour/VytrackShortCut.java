package com.cybertek.officeHour;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackShortCut {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{

        driver.manage().window().maximize();
        driver.get("http://qa1.vytrack.com/user/login");
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager255");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("fa-share-square")).click();
      //  driver.findElement(By.linkText("See full list")).click();
      //  driver.findElement(By.linkText("Opportunities")).click();

    }


}
