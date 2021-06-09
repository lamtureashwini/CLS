package CLS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerSupport_CreateNewTicket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/welcome");
		 
		 driver.manage().window().maximize(); //Maximize Window
		 
		 WebElement cls_username = driver.findElement(By.xpath("//input[@placeholder='Username']")); //UserName
		cls_username.sendKeys("ajayzala");
		 
		WebElement cls_password = driver.findElement(By.xpath("//input[@placeholder='Password']")); //Password
		 cls_password.sendKeys("a");
		 
		
		 WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));  //Login Button
		 login_button.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement Customer_support = driver.findElement(By.xpath("//a[@href='/supportcenter']")); //Customer Support
		 Customer_support.click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // implicity wait
		 
		 WebElement OpenNewTicket = driver.findElement(By.xpath("/descendant::a[@href=\"/opennewticket\"][2]"));  //Open New Ticket
		 OpenNewTicket.click();
		 
		 WebElement Email_address = driver.findElement(By.xpath("//input[@type='email']"));  // open a new ticket email address
		 Email_address.sendKeys("testing@gmail.com");
		 
		 WebElement newticket_name = driver.findElement(By.xpath("/descendant::input[@type='text'][1]"));  // Open a new ticket name value
		 newticket_name.sendKeys("Testing demo");
		 
		 WebElement business = driver.findElement(By.xpath("/descendant::input[@type='text'][2]"));  //open a new ticket business value
		 business.sendKeys("testing");
		 
		 WebElement phone_number = driver.findElement(By.xpath("/descendant::input[@type='number'][1]"));  //open a new ticket phone number
		 phone_number.sendKeys("7558260158");
		
		 WebElement Countrycode_etx = driver.findElement(By.xpath("/descendant::input[@type='number'][2]"));  //open a new ticket ext
		 Countrycode_etx.sendKeys("+91");
		 
		 WebElement helptopic_dropdown = driver.findElement(By.xpath("//select[@name='helptopics']"));  //help topic drop down
		 Select select = new Select(helptopic_dropdown);
		 select.selectByIndex(1);
		 
		 WebElement issue_summery = driver.findElement(By.xpath("/descendant::input[@type='text'][3]"));  //Issue Summary
		 issue_summery.sendKeys("Issue summery for testing");
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  // implicity wait
		 
		// WebElement tinymce = driver.findElement(By.xpath("//body[@id=\"tinymce\"]")); //paragraph content
		// tinymce.sendKeys("you can write anything");
		 
		 WebDriverWait wait = new WebDriverWait (driver,70);  //Explicity wait
		 WebElement submit_btn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("\"//button[@type='submit']"))));
		 submit_btn.click();
		// WebElement CreateTicket_button = driver.findElement(By.xpath("//button[@type='submit']"));
		 //CreateTicket_button.click();
		 
		 
		 
		
	}

}
