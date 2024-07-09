package day_03_locators_and_methodS;

import com.ucode.base.TestBase;
import com.ucode.utility.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorPractice extends TestBase {

    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/multiple_buttons");

        Wait.waitForGivingTime(3);

        WebElement btn1 = driver.findElement(By.cssSelector("button[onclick = 'button1()']"));

        btn1.click();
        Wait.waitForGivingTime(2);

        //WebElement result = driver.findElement(By.id("result"));
        //WebElement result = driver.findElement(By.cssSelector("p#result"));
        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));

        System.out.println(result.getText());
        Wait.waitForGivingTime(3);

        driver.findElement(By.cssSelector("button[onclick = 'button2()']")).click();

        //locate result message and get its text
        String s = driver.findElement(By.id("result")).getText();
        System.out.println(s);

        //locate result message and print its text directly
        System.out.println(driver.findElement(By.id("result")).getText());

        Wait.waitForGivingTime(3);



        driver.quit();




    }
}
