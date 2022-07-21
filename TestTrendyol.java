package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TestTrendyol {
    public static void register(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@class='account-nav-item user-login-container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='q-secondary q-button-medium q-button tab button right ']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("register-email")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.id("register-password-input")).sendKeys("");
        Thread.sleep(1000);
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ty-bg-beige ty-mg-zero ty-input ty-checkbox ty-bordered']"))).submit();
        //driver.findElement(By.id("path-1")).submit();
        WebElement element = driver.findElement(By.name("personal-data-error"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(2000);

        //----------------------
            driver.findElement(By.id("register-email")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
            Thread.sleep(1000);
            driver.findElement(By.id("register-password-input")).sendKeys("");
            Thread.sleep(1000);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("register-email")).clear();
            driver.findElement(By.id("register-password-input")).clear();
            //------------------------

            driver.findElement(By.id("register-email")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
            Thread.sleep(1000);

            driver.findElement(By.id("register-password-input")).sendKeys("123456.asdF");
            Thread.sleep(1000);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("register-email")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-email")).sendKeys(Keys.DELETE);
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.DELETE);
            driver.findElement(By.xpath("//*[@class='ty-cross']")).click();
            Thread.sleep(2000);
            //-----------------------

            driver.findElement(By.id("register-email")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
            Thread.sleep(1000);
            driver.findElement(By.id("register-password-input")).sendKeys("asD12.");
            Thread.sleep(1000);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("register-email")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-email")).sendKeys(Keys.DELETE);
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.DELETE);            //-----------------------

            driver.findElement(By.id("register-email")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
            Thread.sleep(1000);

            driver.findElement(By.id("register-password-input")).sendKeys("asDfghJK123456789.");
            Thread.sleep(1000);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("register-email")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-email")).sendKeys(Keys.DELETE);
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.CONTROL, "a");
            driver.findElement(By.id("register-password-input")).sendKeys(Keys.DELETE);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            //-----------------------
            driver.findElement(By.id("register-email")).sendKeys("abdulkadiralaca@hacettepe.edu.tr");
            Thread.sleep(100);
            Thread.sleep(100);
            driver.findElement(By.id("register-password-input")).sendKeys("asD1234.");
            Thread.sleep(1000);
            element = driver.findElement(By.name("personal-data-error"));
            actions = new Actions(driver);
            //actions.moveToElement(element).click().build().perform();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='ty-cross']")).click();
            Thread.sleep(2000);
}

public static void login(WebDriver driver) throws InterruptedException {
    driver.findElement(By.xpath("//*[@class='account-nav-item user-login-container']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("login-email")).sendKeys("");
    Thread.sleep(1000);
    driver.findElement(By.id("login-password-input")).sendKeys("");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("login-email")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.id("login-email")).sendKeys(Keys.DELETE);
    driver.findElement(By.id("login-password-input")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.id("login-password-input")).sendKeys(Keys.DELETE);
    driver.findElement(By.id("login-email")).sendKeys("abdulkadiralaca@gmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("login-password-input")).sendKeys("");
    Thread.sleep(2000);
    driver.findElement(By.id("login-email")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.id("login-email")).sendKeys(Keys.DELETE);
    driver.findElement(By.id("login-password-input")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.id("login-password-input")).sendKeys(Keys.DELETE);
    driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("login-email")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
    Thread.sleep(1000);
    driver.findElement(By.partialLinkText("Şifremi Unuttum")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='ty-bg-beige ty-input ty-textbox ty-bordered ty-input-small']")).sendKeys("kjgdlgsdfglds@gkjfdlsgedf.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-small ty-notr']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("login-email")).sendKeys("abdulkadiralaca@gmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("login-password-input")).sendKeys("1597538520.a");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).click();
    Thread.sleep(2000);
}

public static void search(WebDriver driver) throws InterruptedException {
    driver.findElement(By.xpath("//a[@href ='/butik/liste/5/elektronik']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@href ='https://www.trendyol.com/sr?wc=106084,103108,103665']")).click();
    driver.findElement(By.xpath("//*[@class='prdct-cntnr-wrppr']")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Oyun")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("LENOVO")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[contains(text(),'Fiyat')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='fltr-srch-prc-rng-input max']")).sendKeys("fgh)/%&./-*fgdfy");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='fltr-srch-prc-rng-input max']")).sendKeys("10000");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='fltr-srch-prc-rng-srch']")).click();
    Thread.sleep(2000);
    Select select = new Select(driver.findElement(By.cssSelector("select")));
    select.selectByVisibleText("En Düşük Fiyat");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//i[@class='fvrt-btn']")).click();
    Thread.sleep(3000);
    driver.navigate().back();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,3000)");
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,3000)");
    Thread.sleep(2000);
}

public static void productPage(WebDriver driver) throws InterruptedException {
    driver.findElement(By.xpath("//a[@href ='/butik/liste/5/elektronik']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@href ='https://www.trendyol.com/sr?wc=106084,103108,103665']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='prdct-cntnr-wrppr']")).click();
    Thread.sleep(2000);//add-to-basket
    driver.findElement(By.xpath("//*[@class='p-card-chldrn-cntnr']")).click();
    Thread.sleep(2000);
    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    Actions actions = new Actions(driver);
    WebElement asd = driver.findElement(By.xpath("//*[@class='product-image-container']"));
    actions.moveToElement(asd,25,75).perform();
    Thread.sleep(1000);
    actions.moveToElement(asd,50,150).perform();
    Thread.sleep(1000);
    actions.moveToElement(asd,75,125).perform();
    Thread.sleep(1000);
    actions.moveToElement(asd,100,40).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']"));
    Thread.sleep(2000);
    actions.moveToElement(driver.findElement(By.xpath("//*[@class='pr-rnr-com-w']"))).perform();
    Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-3000)");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='add-to-collection-button-text']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("login-email")).sendKeys("abdulkadiralaca@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.id("login-password-input")).sendKeys("1597538520.a");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='q-primary q-fluid q-button-medium q-button submit']")).submit();
    Thread.sleep(4000);
    driver.navigate().back();
    //driver.findElement(By.xpath("//*[@class='modal-close']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='add-to-basket']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class='link account-basket']")).click();
    Thread.sleep(4000);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='fv']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='fv']")).click();
    Thread.sleep(2000);
}
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        Map prefs=new HashMap();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs",prefs);
        WebDriver driver=new ChromeDriver(options);
        //WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.trendyol.com");
            driver.manage().window().maximize();
            driver.findElement(By.id("Combined-Shape")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            Thread.sleep(1000);
            Thread.sleep(1000);
            //register(driver);
            driver.get("https://www.trendyol.com");
            driver.manage().window().maximize();
            /*driver.findElement(By.id("Combined-Shape")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();*/
            Thread.sleep(1000);
            Thread.sleep(1000);
            //login(driver);
            driver.get("https://www.trendyol.com");
            driver.manage().window().maximize();
            /*driver.findElement(By.id("Combined-Shape")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();*/
            Thread.sleep(1000);
            Thread.sleep(1000);
            search(driver);
            driver.get("https://www.trendyol.com");
            driver.manage().window().maximize();
            /*driver.findElement(By.id("Combined-Shape")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();*/
            Thread.sleep(1000);
            Thread.sleep(1000);
            productPage(driver);

        }
        finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}
