package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeExp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 String text= driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	     System.out.println("text");
	    // driver.findElement(By.id("a")).click();
	   //  driver.switchTo().frame("frame2");
	   //  WebElement DropDown=  driver.findElement(By.id("animals"));
	    // Select select=new Select(DropDown);
	     //select.selectByVisibleText("Big Baby Cat");
	     driver.switchTo().frame("frame1");
	     WebElement topicText= driver.findElement(By.xpath("//input[@type='text']"));
	     topicText.sendKeys("Hello");

 
	}

}
