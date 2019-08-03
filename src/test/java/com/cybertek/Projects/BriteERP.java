package com.cybertek.Projects;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BriteERP {
    public static void main(String[] args) throws Exception{

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://54.148.96.210/web/login");
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("in_manuf_user3@info.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("UUI98hgt52");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/web#menu_id=120&action=136']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='o_calendar_button_day btn btn-sm btn-default']")).click();
        Thread.sleep(3000);
      //  driver.close();


    }
}
