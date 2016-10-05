import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alexandr.Kaliuk on 04.10.2016.
 */
public class UApaySiteCheckTest {
    WebDriver driver = new FirefoxDriver();
    String url = "https://uapay.ua/";
    String title = "Переказ коштів з картки на картку онлайн - переказати гроші через Інтернет - UAPAY";

    @BeforeTest
    public void BeforeTest(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void TestMainPageTitle(){
        assert driver.getTitle().equals(title);
    }

    @AfterTest
    public void AfterTest(){
        driver.close();
    }
}
