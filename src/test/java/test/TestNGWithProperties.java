package test;

import config.PropertiesFile;
import demo.Log4jDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import config.PropertiesFile;
//import demo.Log4jDemo;

public class TestNGWithProperties {

    WebDriver driver = null;
    // public WebElement h1;
    public static String browserName=null;
    //private static Logger logger = LogManager.getLogger(Log4jDemo.class);
    String projectPath = System.getProperty("user.dir");
    File file = new File(projectPath + "/src/test/java/config/configDemo.properties");

    @BeforeTest
    public void setUpTest() {
        //String projectPath = System.getProperty("user.dir");
        PropertiesFile.getProperties();
        //WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver = new ChromeDriver();

        if(browserName.equalsIgnoreCase("chrome")) {
            //PropertiesFile.getProperties();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
           // logger.info("Browser Started");

        }
        else if(browserName.equalsIgnoreCase("firefox")) {
             System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/Geckodriver/geckodriver.exe");
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
             }


    }

    //


    // logger.info("Browser started");

    // }

    @Test
    public void googleSearch() {

        //goto google.com
        driver.get("http://automationpractice.com/index.php");
        //logger.info("Navigated to google.com");

        //enter text in search textbox
        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");


        //click on search button
        //driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(Keys.RETURN);
        //h1.sendKeys(Keys.ENTER);

    }

    @AfterTest
    public void tearDownTest() {

        //close browser
        driver.close();
        //driver.quit();
        System.out.println("Test Completed Successfully");
        PropertiesFile.setProperties();

    }

}
