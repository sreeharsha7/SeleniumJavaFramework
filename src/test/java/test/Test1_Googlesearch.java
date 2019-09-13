/*package Test;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.SocketOption;

public class Test1_Googlesearch {

    public static void main(String[] args) {
        googleSearchtest();


    }

    public static void googleSearchtest(){

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebElement h1;

        //go to google.com
        driver.get("http://google.com");


        //enter text in search box
        //driver.findElement(By.name("q")).sendKeys("Automation step by step");
        h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        h1.sendKeys("Automation step by step");

        //click on search button
        //driver.findElement(By.name("btnk")).click();
        //driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='A8SBwf']/div[@class='FPdoLc VlcLAe']/center/input[@name='btnK']")).sendKeys(keys.ENTER);
        //h1 = driver.findElement(By.cssSelector(".FPdoLc [value='Google Search']"));
        h1.sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);


        //close browser
        driver.close();

        System.out.println("Test completed Successfully");



    }

}
*/



package Test;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_Googlesearch {

    public static void main(String[] args) {
        googleSearchtest();


    }

    public static void googleSearchtest(){

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebElement h1;

        //go to google.com
        driver.get("http://automationpractice.com/index.php");


        //enter text in search box
        //driver.findElement(By.name("q")).sendKeys("Automation step by step");
        driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys("mens wear");
        //h1.sendKeys("Automation step by step");

        //click on search button
        //driver.findElement(By.name("btnk")).click();
        driver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")).click();
        //driver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")).sendKeys(Keys.ENTER);
        //h1 = driver.findElement(By.cssSelector(".FPdoLc [value='Google Search']"));
       // h1.sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        //h1 = driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);


        //close browser
         driver.close();

        System.out.println("Test completed Successfully");



    }

}
