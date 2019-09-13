/*package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class AmazonTestingDealsDemo {
    static ChromeDriver driver = null;
    static WebDriverWait wait = null;
    //static FirefoxDriver driver = null;




     * @throws java.lang.Exception


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@BeforeTest
    public static void setUpBeforeClass() throws Exception {
        // Replace the path of chrome driver according to your setup
        //System.setProperty("webdriver.chrome.driver", "/Users/Niranjan/My Briefcase/My Development/eclipse_learning/SeleniumLearning/lib/webdrivers/chromedriver");
        //WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
         //driver = new FirefoxDriver();
        driver = new ChromeDriver();

    }



    @Before
    public void setUp() throws Exception {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testAddToCart() {
        driver.get("http://wwww.amazon.com");
        driver.findElementByLinkText("Today's Deals").click();
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Today's Deals")));

        // Test
        Assert.assertTrue(driver.getTitle().equals("International Shopping: Shop special offers and deals that ship internationally"));

    //Assert.assertTrue(driver.getTitle().equals("International Shopping: Shop special offers and deals that ship internationally"));


        driver.findElementById("a-autoid-1-announce").click();
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));

        driver.findElementById("nav-cart").click();
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sc-active-cart")));

        // Test
        Assert.assertTrue(driver.getTitle().equals("Amazon.com Shopping Cart"));
        //Assert.assertTrue(driver.getTitle().equals("Amazon.com Shopping Cart"));
    }

    @AfterClass
    public static void CleanUp() {
        //driver.quit();
    }

}

*/

package test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTestingDealsDemo {

    @Test
    public void TestSelenium(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
        searchBox.sendKeys("Book");
        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();
        driver.quit();

    }
}
