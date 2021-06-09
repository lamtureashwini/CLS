package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
	     driver.get("https://demoqa.com/buttons");
	    WebElement btn_rightclick = driver.findElement(By.id("rightClickBtn"));
	     Actions actions = new Actions(driver);
	     actions.contextClick(btn_rightclick).perform();
	     WebElement msg_rightclick = driver.findElement(By.id("rightClickMessage"));
	     if (msg_rightclick.getText().equals("You have done a right click")){
	    	 System.out.println("Right click action is performed");}
	     else {
	    	 System.out.println("Right click action is not performed");
	     }
	     
	        
	}

}
