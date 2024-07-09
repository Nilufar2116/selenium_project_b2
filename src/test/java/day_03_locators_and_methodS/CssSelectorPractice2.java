package day_03_locators_and_methodS;

import com.ucode.base.TestBase;
import com.ucode.utility.Wait;
import org.openqa.selenium.By;

public class CssSelectorPractice2 extends TestBase {

    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        driver.findElement(By.cssSelector("a[href='/login']")).click();

        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");

        driver.findElement(By.cssSelector("input[id='password'")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //click on log out button
        //a.button.secondary.radius
        driver.findElement(By.cssSelector("a[class='button secondary radius']")).click();

        Wait.waitForGivingTime(4);

        driver.quit();




    }
}
