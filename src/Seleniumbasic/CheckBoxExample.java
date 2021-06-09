package Seleniumbasic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
	        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	        
	      WebElement checkbox_option1 = driver.findElement(By.className("cb1-element"));
	        
	        if(!checkbox_option1.isSelected()) {
	        	checkbox_option1.click();
	        }
	        System.out.println("***********************************");
	                                                                       
	  List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']//following::label"));		
		for(int i=0; i<checkBoxes.size(); i++) {
			System.out.println(checkBoxes);
			if(checkBoxes.get(i).getText().equals("Option 3")) {
				checkBoxes.get(i).click();
				break;
			}
				}
		}
	}


	
	//Using Class Name
	//WebElement checkbox_option1 = driver.findElement(By.className("cb1-element"));
    
    //if(!checkbox_option1.isSelected()) {
    	//checkbox_option1.click();
    //}
