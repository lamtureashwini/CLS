package CLS;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginCLS {
	static WebDriver driver;
	protected String screenshotFileName = null;
	  	@BeforeClass
	  	public static void setUp(){
	         	System.out.println("-----This is the beginning of our test !!!-----");
	  	  	    System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\selenium-java-3.141.59\\\\chromedriver2\\\\chromedriver.exe");
	         	driver = new ChromeDriver();
	         	driver.manage().window().maximize();
	         	driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/");
	  	}
	  	
	  	@Test
	  	public void login(){
	         	System.out.println("-----Let us start the sign up process!!!-----");
	         	WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	         	username.sendKeys("ajayzala");
	         	
	         	WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	         	password.sendKeys("a");
	         	
	         	WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
	   		    login_button.click();

	     
	   		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicitly wait
	   		WebDriverWait wait = new WebDriverWait(driver,3);
	   		WebElement checkbox = wait.until(
	  				ExpectedConditions.visibilityOfElementLocated(By.name("agree")));
	  		checkbox.click();
	  		driver.switchTo().defaultContent();
	  		WebElement antimoney_drpdwn = driver.findElement(By.xpath("//select[@name=\"nonthirdparties\"]")); //antiMoney dropdown
			 Select select =new Select(antimoney_drpdwn);
			 select.selectByIndex(1);
	   		
			 WebElement incorporation_drpdwn = driver.findElement(By.xpath("//select[@name=\"incorporationtype\"]")); //incorporation dropdown
			 Select select0 =new Select(incorporation_drpdwn);
			 select0.selectByIndex(2);
			 
			 WebElement cmppackty_drpdwn = driver.findElement(By.xpath("//select[@name=\"companypacktype\"]")); //company pack dropdown
			 Select select1 =new Select(cmppackty_drpdwn);
			 select1.selectByIndex(1);
			 
			 WebElement payment_drpdwn = driver.findElement(By.xpath("//select[@name=\"paymenttype\"]"));  //payment dropdown
			 Select select2 =new Select(payment_drpdwn);
			 select2.selectByIndex(1);
			 
			 WebElement name_text = driver.findElement(By.xpath("/descendant::input[@id=\"firstname\"][1]"));  //First Name
			 name_text.sendKeys("Saniaa");
			 
			 WebElement last_text = driver.findElement(By.xpath("/descendant::input[@id=\"lastname\"][1]"));  //Last Name
			 last_text.sendKeys("Khan");
			 
			 WebElement Addline1_1 = driver.findElement(By.xpath("/descendant::input[@name='addressline1'][1]"));  //Address line 1
			 Addline1_1.sendKeys("Vadodar, Gujrat");
			 
			 WebElement cmp_name = driver.findElement(By.xpath("/descendant::input[@name=\"companyname\"][1]"));  //Company Name
			 cmp_name.sendKeys("Rebals Pvt Lts");
			 
			 WebElement addline1_2 = driver.findElement(By.xpath("/descendant::input[@name=\"addressline2\"][1]"));  //Address line 2
			 addline1_2.sendKeys("Vadodara, Gujrat");
			 
			 WebElement phone_number = driver.findElement(By.xpath("/descendant::input[@name=\"phone\"][1]"));  //Phone number
			 phone_number.sendKeys("9198757272");
			 
			 WebElement addline1_3 = driver.findElement(By.xpath("/descendant::input[@name=\"addressline3\"][1]"));
			 addline1_3.sendKeys("Vadodara, Gujar");
			 
			 WebElement email = driver.findElement(By.xpath("/descendant::input[@name=\"email\"][1]")); // email add
			 email.sendKeys("sania2@gmail.com");
			 
			 WebElement postcode_1 = driver.findElement(By.xpath("/descendant::input[@name=\"postal\"][1]")); // Eircode/Postcode
			 postcode_1.sendKeys("369369");
			 
			 WebElement Next_1 = driver.findElement(By.xpath("//button[@id=\"second-section\"]")); //NEXT 1
			 Next_1.click();
			 
			 WebElement popup1 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup 1
			 popup1.click();
			 
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicitly wait
			 
	  	}
	  	
	       

	  	@AfterClass
	  	public static void tearDown(){
	  		driver.quit();
	  		
	         	
	  	}
	  	
	
	  	
}
