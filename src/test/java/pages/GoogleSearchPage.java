package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html//input[@id='search_query_top']"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html//input[@id='search_query_top']"));
		return element;
	}
	

}
