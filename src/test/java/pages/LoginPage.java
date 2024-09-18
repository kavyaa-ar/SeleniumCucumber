package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static WebDriver driver ;
    public static String EmailIcon = "//img[@class='appendLeft15 mousePointer signInByEmailButton']";
    public static String emailInput = "//input[@placeholder='Enter Email Address']";
    public static String password = "//input[@id='password']";
    public static String continuebtn = "//span[.='Continue']";
    public static String Logincta = "//span[.='Login']";

    public static void clickemail() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EmailIcon)).click();
    }

    public static void enterEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(emailInput)).sendKeys("kavyaar569@gmail.com");
    }

    public static void clickContinue() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(continuebtn)).click();
    }

    public static void enterPasswrd() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(password)).sendKeys("Kavya@1234");
    }

    public static void clickLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Logincta)).click();
    }
}
