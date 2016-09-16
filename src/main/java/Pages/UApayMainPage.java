package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Alexandr.Kaliuk on 16.09.2016.
 */
public class UApayMainPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id='loginBlock']/div/a[@class='login greenBtn ng-scope']")
    private WebElement enterButton;

    @FindBy(how = How.XPATH, using = "//*[@id='loginForm']//div[1]/input")
    private WebElement phoneInput;

    @FindBy(how = How.XPATH, using = "//*[@id='loginForm']//div[2]/input")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//*[@id='loginForm']//button")
    private WebElement submitToLoginButton;

    public UApayMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToAccountPage(String phone, String pass){
        enterButton.click();
        phoneInput.sendKeys(phone);
        passwordInput.sendKeys(pass);
        submitToLoginButton.click();
    }
}
