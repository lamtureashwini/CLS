package CLS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerSupport_TicketStatus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/");
		 driver.manage().window().maximize(); //Maximize Window
		 
		 System.out.println("-----Let us start the sign up process!!!-----");
      	WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
      	username.sendKeys("ajayzala");
      	
      	WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
      	password.sendKeys("a");
      	
      	WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
		    login_button.click();
	Thread.sleep(11000);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //implicitly wait
		
		 
		// Store the current window handle
		 String winHandleBefore = driver.getWindowHandle();
		 driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/welcome");
		 
		 Thread.sleep(8000);
		 WebElement Customer_support = driver.findElement(By.xpath("//a[@href='/supportcenter']")); //Customer Support
		 Customer_support.click();
		 Thread.sleep(8000);
		
		 WebElement ticketstatus_button = driver.findElement(By.xpath("//a[@href='/ticketstatus']"));  //check ticket status
		 ticketstatus_button.click();
		 
		 WebElement email_address = driver.findElement(By.xpath("/descendant::input[@type='text'][1]"));  //email address
		 email_address.sendKeys("testing@gmail.com");
		 
		 WebElement ticket_number = driver.findElement(By.xpath("/descendant::input[@type='text'][2]"));  //ticket number
		 ticket_number.sendKeys("20210514001");
		 Thread.sleep(2000);
		 // Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }
		
		 // Perform the actions on new window
		 Thread.sleep(8000);
		 // Close the new window, if that window no more required
		 driver.close();

		 // Switch back to original browser (first window)
		 driver.switchTo().window(winHandleBefore);
		 driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/");
		 // Continue with original browser (first window)

		 Thread.sleep(8000);
		    
		 
		// WebElement ticketstatus_button = driver.findElement(By.xpath("//a[@href='/ticketstatus']"));  //check ticket status
		 //ticketstatus_button.click();
		 
		// WebElement email_address = driver.findElement(By.xpath("/descendant::input[@type='text'][1]"));  //email address
		 //email_address.sendKeys("testing@gmail.com");
		 
		 //WebElement ticket_number = driver.findElement(By.xpath("/descendant::input[@type='text'][2]"));  //ticket number
		//ticket_number.sendKeys("20210514001");
		 
		// WebElement emailaccess_link = driver.findElement(By.xpath("//button[@type='submit']"));
		// emailaccess_link.click();
		 
		 

	}

}
