package portal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;

    @BeforeMethod(enabled = true)
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        navigateTo();
    }

    public void navigateTo ()
    {
        driver.navigate().to("http://10.83.15.34:9007/");
    }

    @AfterMethod(enabled = false)
    public void tearDown()
    {
        driver.quit();
    }
}
