import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alexandr.Kaliuk on 04.10.2016.
 */
public class GooglePageTest {
    WebDriver driver = new FirefoxDriver();
    String url = "https://www.google.com.ua/";
    String search = "uapay.ua";
    By input = By.xpath("//input[@id='lst-ib']");
    By buttonSearch = By.xpath("//*[@id='sblsbb']/button");
    String title = "Google";


    /*@FindBy(xpath = "//div[3]/div/input[3]")
    WebElement searchField;

    @FindBy(xpath = "//button[@value='Пошук']")
    WebElement buttonSearch;*/

    @BeforeMethod
    public void BeaforeClass(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void titleVerifyTest(){
        assert driver.getTitle().equals(title);
    }

    @Test
    public void TestSearch(){
        driver.findElement(input).sendKeys(search);
        driver.findElement(buttonSearch).click();
        List<WebElement> ress = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
        System.out.println(ress.size() + ress.get(1).getText().toString());
        ress.get(1).getText().equals("Uapay | Facebook");
    }

    @Test
    public void TestSerch2(){
        driver.findElement(input).sendKeys(search);
        driver.findElement(buttonSearch).click();
        List<WebElement> ress = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
        System.out.println(ress.size() + ress.get(0).getText().toString());
        ress.get(0).getText().equals("UAPAY: Переказ коштів з картки на картку онлайн - переказати ...");
    }

    @AfterTest
    public void AfterTest(){
        driver.close();
    }

}
