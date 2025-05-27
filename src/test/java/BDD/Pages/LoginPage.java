package BDD.Pages;

import BDD.Util.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass {
//    WebDriver driver;

    public LoginPage() {
//        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div > p:nth-child(1)")
    public WebElement getUserName;

    @FindBy(css = "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div > p:nth-child(2)")
    public WebElement getPassword;

    @FindBy(name = "username")
    public WebElement userNameTxtBox;

    @FindBy(name = "password")
    public WebElement passwordTxtBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement submitButton;

    public void fillLoginForm() throws InterruptedException {
        Thread.sleep(1500);
        userNameTxtBox.sendKeys("Admin");
        passwordTxtBox.sendKeys("admin123");
        Thread.sleep(1500);
        submitButton.click();
    }

    public void dashboard() {
        WebElement dashboardTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        String title = dashboardTitle.getText();
        Assert.assertEquals(title, "Dashboard");
    }

}

