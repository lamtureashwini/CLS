package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TypeCapitalLatter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
		 driver.get("https://demoqa.com/text-box");
		 //Enter Full Name
		WebElement text_username = driver.findElement(By.id("userName"));
		Actions actions = new Actions (driver);
		actions.keyDown(text_username, Keys.SHIFT).sendKeys("ashwini lamture").keyUp(Keys.SHIFT).perform();
		 //Enter Mail ID
		WebElement text_email = driver.findElement(By.id("userEmail"));
		text_email.sendKeys("ashwinilamture22@gmail.com");
		 //Enter current Address
		WebElement text_currentadd = driver.findElement(By.id("currentAddress"));
		text_currentadd.sendKeys("Mahesh Complex, Waghodia Road,Vadodara,Gujrat 390019");
		
		//select the current address Ctrl + A
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//Copy current address Ctrl + C
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Switch the TAB Key to Permanent address 
		actions.sendKeys(Keys.TAB).build().perform();
		
		//Paste the address in permanent address
		WebElement text_permanentadd = driver.findElement(By.id("permanentAddress"));
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		driver.close();
		
	}

}
