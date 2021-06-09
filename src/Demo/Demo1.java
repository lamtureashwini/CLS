package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.youtube.com/watch?v=lpHaBO0uDPo");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        System.out.println(driver.getPageSource());
	        driver.close();
		}

	}


