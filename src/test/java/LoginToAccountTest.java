import Helpers.BrowserFactory;
import Pages.UApayAccountPage;
import Pages.UApayMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Alexandr.Kaliuk on 16.09.2016.
 */
public class LoginToAccountTest {
    WebDriver driver;
    String url= "https://uapay.ua/";
    String phone = "637052590";
    String pass = "Sasha878750";
    String accountName = "Alexandr Kaliuk";

    @BeforeTest
    public void beforeTest(){
        driver = BrowserFactory.startBrowser("firefox", url);
    }

    @Test
    public void validLoginToAccount(){
        UApayMainPage mainPage = PageFactory.
                initElements(driver, UApayMainPage.class);
        mainPage.loginToAccountPage(phone, pass);
        UApayAccountPage accountPage = PageFactory.
                initElements(driver, UApayAccountPage.class);
        Assert.assertEquals(accountPage.getAccountName().getText(), accountName, "Account name is wrong!");
    }

    @AfterTest
    public void afterTest(){
        BrowserFactory.closeBrowser();
    }
}
