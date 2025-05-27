package BDD.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    public void Setup() {
//        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\razi.uddin\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
}
