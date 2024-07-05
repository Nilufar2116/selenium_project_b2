package day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveNavigation {

    public static void main(String[] args) throws Exception{

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice-ucodeacademy.com/");

        //use this method to maximize the window
        driver.manage().window().maximize();

        //wait for 3 seconds
        Thread.sleep(3000);

        // navigate to different page/url
        driver.navigate().to("https://www.practice-ucodeacademy.com/dropdown ");

        //wait for 3 seconds
        Thread.sleep(3000);

        //navigate to previous page/go back to previous page
        driver.navigate().back();

        //wait for 3 seconds
        Thread.sleep(3000);

        //navigate forward go to the page that we visited
        driver.navigate().forward();

        //wait for 3 seconds
        Thread.sleep(3000);

        //refresh the page
        driver.navigate().refresh();



    }
}
