package Seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //Maximize Window
         driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
         WebElement first_name = driver.findElement(By.name("firstname"));
         first_name.sendKeys("Ashwini");
         WebElement last_name =driver.findElement(By.name("lastname"));
         last_name.sendKeys("Lamture");
         WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
         female.click();
         //DropDownBox If select is available
        WebElement dropDown_continents= driver.findElement(By.name("continents"));
         Select select =new Select(dropDown_continents);
         select.selectByIndex(2);
         Thread.sleep(5000);
         select.selectByVisibleText("Australia");
         Thread.sleep(5000);
         select.selectByIndex(5);
}
}