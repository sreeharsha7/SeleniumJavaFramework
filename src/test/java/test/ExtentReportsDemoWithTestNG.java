/*package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtentReportsDemoWithTestNG {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    WebDriver driver;

    @BeforeSuite
    public void setUp() {

        htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


    }

    @BeforeTest
    public void setUpTest(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebElement h1;

    }

    @Test
    public void test1() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        driver.get("http://google.com");

        test.pass("Navigated to Google.com");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");



    }

    @Test
    public void test2() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
    }


    @AfterTest
    public void tearDownTest(){
        //close browser
        driver.close();
        driver.quit();
        System.out.println("Test completed Successfully");

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtentReportsDemoWithTestNG {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extentDemoPractice;

    WebDriver driver;

    @BeforeSuite
    public void setUp() {

        htmlReporter = new ExtentHtmlReporter("extentDemoPractice.html");

        // create ExtentReports and attach reporter(s)
        extentDemoPractice = new ExtentReports();
        extentDemoPractice.attachReporter(htmlReporter);


    }

    @BeforeTest
    public void setUpTest(){

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebElement h1;

    }

    @Test
    public void testDemo1() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extentDemoPractice.createTest("MyFirstTest", "Sample description");

        driver.get("http://automationpractice.com/index.php");

        test.pass("Navigated to automationpractice.com");

        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");
        //test.pass("Entered the text");




        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
       // test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshotDemoPractice").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshotDemoPractice.png");



    }




    @Test
    public void testDemo2() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extentDemoPractice.createTest("MyFirstTest", "Sample description");


        driver.get("https://google.com");
        test.pass("Navigated to google.com");



        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshotDemoPractice2.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshotDemoPractice2.png");
    }


    @AfterTest
    public void tearDownTest(){
        //close browser
        driver.close();
        driver.quit();
        System.out.println("Test completed Successfully");

        // calling flush writes everything to the log file
        extentDemoPractice.flush();



    }

}
