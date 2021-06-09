package CLS;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ViewForm {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://clss.somee.com/");
		 driver.manage().window().maximize(); //Maximize Window
		 
		 WebElement cls_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 cls_username.sendKeys("ajayzala");
		 WebElement cls_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 cls_password.sendKeys("a");
		 WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
		 login_button.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement viewform = driver.findElement(By.xpath("//a[@href='/viewforms']"));
		 viewform.click();
		 WebElement Viewform_search = driver.findElement(By.xpath("//input[@id='search-bar-0']"));
		 Viewform_search.sendKeys("Olive");
		 WebElement olive_status = driver.findElement(By.xpath("//a[@class='btn-link']"));
		 olive_status.click();
		 List<WebElement>status_dropdown = driver.findElements(By.xpath("//select[@name='status']"));
		
		 
		
	}

	public static void java(File screeshot, File file) {
		// TODO Auto-generated method stub
		
	}
	

}
