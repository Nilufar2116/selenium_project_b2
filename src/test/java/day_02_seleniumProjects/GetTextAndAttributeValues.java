package day_02_seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndAttributeValues {

    public static void main(String[] args) throws Exception {

        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(2000);

        //locate web element by class name
        WebElement infoElement = driver.findElement(By.className("info"));

        //get the text/retrieve the text using getText()
        String texOfElement = infoElement.getText();

        System.out.println("Text of Web Element:" +texOfElement);

        //locate login button with class name
        WebElement logInBtn = driver.findElement(By.className("button"));

        //get  id attribute value as String
        String idValue = logInBtn.getAttribute("id");

        System.out.println("id: " +idValue);

        //get name attribute as String
        String nameValue = logInBtn.getAttribute("name");

        System.out.println("name value:" + nameValue);

        Thread.sleep(4000);

        driver.quit();




    }
}
