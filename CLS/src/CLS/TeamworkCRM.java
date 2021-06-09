package CLS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamworkCRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://clss.somee.com/");
		 driver.manage().window().maximize(); //Maximize Window
		 
		 WebElement cls_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 cls_username.sendKeys("ajayzala");
		 Thread.sleep(2000);
		 WebElement cls_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 cls_password.sendKeys("a");
		 
		 WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
		 login_button.click();
	}

}
