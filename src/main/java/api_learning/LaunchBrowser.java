package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;


public class LaunchBrowser {
    public static void main(String[] args){
        WebDriver driver = DriverFactory.getWebDriver();

        driver.get("https://sdetpro.com");

        //close a window: driver.close();
        //quit the session
        driver.quit();
        //chromedriver download luu o dau: nhan shift 2 lan - search Selenium Manager // go cmd line: ls ~/.cache/selenium/chromedriver
    }
}
