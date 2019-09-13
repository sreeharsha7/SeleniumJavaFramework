

/*package test;

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

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestNG_Demo {

    WebDriver driver = null;
    public WebElement h1;
    public static String browserName=null;
    private static Logger logger = LogManager.getLogger(Log4jDemo.class);


    @BeforeTest
    public void setUpTest() {
        String projectPath = System.getProperty("user.dir");
        PropertiesFile.getProperties();

        if(browserName.equalsIgnoreCase("chrome")) {

            //WebDriverManager.chromedriver().setup();


            System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            //driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/Geckodriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }


        logger.info("Browser started");

    }

    @Test
    public void googleSearch() {

        //goto google.com
        driver.get("https://google.com");
        logger.info("Navigated to google.com");

        //enter text in search textbox
        h1 = driver.findElement(By.name("q"));
        h1.sendKeys("Automation Step by Step");

        //click on search button
        //driver.findElement(By.name("btnK")).click();
        //h1= driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        h1.sendKeys(Keys.ENTER);

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
*/

package test;

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

//import config.PropertiesFile;
//import demo.Log4jDemo;

public class TestNG_Demo2 {

    WebDriver driver = null;
    // public WebElement h1;
    // public static String browserName=null;
    // private static Logger logger = LogManager.getLogger(Log4jDemo.class);


    @BeforeTest
    public void setUpTest() {
        String projectPath = System.getProperty("user.dir");
        //PropertiesFile.getProperties();
        WebDriverManager.chromedriver().setup();
       //ystem.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver = new ChromeDriver();

        //if(browserName.equalsIgnoreCase("chrome")) {

        //
    }

    // else if(browserName.equalsIgnoreCase("firefox")) {
    // System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/Geckodriver/geckodriver.exe");
    //   driver = new FirefoxDriver();
    // }


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
    @Test
    public void googleSearch2(){

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
        //PropertiesFile.setProperties();

    }

}
