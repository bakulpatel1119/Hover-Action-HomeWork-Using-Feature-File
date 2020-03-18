package NopCommerce;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Basepage {
    public void openBrowser() {
        // object created for load prop
        LoadProp loadProp = new LoadProp();
        //select browser from testconfig.properties
        String browser = loadProp.getProperty("browser");
        // print which browser used
        System.out.println("Browser : " + browser);

        // select browser chrome
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browserdriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            //select browser firefox
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browserdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
        } else {
            //show error message if none of the above conditions true
            System.out.println("You have selected wrong browser" + browser);
        }
    }

    public void closeBrowser() {  // driver.quit(); }
    }
}