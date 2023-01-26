package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class TestLJ1 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");

        WebElement webElement1 = driver.findElement(By.xpath(".//a[contains(text(), 'Войти')]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='user']"));
        webElement2.click();
        webElement2.sendKeys("maksimaga1703");
        WebElement webElement3= driver.findElement(By.xpath(".//input[@id='lj_loginwidget_password']"));
        webElement3.click();
        webElement3.sendKeys("Moscow1703");
        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();
        driver.quit();

    }
}