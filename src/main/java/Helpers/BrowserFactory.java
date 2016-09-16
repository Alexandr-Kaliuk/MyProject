package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alexandr.Kaliuk on 16.09.2016.
 */
public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){
        if (browserName.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);

        return driver;
    }

    public static void closeBrowser(){
        driver.close();
    }
}
