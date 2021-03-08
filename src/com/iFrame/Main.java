package com.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // Set driver to Chrome

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yhoar\\OneDrive\\Desktop\\SeleniumDownloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


// Launch iFrame
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        Dimension size1 = driver.findElement(By.tagName("iframe")).getSize();

        driver.switchTo().frame("a077aa5e");
        System.out.println("******We are switching to the iframe*******");

        driver.findElement(By.xpath("html/body/a/img")).click();
        System.out.println("******We are done******");

        System.out.println(size1);



        driver.quit();


    }
}
