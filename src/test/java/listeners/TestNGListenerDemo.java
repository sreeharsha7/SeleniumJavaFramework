package listeners;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

    @Test
    public void test1()
    {
        System.out.println("I am inside Test 1");
    }

    @Test
    public void test2()
    {
        System.out.println("I am inside Test 2");
        //Assert.assertTrue(false);

        WebElement h1;
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        //h1 = driver.findElement(By.xpath("/html//form[@id='stsf']//div[@class='a4bIc']/input[@role='combobox']"));
        h1.sendKeys("hahaha");
        h1.sendKeys(Keys.ENTER);

        driver.close();
    }

    @Test
    public void test3()
    {
        System.out.println("I am inside Test 3");
        //throw new SkipException("This test is skipped");

    }




}


