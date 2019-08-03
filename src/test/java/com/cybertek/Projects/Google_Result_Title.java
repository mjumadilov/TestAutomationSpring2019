package com.cybertek.Projects;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Result_Title {



    /*1.Open browser
    2.Go to https://google.com
    3. Search for one of the strings the list
    searchStrs given below
    4.In the results pages, capture the url right below the first results
    5.Click on the first result
    6.Verify that url is equal to the value from step 4
    7.Navigate back
    8.Repeat the same steps for all search items in the list*/



    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("searchStrs");
        driver.findElement(By.xpath("//input[@name='q']")).click();


    }
}
