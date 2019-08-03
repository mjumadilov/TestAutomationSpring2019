package com.cybertek.tests.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class LocatorsPracticeClassName {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
        test1();

          }

    public static void test1(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com");

        List<WebElement> list = driver.findElements(By.className("list-group-item"));

        //  System.out.println(list.size());
        for(WebElement element: list){
            System.out.println(element.getText());

        }
        driver.quit();

    }

}
