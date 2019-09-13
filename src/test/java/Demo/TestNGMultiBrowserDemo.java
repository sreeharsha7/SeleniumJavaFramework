package Demo;
import demo.Log4jDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
    WebElement h1;
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");
    private static Logger logger = LogManager.getLogger(TestNGMultiBrowserDemo.class);
   //ystem.out.println(projectPath);
    @Parameters("browserName")
    @BeforeTest
    public void setup(String browserName) {

        System.out.println("Browser name is : "+browserName);
        System.out.println("Thread id : "+Thread.currentThread().getId());
        if(browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
         // System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/Chromedriver/chromedriver.exe");
            driver = new ChromeDriver();




        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            //stem.setProperty("webdriver.gecko.driver", projectPath+"/drivers/Geckodriver/geckodriver.exe");
            driver = new FirefoxDriver();

        }
        else if (browserName.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            //System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/Geckodriver/geckodriver.exe");
            driver = new InternetExplorerDriver();
        }

    }


    @Test
    public void test1() throws Exception{

        driver.get("https://google.com");
        h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        h1.sendKeys("hahaha");
        h1.sendKeys(Keys.ENTER);
        logger.trace("trace message");
        logger.info("information Message");
        logger.error("Error");
        logger.warn("warning");
        logger.fatal("fatal");

        System.out.println("I am inside ChromeTest");
     // Thread.sleep(9000);
    }

    @AfterTest
    public void tearDown(){

        //driver.close();
        System.out.println("Test Completed Succesfully");


    }

    }


