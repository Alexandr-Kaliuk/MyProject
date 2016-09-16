package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Alexandr.Kaliuk on 16.09.2016.
 */
public class UApayAccountPage {
    private WebDriver driver;

    public UApayAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//div[@id='loginBlock']//div[@class='userName ng-binding ng-scope']")
    WebElement accountName;

    @FindBy(how = How.XPATH, using = "//ul[@class='info-box']/li[2]")
    WebElement exitButton;

    @FindBy(how = How.XPATH, using = "//ul[@class='info-box']/li[1]")
    WebElement mySettingsButton;

    public WebElement getAccountName() {
        return accountName;
    }

    public WebElement getExitButton() {
        return exitButton;
    }

    public WebElement getMySettingsButton() {
        return mySettingsButton;
    }
}
