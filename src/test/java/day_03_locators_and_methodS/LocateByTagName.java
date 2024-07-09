package day_03_locators_and_methodS;

import com.ucode.base.TestBase;

import com.ucode.utility.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagName extends TestBase {

    public static void main(String[] args) {

       // WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        setUp(); // this is a custom method
        driver.get("https://www.practice-ucodeacademy.com/");

        Wait.waitForGivingTime(3);// using custom wait method

        //locate web element by tag name
        WebElement tagName = driver.findElement(By.tagName("li"));

        System.out.println(tagName.getText());

        Wait.waitForGivingTime(3);

        driver.quit();




    }
}
