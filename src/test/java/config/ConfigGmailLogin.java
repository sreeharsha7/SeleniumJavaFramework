package config;

import java.io.*;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigGmailLogin{

    public static void main(String[] args)  {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath + "/src/test/java/config/configDemo.properties");







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

        driver.findElement(By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.xpath("/html//input[@id='passwd']")).sendKeys(prop.getProperty("password"));



       // driver.findElement(By.xpath("/html//input[@id='search_query_top']")).sendKeys(prop.getProperty("username"));

       // driver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")).click();


        driver.findElement(By.id("SubmitLogin")).click();











        System.out.println("URL ::" + prop.getProperty("URL"));
        System.out.println("User name::" +prop.getProperty("username"));
        System.out.println("Password::" +prop.getProperty("password"));
    }
}