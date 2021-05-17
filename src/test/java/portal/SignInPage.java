package portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignInPage extends Base {

    @FindBy(xpath = "//*[@id=\"mobile-profile-img\"]/li/a[2]")
    private WebElement signInHomePage;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_userid\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnLogin\"]")
    private WebElement signInSubmit;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void signInButton() throws InterruptedException {

        Thread.sleep(2000);

//        WebDriverWait wait = new WebDriverWait(driver, 4);
//        wait.until(ExpectedConditions.visibilityOf(this.signInHomePage));

        this.signInHomePage.click();

        this.userName.sendKeys("6608");

        this.password.sendKeys("a1234*");

        this.signInSubmit.click();
    }
}
