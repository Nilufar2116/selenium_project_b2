package com.ucode.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {


    public static WebDriver driver;

    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

}
