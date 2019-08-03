package com.cybertek.tests.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class WarmUp {

static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://amazon.com");


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("drone");
        driver.findElement(By.className("nav-input")).click();

        Thread.sleep(10000);

        if(driver.getTitle().contains("drone")){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }


    }

}
