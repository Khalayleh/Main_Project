package portal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ToTheServiceTest extends Base {

    public ToTheServiceTest(WebDriver driver) {
        super();
    }

    @Test(enabled = true)
    public void toTheService() throws InterruptedException {
        ToTheServicePage toTheServicePage = new ToTheServicePage(driver);
        toTheServicePage.toTheService();
    }
}
