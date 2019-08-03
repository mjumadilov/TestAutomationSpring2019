package com.cybertek.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;

public class Test2 {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();//setup driver
        WebDriver driver = new ChromeDriver(); // create object of chrome driver
        driver.manage().window().maximize(); //manage and maximize window
        driver.get("http://practice.cybertekschool.com/forgot_password");// open URL

        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement submitButton = driver.findElement(By.id("form_submit"));
        //  driver.findElement(By.name("email")).click();  another option

        Faker faker = new Faker();
        String name = faker.gameOfThrones().character().replace(" ", "").toLowerCase();
        Thread.sleep(3000);
        emailInputBox.sendKeys(faker.internet().emailAddress());
        Thread.sleep(3000);
        emailInputBox.clear();
        emailInputBox.sendKeys(name+"@gmail.com"+ Keys.ENTER); //"email@gmail.com", Keys.ENTER) also works;
//        emailInputBox.sendKeys(faker.funnyName()+"@gmail.com"+ Keys.ENTER); //"email@gmail.com", Keys.ENTER) also works;
        Thread.sleep(3000);

       driver.close();
    }
}
