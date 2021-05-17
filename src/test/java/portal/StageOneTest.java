package portal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StageOneTest extends Base{

    public StageOneTest(WebDriver driver) {
        super();
    }

    @Test(enabled = true)
    public void stageOne() throws InterruptedException {
        StageOnePage stageOnePage = new StageOnePage(driver);
        stageOnePage.stageOne();
    }

}
