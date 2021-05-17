package portal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInTest extends Base {

    public SignInTest(WebDriver driver) {
        super();
    }

    @Test(enabled = true)
    public void signIn() throws InterruptedException {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signInButton();
    }

}
