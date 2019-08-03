package com.cybertek.MyPractice;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorPracticeXpath {
    public static void main(String[] args) throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println(dropdown.getText());
        dropdown.click();
        Thread.sleep(2000);
        driver.close();
    }
}
