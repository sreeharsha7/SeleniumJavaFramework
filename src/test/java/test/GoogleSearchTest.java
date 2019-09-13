package Test;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
import java.net.SocketOption;

public class GoogleSearchTest{

    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();


    }

    public static void googleSearch(){
        WebElement h1 = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        //go to google.com
        driver.get("http://automationpractice.com/index.php");


        //enter text in search box
        //driver.findElement(By.name("q")).sendKeys("Automation step by step");
        //iver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
       GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
        //h1.sendKeys("Automation step by step");
        //driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");
        //click on search button
        //driver.findElement(By.name("btnk")).click();
        //driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='A8SBwf']/div[@class='FPdoLc VlcLAe']/center/input[@name='btnK']")).sendKeys(keys.ENTER);
        //h1 = driver.findElement(By.cssSelector(".FPdoLc [value='Google Search']"));
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
        //GoogleSearchPage.button_search(driver);
        //h1.sendKeys(Keys.RETURN);
        //driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);


        //close browser
        //driver.close();

        System.out.println("Test completed Successfully");



    }

}

/*
package Test;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import pages.GoogleSearchPage;
import java.net.SocketOption;

public class GoogleSearchTest{

    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();


    }

    public static void googleSearch(){
        //WebElement h1 = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        //go to google.com
        driver.get("http://automationpractice.com/index.php");


        //enter text in search box
        //driver.findElement(By.name("q")).sendKeys("Automation step by step");
        //iver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        GoogleSearchPage.textbox_search(driver).sendKeys("Womens Wear");
        //click on search button
        //driver.findElement(By.name("btnk")).click();
        //driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='A8SBwf']/div[@class='FPdoLc VlcLAe']/center/input[@name='btnK']")).sendKeys(keys.ENTER);
        //h1 = driver.findElement(By.cssSelector(".FPdoLc [value='Google Search']"));
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
        //GoogleSearchPage.button_search(driver);
        //driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);


        //close browser
        //driver.close();

        System.out.println("Test completed Successfully");



    }

}
*/