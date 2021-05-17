package portal;

import org.testng.annotations.Test;

public class Operation extends Base {

    @Test(enabled = false, description = "The first scenario where we're going use an object from the Test class")
    public void start() throws InterruptedException {
        SignInTest signInTest = new SignInTest(driver);
        ToTheServiceTest toTheServiceTest = new ToTheServiceTest(driver);
        StageOneTest stageOneTest = new StageOneTest(driver);
        StageTwoTest stageTwoTest = new StageTwoTest(driver);

        signInTest.signIn();
        toTheServiceTest.toTheService();
        stageOneTest.stageOne();
        stageTwoTest.stageTwo();
    }

    @Test(enabled = true, description = "The second scenario where we're going to use an object from the Page class")
    public void start1() throws InterruptedException {
        SignInPage signInPage = new SignInPage(driver);
        ToTheServicePage toTheServicePage = new ToTheServicePage(driver);
        StageOnePage stageOnePage = new StageOnePage(driver);
        StageTwoPage stageTwoPage = new StageTwoPage(driver);


        signInPage.signInButton();
        toTheServicePage.toTheService();
        stageOnePage.stageOne();
        stageTwoPage.stageTwo();
    }

}
