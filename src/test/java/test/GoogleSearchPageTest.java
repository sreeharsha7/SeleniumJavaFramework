/*package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

    static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest(){


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();



        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        driver.get("https://google.com");

        searchPageObj.setTextInSearchBox("Sree harsha Singamsetty");

        searchPageObj.clickSearchButton();
        driver.close();

    }


}
*/


package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

    static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest(){


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();



        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        driver.get("http://automationpractice.com/index.php");

        searchPageObj.setTextInSearchBox("Printed Chiffon Dress");

        searchPageObj.clickSearchButton();
        //driver.close();

    }


}
