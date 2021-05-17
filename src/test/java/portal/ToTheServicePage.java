package portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ToTheServicePage extends Base {

    @FindBy(xpath = "//*[@id=\"SiteHeader_divToShowMenu\"]/nav/ul/li[3]/a")
    private WebElement optionsList1;

    @FindBy(xpath = "//*[@id=\"SiteHeader_divToShowMenu\"]/nav/ul/li[3]/ul/li[5]/a")
    private WebElement optionslist2;

    @FindBy(xpath = "//*[@id=\"SiteHeader_divToShowMenu\"]/nav/ul/li[3]/ul/li[5]/ul/li[11]/a")
    private WebElement optionsList3;

    public ToTheServicePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void toTheService() throws InterruptedException {
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Thread.sleep(3000);

        this.optionsList1.click();
        this.optionslist2.click();
        this.optionsList3.click();
    }


}
