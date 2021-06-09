package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
	     driver.get("https://demoqa.com/buttons");
	     WebElement btn_doubleclk = driver.findElement(By.id("doubleClickBtn"));
	     Actions actions = new Actions (driver);
	     actions.doubleClick(btn_doubleclk).perform();
	     WebElement msg_doubleclk = driver.findElement(By.id("doubleClickMessage"));
	     if (msg_doubleclk.getText().equals("You have done a double click")) {
	    	 System.out.println("Double Click Action is performed");
	     }
	     else {
	    	 System.out.println("Double Click Action is not performed");
	     }

	}

}
