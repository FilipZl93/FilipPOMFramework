package appTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void beforeClass() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.mozzartsport.com/");

    }

    @After
    public void tearDown() throws Exception {
        driver.manage().deleteAllCookies();
    }
}
