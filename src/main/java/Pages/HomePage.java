package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {

    private  By evroliga = By.xpath("//*[text()=\"Evroliga \"]");
    private By nba = By.xpath("//*[text()=\" NBA \"]");

    //Konstruktor:

    public HomePage (WebDriver driver, Duration timeout ){

        super(driver, timeout);
    }

//    Metode:

   public void enterEuroleague(){

        driver.findElement(evroliga).click();

}

   public void clickNba(){

        driver.findElement(nba).click();
}

}
