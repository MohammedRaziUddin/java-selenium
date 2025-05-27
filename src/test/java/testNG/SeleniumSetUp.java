package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SeleniumSetUp {

    WebDriver driver;

    @BeforeClass
    public void Setup() {
//        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\razi.uddin\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void openBrowser() {
//        driver.get("https://www.browserstack.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.findElement(By.id("signupModalButton")).click();
//        driver.findElement(By.xpath("//a[@href ='/docs/configuration']")).click();
        System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
    }

    @Test(description = "This method validates the sign up functionality")
    public void signUp() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }

    @AfterMethod
    public void postSignUp() {
        System.out.println(driver.getCurrentUrl());

    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}

