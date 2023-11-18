package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormInteraction {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
    private static final By USERNAME_SEL = By.id("username");
    private static final By PASSWORD_SEL = By.id("password");
    private static final By LOGIN_SEL = By.cssSelector("[type=\"submit\"]");
    private static final String USERNAME_STR = "tomsmith";
    private static final String PASSWORD_STR = "SuperSecretPassword!";

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(TARGET_URL);
        try {
            //Find elements
            //By usernameSel = By.id("username");
            //By passwordSel = By.id("password");
            // Find by css selector, By passwordSel = By.cssSelector("#password");

            //Find element with defined selectors

            WebElement usernameEle = driver.findElement(USERNAME_SEL);
            WebElement passwordEle = driver.findElement(PASSWORD_SEL);
//            WebElement loginEle = driver.findElement(LOGIN_SEL);

            //Interact with elements
            driver.navigate().refresh();
            usernameEle = driver.findElement(USERNAME_SEL);
            passwordEle = driver.findElement(PASSWORD_SEL);
            usernameEle.sendKeys(USERNAME_STR);
            passwordEle.sendKeys(PASSWORD_STR);
//            loginEle.click();

            //driver.navigate().back();

            //DEBUG
////            try {
////                Thread.sleep(2000);
////            } catch (Exception ignored) {
//            }
        } catch (Exception e) {
            e.printStackTrace();
            //Close the session
        } finally {
            driver.quit();
        }

    }
}
