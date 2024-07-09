package day_03_locators_and_methodS;

import com.ucode.utility.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAnyTagNameAndAttributeCss {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("textarea[title='Search']"));

        searchBox.sendKeys("java");
        Wait.waitForGivingTime(4);
        driver.quit();
    }


}
