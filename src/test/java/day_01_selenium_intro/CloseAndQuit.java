package day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws Exception {

        //create driver instance
        WebDriver driver =new ChromeDriver();

        //load/open/navigate url in chrome-browser
        driver.get("https://www.practice-ucodeacademy.com/ ");

        //maximize the browser window
        driver.manage().window().maximize();

        Thread.sleep(5000);

        //close the current browser/tab - doesn't end the web driver session
        //driver.close();

        //Thread.sleep(2000);

        //let's try to navigate to some url to see what happen after using close()
        //driver.navigate().to("https://www.practice-ucodeacademy.com/ ");

        //quit all browsers/tabs that was opened and end driver session
        //We will be using driver.quit() mostly whenever we are done with our testing
        driver.quit();
    }
}
