package appTests;

import Pages.HomePage;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class ByFlowTests extends BaseTest {

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(30));



    @Test
    public void buyFlow() {
        homePage.clickNba();
        homePage.enterEuroleague();

        WebElement element = driver.findElement(By.xpath("//*[text()=\"Dubai pred Partizan jači za šampiona Evrolige\"]"));
        Assert.assertTrue(element.isDisplayed());


    }
}