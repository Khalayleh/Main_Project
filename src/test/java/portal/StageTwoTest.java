package portal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StageTwoTest extends Base{

    public StageTwoTest(WebDriver driver) {
        super();
    }

    @Test(enabled = true)
    public void stageTwo() throws InterruptedException {
        StageTwoPage stageTwoPage = new StageTwoPage(driver);
        stageTwoPage.stageTwo();
    }

}
