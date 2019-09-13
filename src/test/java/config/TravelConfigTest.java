package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.ui.Select;


public class TravelConfigTest {

    public static void main(String[] args)  {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath + "/src/test/java/config/configtravel.properties");

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get(prop.getProperty("URL"));
        //driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));

       //driver.findElement(By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']")).click();

        //Select drpCountry = new Select(driver.findElement(By.xpath("//nav[@class='navbar navbar-default']//div[@class='collapse navbar-collapse']/ul[2]/ul/li[@id='li_myaccount']/a[@href='javascript:void(0);']")));

        Select drpCountry = new Select(driver.findElement(By.name("MY ACCOUNT")));

        drpCountry.selectByVisibleText("LOGIN");


       // driver.findElement(By.xpath("//nav[@class='navbar navbar-default']//div[@class='collapse navbar-collapse']/ul[2]/ul/li[@id='li_myaccount']/a[@href='javascript:void(0);']")).click();


        //
        //driver.findElement(By.xpath("nav[@class='navbar navbar-default']//div[@class='collapse navbar-collapse']/ul[2]/ul/li[@id='li_myaccount']/ul[@class='dropdown-menu']//a[@href='https://www.phptravels.net/login']")).click();




        driver.findElement(By.xpath("//form[@id='loginfrm']/div[@class='panel panel-default']/div[5]/div[@class='panel-body']//input[@name='username']")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.xpath("//form[@id='loginfrm']/div[@class='panel panel-default']/div[5]/div[@class='panel-body']//input[@name='password']")).sendKeys(prop.getProperty("password"));



        // driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(prop.getProperty("username"));

        driver.findElement(By.xpath("form[@id='loginfrm']/button[@type='submit']")).click();

        //
        driver.findElement(By.id("SubmitLogin")).click();









        System.out.println("URL ::" + prop.getProperty("URL"));
        System.out.println("User name::" +prop.getProperty("username"));
        System.out.println("Password::" +prop.getProperty("password"));
    }
}