package CLS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class CLS_Form {
	
	static WebDriver driver;
	
	@BeforeClass

	public void setup() {
		System.out.println("-----This is the beginning of our test !!!-----");
	  	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver2\\chromedriver.exe");
     	driver = new ChromeDriver();
     	driver.manage().window().maximize();
     	String baseUrl = "https://master.d1xvh62xwa1sk9.amplifyapp.com/";
     	//driver.get("https://master.d1xvh62xwa1sk9.amplifyapp.com/");
     	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     	driver.get(baseUrl);
     	
	}
	@Test
  	public void login() throws InterruptedException{
         	System.out.println("-----Let us start the sign up process!!!-----");
         	WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
         	username.sendKeys("ajayzala");
         	
         	WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
         	password.sendKeys("a");
         	
         	WebElement login_button = driver.findElement(By.xpath("//button[@variant='contained']"));
   		    login_button.click();
   	
  		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //implicitly wait
  		 WebDriverWait wait = new WebDriverWait(driver,10);
  		 
  		//WebElement checkbox = driver.findElement(By.name("agree"));
  		 
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
		 name_text.sendKeys("Sania");
		 
		 WebElement last_text = driver.findElement(By.xpath("/descendant::input[@id=\"lastname\"][1]"));  //Last Name
		 last_text.sendKeys("Khan");
		 
		 WebElement Addline1_1 = driver.findElement(By.xpath("/descendant::input[@name='addressline1'][1]"));  //Address line 1
		 Addline1_1.sendKeys("Vadodar, Gujrat");
		 
		 WebElement cmp_name = driver.findElement(By.xpath("/descendant::input[@name=\"companyname\"][1]"));  //Company Name
		 cmp_name.sendKeys("Red Label Pvt Lts");
		 
		 WebElement addline1_2 = driver.findElement(By.xpath("/descendant::input[@name=\"addressline2\"][1]"));  //Address line 2
		 addline1_2.sendKeys("Vadodara, Gujrat");
		 
		 WebElement phone_number = driver.findElement(By.xpath("/descendant::input[@name=\"phone\"][1]"));  //Phone number
		 phone_number.sendKeys("9198757272");
		 
		 WebElement addline1_3 = driver.findElement(By.xpath("/descendant::input[@name=\"addressline3\"][1]"));
		 addline1_3.sendKeys("Vadodara, Gujar");
		 
		 WebElement email = driver.findElement(By.xpath("/descendant::input[@name=\"email\"][1]")); // email add
		 email.sendKeys("sania123@gmail.com");
		 
		 WebElement postcode_1 = driver.findElement(By.xpath("/descendant::input[@name=\"postal\"][1]")); // Eircode/Postcode
		 postcode_1.sendKeys("369369");
		 
		 WebElement Next_1 = driver.findElement(By.xpath("//button[@id=\"second-section\"]")); //NEXT 1
		 Next_1.click();
		 
		 WebElement popup1 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup 1
		 popup1.click();
		 
		//Company Incorporation Required Details (Please Complete in Full)

  		 WebElement first_Choice = driver.findElement(By.xpath("//input[@name=\"firstchoice\"]")); // first_Choice
  		 first_Choice.sendKeys("sania 1");
  		 
  		 WebElement second_Choice = driver.findElement(By.xpath("//input[@name=\"secondchoice\"]")); // second_Choice
  		 second_Choice.sendKeys("sania 2");
  		
  		 WebElement third_Choice = driver.findElement(By.xpath("//input[@name=\"thirdchoice\"]")); // third_Choice
  		 third_Choice.sendKeys("sania 3");
  		
  		 WebElement prin_activity = driver.findElement(By.xpath("//input[@name=\"principalactivity\"]")); // principalactivity
  		 prin_activity.sendKeys("principalactivity");
  		
  		 WebElement add_wordg = driver.findElement(By.xpath("//textarea[@name=\"additionwording\"]")); // Additinal Wording
  		 add_wordg.sendKeys("principalactivity");
  		 
  		 WebElement company_type = driver.findElement(By.xpath("//select[@name=\"companytype\"]"));  //compny type dropdown
  		 Select select3 = new Select (company_type);
  		 select3.selectByIndex(1);
  		
  		// WebElement Next_2 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));  //next 2
  		 //Next_2.click();
  		WebElement element = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
  		JavascriptExecutor executor = (JavascriptExecutor)driver;
  		executor.executeScript("arguments[0].click();", element);
  		
  		
  		Thread.sleep(8000);

  		 WebElement popup2 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup 2
		 popup2.click();
		 
		 //Share Capital
  	
		
  		WebElement issued_share_capital = driver.findElement(By.xpath("//input[@name=\"issuedsharecapital\"]"));  //issued_share_capital
  		issued_share_capital.sendKeys("10000") ; 
  		
  		WebElement nominal_amt_perShare = driver.findElement(By.xpath("//input[@name=\"nominalamountpershare\"]"));  //Nominal amt per share
  		nominal_amt_perShare.sendKeys("10000") ; 
  		
  		WebElement share_class = driver.findElement(By.xpath("//input[@name=\"shareclass\"]"));  //share_class
  		share_class.sendKeys("10000") ; 
  		
  		WebElement optl_LTD = driver.findElement(By.xpath("//input[@name=\"authorisedsharecapital\"]"));  //authorisedsharecapital
  		optl_LTD.sendKeys("10000") ; 
  		
  		
  		WebElement Next_3 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")); //Next_3
  		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
  		executor1.executeScript("arguments[0].click();", Next_3);
  		Thread.sleep(8000);
  		 WebElement popup3 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup3
		 popup3.click();
		 
		// Company Secretary Details

  		WebElement first_name = driver.findElement(By.xpath("/descendant::input[@id=\"firstname\"][2]"));  //Secretary First Name
  		first_name.sendKeys("ashwini");
		 
		 WebElement last_name = driver.findElement(By.xpath("/descendant::input[@id=\"lastname\"][2]"));  //Last Name
		 last_name.sendKeys("Lamture");
		 
		 WebElement secretary_DOB = driver.findElement(By.xpath("/descendant::input[@name=\"dob\"][1]"));  //DOB
		 secretary_DOB.sendKeys("01-01-1900");
		 
		 driver.findElement(By.xpath("(//input[@name=\"addressline1\"])[2]")).sendKeys("Vadodara, Gujrat1");  //Address line1
		 driver.findElement(By.xpath("(//input[@name=\"addressline2\"])[2]")).sendKeys("Vadodara, Gujrat2");  //Address line2
		 driver.findElement(By.xpath("(//input[@name=\"addressline3\"])[2]")).sendKeys("Vadodara, Gujrat2");  //Address line3
		 driver.findElement(By.xpath("(//input[@name=\"postal\"])[2]")).sendKeys("AR3056");  //Postal 2
		 driver.findElement(By.xpath("(//input[@name=\"country\"])[1]")).sendKeys("INDIA"); //Country 1
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@name=\"country\"])[1]")).sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@name=\"companyname\"])[2]")).sendKeys("TATA Ltd"); // Company Name
		 driver.findElement(By.xpath("(//input[@name=\"companynumber\"])[1]")).sendKeys("9196748596"); //Company Number
		 driver.findElement(By.xpath("(//input[@name=\"companydirector\"])[1]")).sendKeys("Mrs.Kavya");  //Company Director
		 driver.findElement(By.xpath("(//input[@name=\"companyregiseroffice\"])[1]")).sendKeys("Vadodara, Gujrat2");  //Registered Office
		 driver.findElement(By.xpath("(//input[@name=\"companyaddressline1\"])[1]")).sendKeys("Vadodara, Gujrat2"); //Address Line 1
		 driver.findElement(By.xpath("(//input[@name=\"companyaddressline2\"])[1]")).sendKeys("Vadodara, Gujrat2"); //Address Line 2
		 driver.findElement(By.xpath("(//input[@name=\"companypostal\"])[1]")).sendKeys("369369");  //Eircode/Postcode
		 driver.findElement(By.xpath("(//input[@name=\"companycountry\"])[1]")).sendKeys("INDIA");  //Country
		 WebElement Next_4 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[4]")); //Next_4
	  		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	  		executor2.executeScript("arguments[0].click();", Next_4);
	  		Thread.sleep(8000);
	  		 WebElement popup4 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup4
			 popup4.click();
			
			 //Company Director(s)
			 //Director 1

			 driver.findElement(By.xpath("(//input[@id=\"firstname1\"])[1]")).sendKeys("Divya"); //FirstName1
			 driver.findElement(By.xpath("(//input[@id=\"lastname1\"])[1]")).sendKeys("Bharti");  //LastName1
			 driver.findElement(By.xpath("(//input[@id=\"dob1\"])[1]")).sendKeys("02/02/1997"); //DOB1
			 driver.findElement(By.id("ocuu1")).sendKeys("Owner");
			 driver.findElement(By.id("addline1_1")).sendKeys("Vadodara, Gujrat"); //Address Line 1
			 driver.findElement(By.id("addline1_2")).sendKeys("Vadodara, Gujrat"); //Address Line 2
			 driver.findElement(By.id("addline1_3")).sendKeys("Vadodara, Gujrat"); //Address Line 3
			 driver.findElement(By.id("postal1")).sendKeys("Vadodara, Gujrat"); //Eircode/Postcode
			 driver.findElement(By.xpath("(//input[@id=\"country1\"])[1]")).sendKeys("INDIA");//Country
			 driver.findElement(By.xpath("(//input[@id=\"nationality1\"])[1]")).sendKeys("INDIAN"); //Nationality
			 driver.findElement(By.id("otherdirectorship1_1")).sendKeys("Other1"); //Other Directorship 1
			 driver.findElement(By.id("otherdirectorship2_1")).sendKeys("Other2"); //Other Directorship 2
			 driver.findElement(By.id("otherdirectorship3_1")).sendKeys("Other3"); //Other Directorship 3
			 driver.findElement(By.id("restricted1")).sendKeys("Other3"); //Disqualified or Restricted
			 driver.findElement(By.xpath("(//input[@id=\"numberofshare1\"])[1]")).sendKeys("200"); //numberofshare1
			 WebElement beneficialowner1 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner1\"])[1]")); //beneficialowner1
			 Select select5 =new Select(beneficialowner1);
			 select5.selectByIndex(1);
			 
			 //Director 2

			 driver.findElement(By.xpath("(//input[@id=\"firstname2\"])[1]")).sendKeys("Divya1"); //firstname2
			 driver.findElement(By.xpath("(//input[@id=\"lastname2\"])[1]")).sendKeys("Bharti1"); //lastname2
			 driver.findElement(By.id("dob2")).sendKeys("03/05/1997"); //DOB2
			 driver.findElement(By.id("ocuu2")).sendKeys("Owner2");
			 driver.findElement(By.id("addline2_1")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 1
			 driver.findElement(By.id("addline2_2")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 2
			 driver.findElement(By.id("addline2_3")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 3
			 driver.findElement(By.id("postal2")).sendKeys("369321"); //Eircode/Postcode2
			 driver.findElement(By.xpath("(//input[@id=\"country2\"])[1]")).sendKeys("INDIA");//Country2
			 driver.findElement(By.xpath("(//input[@id=\"nationality2\"])[1]")).sendKeys("INDIAN"); //Nationality2
			 driver.findElement(By.id("otherdirectorship1_2")).sendKeys("Other1"); //Other Directorship 1
			 driver.findElement(By.id("otherdirectorship2_2")).sendKeys("Other2"); //Other Directorship 2
			 driver.findElement(By.id("otherdirectorship3_2")).sendKeys("Other3"); //Other Directorship 3
			 driver.findElement(By.id("restricted2")).sendKeys("Other3"); //Disqualified or Restricted
			 driver.findElement(By.xpath("(//input[@id=\"numberofshare2\"])[1]")).sendKeys("200"); //numberofshare2
			 WebElement beneficialowner2 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner2\"])[1]")); //beneficialowner2
			 Select select6 =new Select(beneficialowner2);
			 select6.selectByIndex(1);
			 
			 
			 //Director 3
			 driver.findElement(By.xpath("(//input[@id=\"firstname3\"])[1]")).sendKeys("Divya3"); //firstname3
			 driver.findElement(By.xpath("(//input[@id=\"lastname3\"])[1]")).sendKeys("Bharti3"); //lastname3
			 driver.findElement(By.id("dob3")).sendKeys("03/05/1997"); //DOB3
			 driver.findElement(By.id("ocuu3")).sendKeys("Owner3");
			 driver.findElement(By.id("addline3_1")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 1
			 driver.findElement(By.id("addline3_2")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 2
			 driver.findElement(By.id("addline3_3")).sendKeys("Vadodara, Gujrat1"); //Address Line2_ 3
			 driver.findElement(By.id("postal3")).sendKeys("369321"); //Eircode/Postcode2
			 driver.findElement(By.xpath("(//input[@id=\"country3\"])[1]")).sendKeys("INDIA");//Country3
			 driver.findElement(By.xpath("(//input[@id=\"nationality3\"])[1]")).sendKeys("INDIAN"); //Nationality3
			 driver.findElement(By.id("otherdirectorship1_3")).sendKeys("Other1"); //Other Directorship 1
			 driver.findElement(By.id("otherdirectorship2_3")).sendKeys("Other2"); //Other Directorship 2
			 driver.findElement(By.id("otherdirectorship3_3")).sendKeys("Other3"); //Other Directorship 3
			 driver.findElement(By.id("restricted3")).sendKeys("Other3"); //Disqualified or Restricted
			 driver.findElement(By.xpath("(//input[@id=\"numberofshare3\"])[1]")).sendKeys("200"); //numberofshare3
			 WebElement beneficialowner3 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner3\"])[1]")); //beneficialowner3
			 Select select7 =new Select(beneficialowner3);
			 select7.selectByIndex(1);
			 WebElement add_moreDic = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add MoreDirector
		  		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		  		executor3.executeScript("arguments[0].click();", add_moreDic);
		  		
		  	//Director 4
		  	 driver.findElement(By.xpath("(//input[@id=\"firstname4\"])[1]")).sendKeys("Divya3"); //firstname4
			 driver.findElement(By.xpath("(//input[@id=\"lastname4\"])[1]")).sendKeys("Bharti3"); //lastname4
			 driver.findElement(By.id("dob4")).sendKeys("03/05/1997"); //DOB4
			 driver.findElement(By.id("occupation4")).sendKeys("Owner4");
			 driver.findElement(By.id("addressline4_1")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 1
			 driver.findElement(By.id("addressline2_4")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 2
			 driver.findElement(By.id("addressline3_4")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 3
			 driver.findElement(By.id("postal4")).sendKeys("369321"); //Eircode/Postcode4	
			 driver.findElement(By.xpath("(//input[@id=\"country4\"])[1]")).sendKeys("INDIA");//Country3
			 driver.findElement(By.xpath("(//input[@id=\"nationality4\"])[1]")).sendKeys("INDIAN"); //Nationality3
			 driver.findElement(By.id("otherdirectorship4_1")).sendKeys("Other1"); //Other Directorship 1
			 driver.findElement(By.id("otherdirectorship4_2")).sendKeys("Other2"); //Other Directorship 2
			 driver.findElement(By.id("otherdirectorship4_3")).sendKeys("Other3"); //Other Directorship 3
			 driver.findElement(By.id("restricted4")).sendKeys("Other3"); //Disqualified or Restricted
			 driver.findElement(By.xpath("(//input[@id=\"numberofshare4\"])[1]")).sendKeys("200"); //numberofshare3	
			 WebElement beneficialowner4 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner4\"])[1]")); //beneficialowner3
			 Select select8 =new Select(beneficialowner4);
			 select8.selectByIndex(1);
			 
			 WebElement add_moreDic1 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add MoreDirector
		  		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		  		executor4.executeScript("arguments[0].click();", add_moreDic1);	
		  		
		  	//Director 5
		  		
		  		driver.findElement(By.xpath("(//input[@id=\"firstname5\"])[1]")).sendKeys("Divya3"); //firstname5
				 driver.findElement(By.xpath("(//input[@id=\"lastname5\"])[1]")).sendKeys("Bharti3"); //lastname5
				 driver.findElement(By.id("dob5")).sendKeys("03/05/1997"); //DOB5
				 driver.findElement(By.id("occupation5")).sendKeys("Owner4");
				 driver.findElement(By.id("addressline1_5")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 1
				 driver.findElement(By.id("addressline2_5")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 2
				 driver.findElement(By.id("addressline3_5")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 3
				 driver.findElement(By.id("postal5")).sendKeys("369321"); //Eircode/Postcode5
				 driver.findElement(By.xpath("(//input[@id=\"country5\"])[1]")).sendKeys("INDIA");//Country5
				 driver.findElement(By.xpath("(//input[@id=\"nationality5\"])[1]")).sendKeys("INDIAN"); //Nationality5
				 driver.findElement(By.id("otherdirectorship5_1")).sendKeys("Other1"); //Other Directorship 1
				 driver.findElement(By.id("otherdirectorship5_2")).sendKeys("Other2"); //Other Directorship 2
				 driver.findElement(By.id("otherdirectorship5_3")).sendKeys("Other3"); //Other Directorship 3
				 driver.findElement(By.id("restricted5")).sendKeys("Other3"); //Disqualified or Restricted
				 driver.findElement(By.xpath("(//input[@id=\"numberofshare5\"])[1]")).sendKeys("200"); //numberofshare5
				 WebElement beneficialowner5 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner5\"])[1]")); //beneficialowner5
				 Select select9 =new Select(beneficialowner5);
				 select9.selectByIndex(1);
				 WebElement add_moreDic2 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add MoreDirector
			  		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
			  		executor5.executeScript("arguments[0].click();", add_moreDic2);	
		  		
		  		//Director 6

					driver.findElement(By.xpath("(//input[@id=\"firstname6\"])[1]")).sendKeys("Divya3"); //firstname6
					 driver.findElement(By.xpath("(//input[@id=\"lastname6\"])[1]")).sendKeys("Bharti3"); //lastname6
					 driver.findElement(By.id("dob6")).sendKeys("03/05/1997"); //DOB6
					 driver.findElement(By.id("occupation6")).sendKeys("Owner4");
					 driver.findElement(By.id("addressline1_6")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 1
					 driver.findElement(By.id("addressline2_6")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 2
					 driver.findElement(By.id("addressline3_6")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 3
					 driver.findElement(By.id("postal6")).sendKeys("369321"); //Eircode/Postcode6
					 driver.findElement(By.xpath("(//input[@id=\"country6\"])[1]")).sendKeys("INDIA");//Country6
					 driver.findElement(By.xpath("(//input[@id=\"nationality6\"])[1]")).sendKeys("INDIAN"); //Nationality6
					 driver.findElement(By.id("otherdirectorship6_1")).sendKeys("Other1"); //Other Directorship 1
					 driver.findElement(By.id("otherdirectorship6_2")).sendKeys("Other2"); //Other Directorship 2
					 driver.findElement(By.id("otherdirectorship6_3")).sendKeys("Other3"); //Other Directorship 3
					 driver.findElement(By.id("restricted6")).sendKeys("Other3"); //Disqualified or Restricted
					 driver.findElement(By.xpath("(//input[@id=\"numberofshare6\"])[1]")).sendKeys("200"); //numberofshare6
					 WebElement beneficialowner6 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner6\"])[1]")); //beneficialowner6
					 Select select10 =new Select(beneficialowner6);
					 select10.selectByIndex(1);
					 WebElement add_moreDic3 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add MoreDirector
				  		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
				  		executor6.executeScript("arguments[0].click();", add_moreDic3);	
						
			  		
		  		//Director 7

		  		
					driver.findElement(By.xpath("(//input[@id=\"firstname7\"])[1]")).sendKeys("Divya3"); //firstname7
					driver.findElement(By.xpath("(//input[@id=\"lastname7\"])[1]")).sendKeys("Bharti3"); //lastname7
					driver.findElement(By.id("dob7")).sendKeys("03/05/1997"); //DOB7
					driver.findElement(By.id("occupation7")).sendKeys("Owner4");
					driver.findElement(By.id("addressline1_7")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 1
				    driver.findElement(By.id("addressline2_7")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 2
					 driver.findElement(By.id("addressline3_7")).sendKeys("Vadodara, Gujrat12"); //Address Line2_ 3
					 driver.findElement(By.id("postal7")).sendKeys("369321"); //Eircode/Postcode4	
					 driver.findElement(By.xpath("(//input[@id=\"country7\"])[1]")).sendKeys("INDIA");//Country3
					 driver.findElement(By.xpath("(//input[@id=\"nationality7\"])[1]")).sendKeys("INDIAN"); //Nationality3
					 driver.findElement(By.id("otherdirectorship7_1")).sendKeys("Other1"); //Other Directorship 1
					driver.findElement(By.id("otherdirectorship7_2")).sendKeys("Other2"); //Other Directorship 2
					 driver.findElement(By.id("otherdirectorship7_3")).sendKeys("Other3"); //Other Directorship 3
					 driver.findElement(By.id("restricted7")).sendKeys("Other3"); //Disqualified or Restricted
					 driver.findElement(By.xpath("(//input[@id=\"numberofshare7\"])[1]")).sendKeys("200"); //numberofshare7
						WebElement beneficialowner7 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner7\"])[1]")); //beneficialowner3
						 Select select11 =new Select(beneficialowner7);
					 select11.selectByIndex(1);
						
						 WebElement Next_5 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[5]")); //Next_5
					  	JavascriptExecutor executor13 = (JavascriptExecutor)driver;
					  	executor13.executeScript("arguments[0].click();", Next_5);
					  		
					  		//WebDriverWait wait5 = new WebDriverWait(driver, 40);
					  		//wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type=\"submit\"])[5]"))).click();	
					  		Thread.sleep(12000);
					  		WebElement popup5 = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")); //popup5
							 popup5.click();
							 Thread.sleep(11000);
							 
		//Subscriber Details (Individual)
		// Subscriber 1
				driver.findElement(By.xpath("(//input[@id=\"firstname1\"])[2]")).sendKeys("Divya4"); //firstname1
				driver.findElement(By.xpath("(//input[@id=\"lastname1\"])[2]")).sendKeys("Divya4"); //Lastname1
				driver.findElement(By.xpath("(//input[@id=\"addressline1_1\"])[1]")).sendKeys("addressline1_1"); //Address Line 1
				driver.findElement(By.xpath("(//input[@id=\"addressline1_2\"])[1]")).sendKeys("addressline1_1"); //Address Line 2
				driver.findElement(By.xpath("(//input[@id=\"addressline1_3\"])[1]")).sendKeys("addressline1_3"); //Address Line 3
				driver.findElement(By.xpath("(//input[@id=\"postalcode1\"])[1]")).sendKeys("369369"); //postalcode1
				driver.findElement(By.xpath("(//input[@id=\"country1\"])[2]")).sendKeys("INDIA"); //Country1
				driver.findElement(By.xpath("(//input[@id=\"nationality1\"])[2]")).sendKeys("INDIAN"); //nationality1
				driver.findElement(By.xpath("(//input[@id=\"occupation1\"])[1]")).sendKeys("Director"); //occupation1
				driver.findElement(By.xpath("(//input[@id=\"numberofshare1\"])[2]")).sendKeys("200"); //numberofshare1
				WebElement beneficialowner8 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner1\"])[2]")); //beneficialowner1
				 Select selecta =new Select(beneficialowner8);
				 selecta.selectByIndex(1);
				 Thread.sleep(1000);
				 
			// Subscriber 2
				driver.findElement(By.xpath("(//input[@id=\"firstname2\"])[2]")).sendKeys("Divya4"); //firstname2
				driver.findElement(By.xpath("(//input[@id=\"lastname2\"])[2]")).sendKeys("Divya4"); //Lastname2
				driver.findElement(By.xpath("(//input[@id=\"addressline2_1\"])[1]")).sendKeys("addressline1_1"); //Address Line 1
				driver.findElement(By.xpath("(//input[@id=\"addressline2_2\"])[1]")).sendKeys("addressline1_1"); //Address Line 2
				driver.findElement(By.xpath("(//input[@id=\"addressline2_3\"])[1]")).sendKeys("addressline1_3"); //Address Line 3
				driver.findElement(By.xpath("(//input[@id=\"postalcode2\"])[1]")).sendKeys("369369"); //postalcode2
				driver.findElement(By.xpath("(//input[@id=\"country2\"])[2]")).sendKeys("INDIA"); //Country2
				driver.findElement(By.xpath("(//input[@id=\"nationality2\"])[2]")).sendKeys("INDIAN"); //nationality2
				driver.findElement(By.xpath("(//input[@id=\"occupation2\"])[1]")).sendKeys("Director"); //occupation2
				driver.findElement(By.xpath("(//input[@id=\"numberofshare2\"])[2]")).sendKeys("200"); //numberofshare2
				WebElement beneficialowner9 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner2\"])[2]")); //beneficialowner2
					 Select selecta1 =new Select(beneficialowner9);
					 selecta1.selectByIndex(1);	 
				 
		// Subscriber 3	 
				 
				driver.findElement(By.xpath("(//input[@id=\"firstname3\"])[2]")).sendKeys("Divya4"); //firstname3
				driver.findElement(By.xpath("(//input[@id=\"lastname3\"])[2]")).sendKeys("Divya4"); //Lastname3
				driver.findElement(By.xpath("(//input[@id=\"addressline3_1\"])[1]")).sendKeys("addressline1_1"); //Address Line 1
				driver.findElement(By.xpath("(//input[@id=\"addressline3_2\"])[1]")).sendKeys("addressline1_1"); //Address Line 2
				driver.findElement(By.xpath("(//input[@id=\"addressline3_3\"])[1]")).sendKeys("addressline1_3"); //Address Line 3
				driver.findElement(By.xpath("(//input[@id=\"postalcode3\"])[1]")).sendKeys("369369"); //postalcode3
				driver.findElement(By.xpath("(//input[@id=\"country3\"])[2]")).sendKeys("INDIA"); //Country3
				driver.findElement(By.xpath("(//input[@id=\"nationality3\"])[2]")).sendKeys("INDIAN"); //nationality3
				driver.findElement(By.xpath("(//input[@id=\"occupation3\"])[1]")).sendKeys("Director"); //occupation3
				driver.findElement(By.xpath("(//input[@id=\"numberofshare3\"])[2]")).sendKeys("200"); //numberofshare3
				WebElement beneficialowner10 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner3\"])[2]")); //beneficialowner3
							 Select selecta2 =new Select(beneficialowner10);
							 selecta2.selectByIndex(1);	 	
			Thread.sleep(8000);			 
			WebElement add_sub = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber1
			JavascriptExecutor executa = (JavascriptExecutor)driver;
				executa.executeScript("arguments[0].click();", add_sub);			 
				 Thread.sleep(1000);
				 
		// Subscriber 4	 		 
				driver.findElement(By.xpath("(//input[@id=\"firstname4\"])[2]")).sendKeys("Divya4"); //firstname4
				driver.findElement(By.xpath("(//input[@id=\"lastname4\"])[2]")).sendKeys("Divya4"); //Lastname4
				driver.findElement(By.xpath("(//input[@id=\"addressline1_4\"])[1]")).sendKeys("addressline1_1"); //Address Line 1
				driver.findElement(By.xpath("(//input[@id=\"addressline2_4\"])[2]")).sendKeys("addressline1_1"); //Address Line 2
				driver.findElement(By.xpath("(//input[@id=\"addressline3_4\"])[2]")).sendKeys("addressline1_3"); //Address Line 3
				driver.findElement(By.xpath("(//input[@id=\"postalcode4\"])[1]")).sendKeys("369369"); //postalcode4
				driver.findElement(By.xpath("(//input[@id=\"country4\"])[2]")).sendKeys("INDIA"); //Country4
				driver.findElement(By.xpath("(//input[@id=\"nationality4\"])[2]")).sendKeys("INDIAN"); //nationality4
				driver.findElement(By.xpath("(//input[@id=\"occupation4\"])[2]")).sendKeys("Director"); //occupation4
				driver.findElement(By.xpath("(//input[@id=\"numberofshare4\"])[2]")).sendKeys("200"); //numberofshare4
				WebElement beneficialowner11 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner4\"])[2]")); //beneficialowner4
				Select selecta3 =new Select(beneficialowner11);
			selecta3.selectByIndex(1);	 			 
			Thread.sleep(8000);			 
			WebElement add_sub1 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber1
			JavascriptExecutor executa1 = (JavascriptExecutor)driver;
				executa1.executeScript("arguments[0].click();", add_sub1);			 
				 Thread.sleep(1000);		 
		
		// Subscriber 5	
	 
			driver.findElement(By.xpath("(//input[@id=\"firstname5\"])[2]")).sendKeys("Divya5"); //firstname5
			driver.findElement(By.xpath("(//input[@id=\"lastname5\"])[2]")).sendKeys("Divya5"); //Lastname5
			driver.findElement(By.xpath("(//input[@id=\"addressline1_5\"])[2]")).sendKeys("addressline1_1"); //Address Line 1
			driver.findElement(By.xpath("(//input[@id=\"addressline2_5\"])[2]")).sendKeys("addressline1_1"); //Address Line 2
			driver.findElement(By.xpath("(//input[@id=\"addressline3_5\"])[2]")).sendKeys("addressline1_3"); //Address Line 3
			driver.findElement(By.xpath("(//input[@id=\"postalcode5\"])[1]")).sendKeys("369369"); //postalcode5
			driver.findElement(By.xpath("(//input[@id=\"country5\"])[2]")).sendKeys("INDIA"); //Country5
			driver.findElement(By.xpath("(//input[@id=\"nationality5\"])[2]")).sendKeys("INDIAN"); //nationality5
	  	    driver.findElement(By.xpath("(//input[@id=\"occupation5\"])[2]")).sendKeys("Director"); //occupation5
			driver.findElement(By.xpath("(//input[@id=\"numberofshare5\"])[2]")).sendKeys("2200"); //numberofshare5
			WebElement beneficialowner12 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner5\"])[2]")); //beneficialowner5
			Select selecta4 =new Select(beneficialowner12);
				selecta4.selectByIndex(1);	 			 
				Thread.sleep(8000);			 
		 WebElement add_sub2 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber2
				JavascriptExecutor executa2 = (JavascriptExecutor)driver;
					executa2.executeScript("arguments[0].click();", add_sub2);			 
				Thread.sleep(1000);			 
				 
		// Subscriber 6
				
			driver.findElement(By.xpath("(//input[@id=\"firstname6\"])[2]")).sendKeys("Divya5"); //firstname6
			driver.findElement(By.xpath("(//input[@id=\"lastname6\"])[2]")).sendKeys("Divya5"); //Lastname6
			driver.findElement(By.xpath("(//input[@id=\"addressline1_6\"])[2]")).sendKeys("addressline1_1"); //Address Line 1
			driver.findElement(By.xpath("(//input[@id=\"addressline2_6\"])[2]")).sendKeys("addressline1_1"); //Address Line 2
			driver.findElement(By.xpath("(//input[@id=\"addressline3_6\"])[2]")).sendKeys("addressline1_3"); //Address Line 3
			driver.findElement(By.xpath("(//input[@id=\"postalcode6\"])[1]")).sendKeys("369369"); //postalcode6
			driver.findElement(By.xpath("(//input[@id=\"country6\"])[2]")).sendKeys("INDIA"); //Country6
			driver.findElement(By.xpath("(//input[@id=\"nationality6\"])[2]")).sendKeys("INDIAN"); //nationality6
		    driver.findElement(By.xpath("(//input[@id=\"occupation6\"])[2]")).sendKeys("Director"); //occupation6
		    driver.findElement(By.xpath("(//input[@id=\"numberofshare6\"])[2]")).sendKeys("2200"); //numberofshare6
			WebElement beneficialowner13 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner6\"])[2]")); //beneficialowner6
			Select selecta5 =new Select(beneficialowner13);
				selecta5.selectByIndex(1);	 			 
				Thread.sleep(8000);			 
			WebElement add_sub3 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber3
				JavascriptExecutor executa3 = (JavascriptExecutor)driver;
					executa3.executeScript("arguments[0].click();", add_sub3);			 
				Thread.sleep(1000);			 		 
				 
	// Subscriber 7	 
				 
		driver.findElement(By.xpath("(//input[@id=\"firstname7\"])[2]")).sendKeys("Divya5"); //firstname7
		driver.findElement(By.xpath("(//input[@id=\"lastname7\"])[2]")).sendKeys("Divya5"); //Lastname7
		driver.findElement(By.xpath("(//input[@id=\"addressline1_7\"])[2]")).sendKeys("addressline1_1"); //Address Line 1
		driver.findElement(By.xpath("(//input[@id=\"addressline2_7\"])[2]")).sendKeys("addressline1_3"); //Address Line 2
		driver.findElement(By.xpath("(//input[@id=\"addressline3_7\"])[2]")).sendKeys("addressline1_3"); //Address Line 3
		driver.findElement(By.xpath("(//input[@id=\"postalcode7\"])[1]")).sendKeys("369369"); //postalcode7
		driver.findElement(By.xpath("(//input[@id=\"country7\"])[2]")).sendKeys("INDIA"); //Country7
		driver.findElement(By.xpath("(//input[@id=\"nationality7\"])[2]")).sendKeys("INDIAN"); //nationality7
	    driver.findElement(By.xpath("(//input[@id=\"occupation7\"])[2]")).sendKeys("Director"); //occupation7
	   driver.findElement(By.xpath("(//input[@id=\"numberofshare7\"])[2]")).sendKeys("2200"); //numberofshare7
		WebElement beneficialowner14 = driver.findElement(By.xpath("(//select[@id=\"beneficialowner7\"])[2]")); //beneficialowner7
		Select selecta6 =new Select(beneficialowner14);
			selecta6.selectByIndex(1);	 	
			 Thread.sleep(11000);
		WebElement Next_6 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[6]")); //Next_6
			JavascriptExecutor executor14 = (JavascriptExecutor)driver;
			  executor14.executeScript("arguments[0].click();", Next_6);	 
			 Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click(); //popup5
				 Thread.sleep(11000);	
				 
	//Corporate Subscriber Details
				 
	//Corporate Subscriber 1
		
		driver.findElement(By.id("companyname1")).sendKeys("Company");	 //companyname1
		driver.findElement(By.id("companyphonenumber1")).sendKeys("9165251236");	//companyphonenumber1		 
		driver.findElement(By.id("companydirector1")).sendKeys("Company");		 //companydirector1
		driver.findElement(By.id("registeroffice1")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline1_2\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline1_3\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode1\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country1\"])[3]")).sendKeys("INDIA"); //Country1
		driver.findElement(By.xpath("(//input[@id=\"numberofshare1\"])[3]")).sendKeys("INDIA"); //NumberOf Shares
						 
	//Corporate Subscriber 2
			 
		driver.findElement(By.id("companyname2")).sendKeys("Company");	 //companyname2
		driver.findElement(By.id("companyphonenumber2")).sendKeys("9165251236");	//companyphonenumber2	 
		driver.findElement(By.id("companydirector2")).sendKeys("Company");		 //companydirector2	 
		driver.findElement(By.id("registeroffice2")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_2\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_3\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode2\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country2\"])[3]")).sendKeys("INDIA"); //Country2
		driver.findElement(By.xpath("(//input[@id=\"numberofshare2\"])[3]")).sendKeys("INDIA"); //NumberOf Shares
		
	//Corporate Subscriber 3
	
		driver.findElement(By.id("companyname3")).sendKeys("Company");	 //companyname3
		driver.findElement(By.id("companyphonenumber3")).sendKeys("9165251236");	//companyphonenumber3 
		driver.findElement(By.id("companydirector3")).sendKeys("Company");		 //companydirector3 
		driver.findElement(By.id("registeroffice3")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_2\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_3\"])[2]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode3\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country3\"])[3]")).sendKeys("INDIA"); //Country3
		driver.findElement(By.xpath("(//input[@id=\"numberofshare3\"])[3]")).sendKeys("INDIA"); //NumberOf Share3
		Thread.sleep(1000);
		WebElement add_Copsub = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber3
		JavascriptExecutor executa4 = (JavascriptExecutor)driver;
			executa4.executeScript("arguments[0].click();", add_Copsub);
		Thread.sleep(2000);
		
	//Corporate Subscriber 4	
		
		driver.findElement(By.id("companyname4")).sendKeys("Company");	 //companyname4
		driver.findElement(By.id("companyphonenumber4")).sendKeys("9165251236");	//companyphonenumber4
		driver.findElement(By.id("companydirector4")).sendKeys("Company");		 //companydirector4
		driver.findElement(By.id("registeroffice4")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_4\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_4\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode4\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country4\"])[3]")).sendKeys("INDIA"); //Country3
		driver.findElement(By.xpath("(//input[@id=\"numberofshare4\"])[3]")).sendKeys("INDIA"); //NumberOf Share4
		Thread.sleep(1000);
		WebElement add_Copsub1 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber4
		JavascriptExecutor executa5 = (JavascriptExecutor)driver;
			executa5.executeScript("arguments[0].click();", add_Copsub1);
		Thread.sleep(2000);
		
  //Corporate Subscriber 5	
		
		driver.findElement(By.id("companyname5")).sendKeys("Company");	 //companyname5
		driver.findElement(By.id("companyphonenumber5")).sendKeys("9165251236");	//companyphonenumber5 
		driver.findElement(By.id("companydirector5")).sendKeys("Company");		 //companydirector5 
		driver.findElement(By.id("registeroffice5")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_5\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_5\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode5\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country5\"])[3]")).sendKeys("INDIA"); //Country5
		driver.findElement(By.xpath("(//input[@id=\"numberofshare5\"])[3]")).sendKeys("INDIA"); //NumberOf Share5
		Thread.sleep(1000);
		WebElement add_Copsub2 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber5
		JavascriptExecutor executa6 = (JavascriptExecutor)driver;
			executa6.executeScript("arguments[0].click();", add_Copsub2);
		Thread.sleep(2000);
		
 //Corporate Subscriber 6	
		
		driver.findElement(By.id("companyname6")).sendKeys("Company");	 //companyname6
		driver.findElement(By.id("companyphonenumber6")).sendKeys("9165251236");	//companyphonenumber6 
		driver.findElement(By.id("companydirector6")).sendKeys("Company");		 //companydirector6 
		driver.findElement(By.id("registeroffice6")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_6\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_6\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode6\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country6\"])[3]")).sendKeys("INDIA"); //Country6
		driver.findElement(By.xpath("(//input[@id=\"numberofshare6\"])[3]")).sendKeys("INDIA"); //NumberOf Share6
		Thread.sleep(1000);
		WebElement add_Copsub3 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber3
		JavascriptExecutor executa7 = (JavascriptExecutor)driver;
			executa7.executeScript("arguments[0].click();", add_Copsub3);
		Thread.sleep(2000);
		
	//Corporate Subscriber 7	
		
		driver.findElement(By.id("companyname7")).sendKeys("Company");	 //companyname7
		driver.findElement(By.id("companyphonenumber7")).sendKeys("9165251236");	//companyphonenumber7
		driver.findElement(By.id("companydirector7")).sendKeys("Company");		 //companydirector7 
		driver.findElement(By.id("registeroffice7")).sendKeys("Company");			 
		driver.findElement(By.xpath("(//input[@id=\"addressline2_7\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine2 
		driver.findElement(By.xpath("(//input[@id=\"addressline3_7\"])[3]")).sendKeys("Vadodara, Gujrat");	//AddressLine3 		 
		driver.findElement(By.xpath("(//input[@id=\"postalcode7\"])[2]")).sendKeys("390019");		 //Eircode
		driver.findElement(By.xpath("(//input[@id=\"country7\"])[3]")).sendKeys("INDIA"); //Country6
		driver.findElement(By.xpath("(//input[@id=\"numberofshare7\"])[3]")).sendKeys("INDIA"); //NumberOf Share7
		
		WebElement Next_7 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[7]")); //Next_7
		JavascriptExecutor executor15 = (JavascriptExecutor)driver;
		  executor15.executeScript("arguments[0].click();", Next_7);	 
		 Thread.sleep(12000);
	 driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click(); //popup5
			 Thread.sleep(11000);			
		
	 //Beneficial Owners 1
			 
	   driver.findElement(By.xpath("(//input[@id=\"firstname1\"])[3]")).sendKeys("OwnerName");	 //firstname1
	   driver.findElement(By.xpath("(//input[@id=\"lastname1\"])[3]")).sendKeys("Lastname");  //lastname1
	   driver.findElement(By.xpath("(//input[@id=\"addressline1_1\"])[2]")).sendKeys("Vadodar,Gujrat"); //addressline1_1
	   driver.findElement(By.xpath("(//input[@id=\"addressline1_2\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_2
	   driver.findElement(By.xpath("(//input[@id=\"addressline1_3\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_3
	   driver.findElement(By.xpath("(//input[@id=\"postalcode1\"])[3]")).sendKeys("390019"); //Eircode
	   driver.findElement(By.xpath("(//input[@id=\"country1\"])[4]")).sendKeys("India"); //Country
	   driver.findElement(By.xpath("(//input[@id=\"nationality1\"])[3]")).sendKeys("Indian"); //Nationality
	   driver.findElement(By.xpath("(//input[@id=\"occupation1\"])[2]")).sendKeys("Indian"); //occupation1
	   driver.findElement(By.id("natureofownership1")).sendKeys("Cool"); //natureofownership1
	   
	 //Beneficial Owners 2 
	   
	   driver.findElement(By.xpath("(//input[@id=\"firstname2\"])[3]")).sendKeys("OwnerName");	 //firstname2
	   driver.findElement(By.xpath("(//input[@id=\"lastname2\"])[3]")).sendKeys("Lastname");  //lastname2
	   driver.findElement(By.xpath("(//input[@id=\"addressline2_1\"])[2]")).sendKeys("Vadodar,Gujrat"); //addressline1_1
	   driver.findElement(By.xpath("(//input[@id=\"addressline2_2\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_2
	   driver.findElement(By.xpath("(//input[@id=\"addressline2_3\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_3
	   driver.findElement(By.xpath("(//input[@id=\"postalcode2\"])[3]")).sendKeys("390019"); //Eircode2
	   driver.findElement(By.xpath("(//input[@id=\"country2\"])[4]")).sendKeys("India"); //Country2
	   driver.findElement(By.xpath("(//input[@id=\"nationality2\"])[3]")).sendKeys("Indian"); //Nationality2
	   driver.findElement(By.xpath("(//input[@id=\"occupation2\"])[2]")).sendKeys("Indian"); //occupation2
	   driver.findElement(By.id("natureofownership2")).sendKeys("Cool"); //natureofownership2
		
	 //Beneficial Owners 3
	   
	   driver.findElement(By.xpath("(//input[@id=\"firstname3\"])[3]")).sendKeys("OwnerName");	 //firstname2
	   driver.findElement(By.xpath("(//input[@id=\"lastname3\"])[3]")).sendKeys("Lastname");  //lastname2
	   driver.findElement(By.xpath("(//input[@id=\"addressline3_1\"])[2]")).sendKeys("Vadodar,Gujrat"); //addressline1_1
	   driver.findElement(By.xpath("(//input[@id=\"addressline3_2\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_2
	   driver.findElement(By.xpath("(//input[@id=\"addressline3_3\"])[3]")).sendKeys("Vadodar,Gujrat"); //addressline1_3
	   driver.findElement(By.xpath("(//input[@id=\"postalcode3\"])[3]")).sendKeys("390019"); //Eircode2
	   driver.findElement(By.xpath("(//input[@id=\"country3\"])[4]")).sendKeys("India"); //Country2
	   driver.findElement(By.xpath("(//input[@id=\"nationality3\"])[3]")).sendKeys("Indian"); //Nationality2
	   driver.findElement(By.xpath("(//input[@id=\"occupation3\"])[2]")).sendKeys("Indian"); //occupation2
	   driver.findElement(By.id("natureofownership3")).sendKeys("Cool"); //natureofownership2
	   Thread.sleep(1000);
		WebElement add_owner = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber1
		JavascriptExecutor executa8 = (JavascriptExecutor)driver;
			executa8.executeScript("arguments[0].click();", add_owner);
		Thread.sleep(2000);
		
	//Beneficial Owners 4  
		
		driver.findElement(By.xpath("(//input[@id=\"firstname4\"])[3]")).sendKeys("OwnerName");	 //firstname4
		driver.findElement(By.xpath("(//input[@id=\"lastname4\"])[3]")).sendKeys("Lastname");  //lastname4
	    driver.findElement(By.xpath("(//input[@id=\"addressline4_1\"])[2]")).sendKeys("Vadodar,Gujrat"); //addressline1_1
	     driver.findElement(By.xpath("(//input[@id=\"addressline4_2\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_2
		 driver.findElement(By.xpath("(//input[@id=\"addressline4_3\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_3
		 driver.findElement(By.xpath("(//input[@id=\"postalcode4\"])[3]")).sendKeys("390019"); //Eircode4
		 driver.findElement(By.xpath("(//input[@id=\"country4\"])[4]")).sendKeys("India"); //Country4
		 driver.findElement(By.xpath("(//input[@id=\"nationality4\"])[3]")).sendKeys("Indian"); //Nationality4
		 driver.findElement(By.xpath("(//input[@id=\"occupation4\"])[3]")).sendKeys("Indian"); //occupation4
		 driver.findElement(By.id("natureofownership4")).sendKeys("Cool"); //natureofownership4
		  Thread.sleep(1000);
	  WebElement add_owner1 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber2
	  JavascriptExecutor executa9 = (JavascriptExecutor)driver;
				executa9.executeScript("arguments[0].click();", add_owner1);
			Thread.sleep(2000);
		
	//Beneficial Owners 5 
	   
			driver.findElement(By.xpath("(//input[@id=\"firstname5\"])[3]")).sendKeys("OwnerName");	 //firstname4
			driver.findElement(By.xpath("(//input[@id=\"lastname5\"])[3]")).sendKeys("Lastname");  //lastname4
		    driver.findElement(By.xpath("(//input[@id=\"addressline5_1\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_1
		    driver.findElement(By.xpath("(//input[@id=\"addressline5_2\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_2
			driver.findElement(By.xpath("(//input[@id=\"addressline5_3\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_3
			driver.findElement(By.xpath("(//input[@id=\"postalcode5\"])[3]")).sendKeys("390019"); //Eircode4
			driver.findElement(By.xpath("(//input[@id=\"country5\"])[4]")).sendKeys("India"); //Country4
			driver.findElement(By.xpath("(//input[@id=\"nationality5\"])[3]")).sendKeys("Indian"); //Nationality4
			driver.findElement(By.xpath("(//input[@id=\"occupation5\"])[3]")).sendKeys("Indian"); //occupation4
		    driver.findElement(By.id("natureofownership5")).sendKeys("Cool"); //natureofownership4
			 Thread.sleep(1000);
		  WebElement add_owner2 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber2
		  JavascriptExecutor executa10 = (JavascriptExecutor)driver;
					executa10.executeScript("arguments[0].click();", add_owner2);
				Thread.sleep(2000);
	   
	//Beneficial Owners 6   
				driver.findElement(By.xpath("(//input[@id=\"firstname6\"])[3]")).sendKeys("OwnerName");	 //firstname4
				driver.findElement(By.xpath("(//input[@id=\"lastname6\"])[3]")).sendKeys("Lastname");  //lastname4
			    driver.findElement(By.xpath("(//input[@id=\"addressline6_1\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_1
			    driver.findElement(By.xpath("(//input[@id=\"addressline6_2\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_2
				driver.findElement(By.xpath("(//input[@id=\"addressline6_3\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_3
				driver.findElement(By.xpath("(//input[@id=\"postalcode6\"])[3]")).sendKeys("390019"); //Eircode4
				driver.findElement(By.xpath("(//input[@id=\"country6\"])[4]")).sendKeys("India"); //Country4
				driver.findElement(By.xpath("(//input[@id=\"nationality6\"])[3]")).sendKeys("Indian"); //Nationality4
				driver.findElement(By.xpath("(//input[@id=\"occupation6\"])[3]")).sendKeys("Indian"); //occupation4
			    driver.findElement(By.id("natureofownership6")).sendKeys("Cool"); //natureofownership4
				 Thread.sleep(1000);
			  WebElement add_owner3 = driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")); //Add moresubscriber2
			  JavascriptExecutor executa11 = (JavascriptExecutor)driver;
						executa11.executeScript("arguments[0].click();", add_owner3);
					Thread.sleep(2000);
					
   //Beneficial Owners 7   
					

       	driver.findElement(By.xpath("(//input[@id=\"firstname7\"])[3]")).sendKeys("OwnerName");	 //firstname4
		driver.findElement(By.xpath("(//input[@id=\"lastname7\"])[3]")).sendKeys("Lastname");  //lastname4
	   driver.findElement(By.xpath("(//input[@id=\"addressline7_1\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_1
	   driver.findElement(By.xpath("(//input[@id=\"addressline7_2\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_2
		driver.findElement(By.xpath("(//input[@id=\"addressline7_3\"])")).sendKeys("Vadodar,Gujrat"); //addressline1_3
		driver.findElement(By.xpath("(//input[@id=\"postalcode7\"])[3]")).sendKeys("390019"); //Eircode4
		driver.findElement(By.xpath("(//input[@id=\"country7\"])[4]")).sendKeys("India"); //Country4
		driver.findElement(By.xpath("(//input[@id=\"nationality7\"])[3]")).sendKeys("Indian"); //Nationality4
		driver.findElement(By.xpath("(//input[@id=\"occupation7\"])[3]")).sendKeys("Indian"); //occupation4
	    driver.findElement(By.id("natureofownership7")).sendKeys("Cool"); //natureofownership4
					 Thread.sleep(1000);

		WebElement Next_8 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[8]")); //Next_8
		JavascriptExecutor executor16 = (JavascriptExecutor)driver;
		executor16.executeScript("arguments[0].click();", Next_8);	 
			 Thread.sleep(12000);
			driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click(); //popup5
			 Thread.sleep(11000);
			 
		
	//Address Details
	//Registered Office Address			
		driver.findElement(By.id("roaddressline1")).sendKeys("Address1");	//Address Line1					
		driver.findElement(By.id("roaddressline2")).sendKeys("Address1");	//Address Line2		
		driver.findElement(By.id("roaddressline3")).sendKeys("Address1");	//Address Line3		
		driver.findElement(By.id("ropostalcode")).sendKeys("390019");	//Eircode/Postcode
	
	//Business / Central Administration Address
					
		driver.findElement(By.id("caaddressline1")).sendKeys("Address1");	//Address Line1					
		driver.findElement(By.id("caaddressline2")).sendKeys("Address1");	//Address Line2		
		driver.findElement(By.id("caaddressline3")).sendKeys("Address1");	//Address Line3		
		driver.findElement(By.id("capostalcode")).sendKeys("390019");	//Eircode/Postcode
				
					
		WebElement Next_9 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[9]")); //Next_9
		JavascriptExecutor executor17 = (JavascriptExecutor)driver;
		executor17.executeScript("arguments[0].click();", Next_9);	 
			 Thread.sleep(12000);
			driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click(); //popup5
			 Thread.sleep(11000);			
					
	//Additional information				
			 driver.findElement(By.id("addtionalinfo")).sendKeys("Cool");			
					
	   
  	}
  	
  	
  	@AfterClass
  	public static void tearDown(){
  		driver.quit();
  		
         	
	}
	}