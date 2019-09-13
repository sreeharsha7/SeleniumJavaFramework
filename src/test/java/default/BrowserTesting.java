import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTesting {

    public static void main(String args[]) {



        WebElement h1;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();

        //WebDriver driver = new FirefoxDriver();

        //driver.get("https://google.com");
        driver.get("http://automationpractice.com/index.php");
        //h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
       // h1 = driver.findElement(By.xpath("/html//input[@id='search_query_top']"));
       // driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");

       //h1.sendKeys("mens wear");
        //h1.sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(Keys.RETURN);
        driver.close();


       //driver.findElement(By.id("gsr")).sendKeys("abcd");
        //extBox.sendKeys("Auromation step by step");
    }
}

