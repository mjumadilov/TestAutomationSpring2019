package com.cybertek.tests.day4;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();//setup driver
        WebDriver driver = new ChromeDriver(); // create object of chrome driver
        driver.manage().window().maximize(); //manage and maximize window
        driver.get("http://practice.cybertekschool.com/forgot_password");// open URL

        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement submitButton = driver.findElement(By.id("form_submit"));

        Thread.sleep(3000);

        emailInputBox.sendKeys("sdetpro30000@gmail.com");



        System.out.println(emailInputBox.getAttribute("pattern"));
        System.out.println(emailInputBox.getAttribute("value"));

        submitButton.submit();

        Thread.sleep(3000);

        driver.close();
    }
}
