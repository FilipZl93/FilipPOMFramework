package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

import static java.nio.file.Files.find;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Action action;
    protected JavascriptExecutor js;

//    Konstruktor:

    public BasePage(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);

    }

    public void navigateUrl(String url){

        driver.get(url);
    }

//    Metode:

    public void click(By locator) {

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickSearchButton(By searchButtonLocator) {

        click(searchButtonLocator);
    }

    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public WebElement find(By locator){

        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
}
