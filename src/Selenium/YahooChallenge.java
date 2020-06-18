//package Selenium;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class YahooChallenge {
//    public static void main(String[] args) throws InterruptedException {
//
//        // Launch chromedrivier
//        System.setProperty("webdriver.chrome.driver", "/Users/sergooo/Documents/tools/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        // Launch Website
//        driver.get("https://www.yahoo.com/");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        // Maximize the browser
//        driver.manage().window().maximize();
//
//        // Find the header with all the links on the homepage
//        List<WebElement> list = driver.findElements(By.xpath("//*[@id='header-nav-bar']/li/a"));
//
//        // Print out all links from the header
//        for(WebElement link: list) {
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//        }
//    }
//}
//
//
