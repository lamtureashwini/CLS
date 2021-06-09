package CLS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teamspce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
		 driver.get("http://clss.somee.com/");
		 
		 WebElement cls_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 cls_username.sendKeys("ajayzala");
		 Thread.sleep(2000);
		 WebElement cls_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 cls_password.sendKeys("a");
		 WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
		 login_button.click();

		 WebElement teamspce = driver.findElement(By.xpath("//a[@href='/teamspce']"));
		 teamspce.click();

	}

}
