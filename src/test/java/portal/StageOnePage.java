package portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StageOnePage extends Base {

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnStartService\"]")
    private WebElement applicationStartButton;

    //Amman is Index number 53
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_ddlCourtLocation\"]")
    private WebElement courtLocation;

    //Execution is Index number 1
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_ddlCourtType\"]")
    private WebElement courtSpeciality;

    //General is Index number 1
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_ddlRegistryBook\"]")
    private WebElement record;

    //1 - 2020
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_txtCaseNumber\"]")
    private WebElement caseNumber;

    //Year Index is same as the Year number
    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_ddlYear\"]")
    private WebElement year;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_CaseInformation_btnFetch\"]")
    private WebElement CaseInformationButton;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lbtnNext\"]")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lbtnPrevious\"]")
    private WebElement backButton;

    public StageOnePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void stageOne() throws InterruptedException {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", this.applicationStartButton);

//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOf(this.applicationStartButton));

        Thread.sleep(2000);
        this.applicationStartButton.click();
        Thread.sleep(5000);

        dropDown(this.courtLocation, 55);
        Thread.sleep(4000);


        dropDown(this.courtSpeciality, 1);
        Thread.sleep(3000);


        dropDown(this.record, 1);
        Thread.sleep(3000);


        this.caseNumber.sendKeys("1");

        dropDown(this.year, 2);
        Thread.sleep(4000);


        this.CaseInformationButton.click();
        Thread.sleep(6000);

        this.nextButton.click();
    }

    public static void dropDown(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }


}
