package Seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_example {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
	        driver.get("https://www.flipkart.com/");
	        
	       String title = driver.getTitle();          //Title
	       System.out.println("title is" +title);
	       
	       String currenturl = driver.getCurrentUrl();   //Current URL
	       System.out.println("currenturl is" +currenturl);
	       
	       String pagesource = driver.getPageSource();   //Page Source
	       System.out.println("page source is" +pagesource);
	       
	       driver.close();
	       
		}
}