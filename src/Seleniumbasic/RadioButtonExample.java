package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
	        driver.get("https://mdbootstrap.com/docs/standard/forms/radio/");
	     // WebElement Radiobtn_Male =  driver.findElement(By.xpath("//input[@name='optradio']"));
	    //  if(!Radiobtn_Male.isSelected()) {
	    	 // Radiobtn_Male.click();
	         //}

	      WebElement default_radio = driver.findElement(By.id("flexRadioDefault1"));
	      default_radio.click();  // if radio button 1 is selected
	      
	     WebElement defaultchecked_radio = driver.findElement(By.id("flexRadioDefault2"));
	     defaultchecked_radio.click();  // if radio button 2 is selected
}
	
}
