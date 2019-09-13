import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

    WebDriver driver = null;
    WebElement h1;

    public static void main(String[] args) {

        WebDriverManager.iedriver().setup();

        //System.setProperty("webdriver.ie.driver", "C:\\Users\\s.singamsetty\\IdeaProjects\\SeleniumJavaFramework\\Drivers\\IEdriver\\IEDriverServer.exe");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("ignoreProtectedModeSettings",true);

        WebDriver driver = new InternetExplorerDriver(caps);
        WebElement h1;




        driver.get("http://google.com");

        h1 = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        h1.sendKeys("Automation step by step");

        h1.sendKeys(Keys.RETURN);

        driver.close();

        System.out.println("Test completed Successfully");





    }

}
