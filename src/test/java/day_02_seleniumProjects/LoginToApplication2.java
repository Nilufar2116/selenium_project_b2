package day_02_seleniumProjects;

import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication2 {

    public static void main(String[] args) throws Exception {

        String url = "https://www.practice-ucodeacademy.com/";
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        //locate web element by link text
        WebElement formAuth = driver.findElement(By.linkText("Form Authentication"));

        formAuth.click();
        Thread.sleep(3000);

        //verify that you are on login page by verifying the url
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.endsWith("login")){
            System.out.println("You are on login page");
        }else {
            System.out.println("You are Not on login page");

            // locate username input
            WebElement usernameInput = driver.findElement(By.name("username"));
            WebElement passwordInput = driver.findElement(By.id("password"));

            //locate login button
            WebElement loginBtn = driver.findElement(By.className("radius"));

            //enter username
            usernameInput.sendKeys("tomsmith");

            Thread.sleep(2000);

            //enter password
            passwordInput.sendKeys("SuperSecretPassword!");

            Thread.sleep(2000);

            loginBtn.click();

            Thread.sleep(3000);

            //verify that you are logged in

            //get the text of success message after login
            WebElement message = driver.findElement(By.id("flash"));

            String text = message.getText();

            //verify that success message contains expected message
            if (text.contains("You logged")) {
                System.out.println("You logged in successfully");
            } else {
                System.out.println("Login failed");
            }

            Thread.sleep(3000);

            //locate log out button
            WebElement logoutBtn = driver.findElement(By.cssSelector(".button.secondary.radius"));

            //click on log out button to log out
            logoutBtn.click();

            Thread.sleep(3000);

            driver.quit();


        }

    }
}
