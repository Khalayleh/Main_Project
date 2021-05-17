package portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StageTwoPage extends Base {

    //Indexes are from 1 to 10
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlReversationType\"]")
    private WebElement reservationType;

    //04/18/2021
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_dReservationDateDecision\"]")
    private WebElement reservationDate;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_Calendar1_day_2_2\"]")
    private WebElement reservationDateTest;


    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtReservationAddress\"]")
    private WebElement reservationAddress;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lbtnNext\"]")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lbtnPrevious\"]")
    private WebElement backButton;


    public StageTwoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void stageTwo() throws InterruptedException {
        Thread.sleep(3000);
        dropDown(this.reservationType, 1);

       // this.reservationDate.sendKeys("04/28/2020");
        this.reservationDate.click();
        this.reservationDateTest.click();

        this.reservationAddress.sendKeys("123");
        Thread.sleep(5000);

        this.nextButton.click();
        // this.backButton.click();


    }

    public void dropDown(WebElement element, int value) {

        Select select = new Select(element);
        select.selectByIndex(value);

    }
}
