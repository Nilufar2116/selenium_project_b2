package day_03_locators_and_methodS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssClass {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.practice-ucodeacademy.com/login");

        Thread.sleep(3000);

        //button.radius
        //locate login button using css selector
        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));

        loginBtn.click();

        Thread.sleep(4000);

        WebElement footer = driver.findElement(By.cssSelector("div.large-4.large-centered.columns"));

        System.out.println(footer.getText());

        Thread.sleep(3000);

        driver.quit();
    }
}
