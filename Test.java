package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.sdt.com.tr/en");
            driver.manage().window().maximize();
            WebDriverWait w = new WebDriverWait(driver, Duration.ofMinutes(5));
            w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='lcc-button js-lcc-accept']")));
            WebElement cookieButton = driver.findElement(By.xpath("//*[@class='lcc-button js-lcc-accept']"));
            cookieButton.click();
            WebElement frameElement= w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Who We Are"))));
            frameElement.click();
            driver.navigate().back();
            Thread.sleep(1000);
            frameElement = driver.findElement(By.partialLinkText("Solutions"));
            w.until(ExpectedConditions.elementToBeClickable(frameElement)).click();
            Thread.sleep(1000);
            w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Radar, Electronic Warfare and Communication Systems")))).click();
            Thread.sleep(1000);
            w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Electronic Warfare Systems")))).click();
            Thread.sleep(1000);
            w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Anti-Drone Systems")))).click();
            Thread.sleep(1000);
            WebElement tab1 = driver.findElement(By.partialLinkText("Download Brochure"));
            tab1.click();
            Thread.sleep(2000);
            Set<String> tabs2 = driver.getWindowHandles();
            String[] kdr = tabs2.toArray(new String[tabs2.size()]);
            driver.switchTo().window(kdr[1]);
            driver.close();
            driver.switchTo().window(kdr[0]);
            driver.navigate().back();
            w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Technology")))).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(1000);
            w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Media")))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='col-12']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("logo")).click();
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("Business Partners")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("column_495450")).click();
            Thread.sleep(1000);
            kdr = driver.getWindowHandles().toArray(new String[driver.getWindowHandles().size()]);
            driver.switchTo().window(kdr[1]);
            driver.close();
            driver.switchTo().window(kdr[0]);
            Thread.sleep(2000);
            driver.findElement(By.id("column_172488")).click();
            kdr = driver.getWindowHandles().toArray(new String[driver.getWindowHandles().size()]);
            Thread.sleep(2000);
            driver.switchTo().window(kdr[1]);
            driver.close();
            driver.switchTo().window(kdr[0]);
            Thread.sleep(2000);
            driver.findElement(By.partialLinkText("Supplier Form")).click();
            kdr = driver.getWindowHandles().toArray(new String[driver.getWindowHandles().size()]);
            Thread.sleep(2000);
            driver.switchTo().window(kdr[1]);
            driver.close();
            driver.switchTo().window(kdr[0]);
            //driver.findElement(By.xpath("//*[@class='btn_download document-href ']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("logo")).click();
            Thread.sleep(2000);
            driver.findElement(By.partialLinkText("Career")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,6000)");
            Thread.sleep(2000);
            WebElement eng = driver.findElement(By.xpath("//*[@class='card TestingEngineer']"));
            eng.click();

            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,2000)");
            eng.findElement(By.partialLinkText("Apply")).click();
            Thread.sleep(2000);
            kdr = driver.getWindowHandles().toArray(new String[driver.getWindowHandles().size()]);
            driver.switchTo().window(kdr[1]);
            driver.close();
            driver.switchTo().window(kdr[0]);
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-6000)");
            Thread.sleep(1000);
            driver.findElement(By.id("logo")).click();
            driver.findElement(By.partialLinkText("en")).click();
            Thread.sleep(2000);
            driver.findElement(By.partialLinkText("tr")).click();
            Thread.sleep(2000);
            driver.findElement(By.partialLinkText("en")).click();
            WebElement search = driver.findElement(By.xpath("//*[@class='search']"));
            search.click();
            Thread.sleep(2000);
            driver.findElement(By.name("q")).sendKeys("selamin aleykum");
            Thread.sleep(2000);
            new Actions(driver).sendKeys(Keys.ENTER).perform();
            Thread.sleep(4000);
            driver.navigate().back();
            Thread.sleep(2000);
            new Actions(driver).sendKeys(Keys.ESCAPE).perform();
            Thread.sleep(1000);    //special_item_c
            driver.findElement(By.xpath("//*[@class='special_item_c']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='close_special_tab active']")).click();
            Thread.sleep(2000);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
            driver.quit();
        }
    }
}
