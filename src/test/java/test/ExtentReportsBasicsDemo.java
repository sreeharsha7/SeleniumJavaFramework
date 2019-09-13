/*package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtendReportsBasicsDemo {

    private static WebDriver driver;

    static {
        driver = null;
    }

    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("google Search test One", "test to validate google search functionality");


        WebElement h1 = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



        // log(Status, details)
        test1.log(Status.INFO, "Starting Test case)");
        driver.get("https://google.com");

        // info(details)
        test1.pass("Navigated to Google.com");

        h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        h1.sendKeys("Automation step by step");
        test1.pass("Entered the text");


        h1.sendKeys(Keys.RETURN);
        test1.pass("Pressed Enter Key");

        driver.close();
        driver.quit();
        test1.pass("Closed the browser");

        // calling flush writes everything to the log file
        extent.flush();




    }
}
*/



package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportsBasicsDemo {

    private static WebDriver driver;

    static {
        driver = null;
    }

    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReportsDemo.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extentDemo = new ExtentReports();
        extentDemo.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest testDemo = extentDemo.createTest("google Chrome test One", "test to validate search functionality");


        //WebElement h1 = null;
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



        // log(Status, details)
        testDemo.log(Status.INFO, "Starting Test case)");
        driver.get("http://automationpractice.com/index.php");

        // info(details)
        testDemo.pass("Navigated to Automation Practice");

        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");
        testDemo.pass("Entered the text");

        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(Keys.RETURN);
        testDemo.pass("Pressed Enter Key");

        driver.close();
        driver.quit();
        testDemo.pass("Closed the browser");

        testDemo.info("Test Complete");

        // calling flush writes everything to the log file
        extentDemo.flush();




    }
}
