package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
    public static WebDriver driver;
    public static String closeSignIN = "//span[@class='commonModal__close']";
    public static String fromCity = "//span[.='From']";
   public static String enterFrom = "//input[@placeholder='From']";
    public static String selectFrom = "//li[@id='react-autowhatever-1-section-0-item-0']";

    public static String toCity    = "//input[@id='toCity']";
    public static String enterTo ="//input[@placeholder='To']";
   public static String selectTo =  "//li[@id='react-autowhatever-1-section-0-item-0']";
    public static String departure = "//span[.='Departure']";
    public static String Search = "//a[.='Search']";
    public static String departDate = "(//div[@class='DayPicker-Day'])[8]";


    public static void closeSign() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(closeSignIN)).click();

    }
    public static void clickFrom() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(fromCity)).click();
    }
    public static void enterFromCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(enterFrom)).sendKeys("Bengaluru");
    }
    public static void selectFromCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectFrom)).click();
    }
    public static void clickToCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(toCity)).click();
    }
    public static void enterToCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(enterTo)).sendKeys("Delhi");
    }
    public static void selectToCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectTo)).click();
    }
    public static void selectDeparturedate() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(departDate)).click();
    }
    public static void clickSearch() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Search)).click();
    }










}


