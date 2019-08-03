package com.cybertek.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();//setup driver
        WebDriver driver = new ChromeDriver(); // create object of chrome driver
        driver.manage().window().maximize(); //manage and maximize window
        driver.get("http://practice.cybertekschool.com/forgot_password");// open URL

        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement submitButton = driver.findElement(By.id("form_submit"));
      //  driver.findElement(By.name("email")).click();  another option

        emailInputBox.sendKeys("email@gmail.com"); //keysToSend did not show up
        Thread.sleep(2000);

        submitButton.click();
        Thread.sleep(2000);


        WebElement conformationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = conformationMessage.getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected message: "+ expectedMessage);
            System.out.println("Actual message: "+actualMessage);
        }

        driver.close();


    }
}
//https://github.com/MuhtarMahmut/Generate_Gmails