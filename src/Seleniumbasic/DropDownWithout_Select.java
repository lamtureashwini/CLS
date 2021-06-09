package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithout_Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
         driver.get("http://demo.guru99.com/V4/");
       WebElement DropDown_WithoutSelect = driver.findElement(By.xpath("//a[text()='Bank Project']"));
       DropDown_WithoutSelect.click();
       WebElement DropDown_WithoutSelect2 = driver.findElement(By.xpath("//a[text()='Bank Project V1']"));
       DropDown_WithoutSelect2.click();
        
	}

	
}
