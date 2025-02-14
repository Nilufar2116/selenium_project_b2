package day_02_seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByIdAndClick {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //we need to locate the web element that we want selenium to interact with

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        Thread.sleep(2000);

        //click on login button
        loginButton.click();

        Thread.sleep(5000);

        //quit the driver
        driver.quit();


    }
}
