package appTests;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class ByFlowTests extends BaseTest {

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(30));



    @Test
    public void buyFlow() {
        homePage.clickNba();
        homePage.enterEuroleague();
        
    }
}
