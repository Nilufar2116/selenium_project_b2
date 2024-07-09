package day_03_locators_and_methodS;

import com.ucode.utility.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssId {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice-ucodeacademy.com/radio_buttons");

        driver.manage().window().maximize();

        //hashtag is for id attribute
        WebElement blue = driver.findElement(By.cssSelector("input#blue"));

        System.out.println(blue.getAttribute("id"));

        Wait.waitForGivingTime(3);
        driver.quit();

    }
}
