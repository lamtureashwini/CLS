package CLS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerSupport_TicketThread {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://clss.somee.com/");
		 driver.manage().window().maximize(); //Maximize Window
		 
		 WebElement cls_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 cls_username.sendKeys("ashwini123");
		 WebElement cls_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 cls_password.sendKeys("@shwini123");
		 WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
		 login_button.click();
		 
		 WebElement search = driver.findElement(By.xpath("//input[@id=\"search-bar-0\"]"));
		 search.sendKeys("Ashwini Lamture");
		 
		 WebElement ticket_status = driver.findElement(By.xpath("/descendant::a[@class='btn-link'][1]"));
		 ticket_status.click();
		 
		 WebElement ticketstatus_dropdown = driver.findElement(By.xpath("//select[@name='status']"));  //select dropdown ticket status
		 Select select = new Select(ticketstatus_dropdown);
		 select.selectByVisibleText("close");
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);  //Explicit Wait
		 WebElement Postsubmit_btn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
		 
		 WebElement cancel = driver.findElement(By.xpath("/descendant::button[@type='button'][19]"));  //Cancel button
		 cancel.click();
		 
		 WebElement signin_back = driver.findElement(By.xpath("//span[@class=\"navbar-text\"]"));   //Signin Button
		 signin_back.click();
		 
		 WebElement profile_btn = driver.findElement(By.xpath("//a[@aria-haspopup=\"true\"]"));  //Profile button
		 profile_btn.click();
		 
		 WebElement logout_btn = driver.findElement(By.xpath("/descendant::button[@type=\"button\"][4]"));
		 logout_btn.click();
		 	
		 
		 
	}

}

