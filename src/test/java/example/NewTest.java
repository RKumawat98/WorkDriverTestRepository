package example;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;

import org.testng.Assert;		*/
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    //private WebDriver driver;		
		@Test				
		public void testEasy() {	
			//driver.get("http://demo.guru99.com/test/guru99home/");  
			System.out.println("I am in testEasy method");
			System.setProperty("webdriver.chrome.driver","D:\\\\chromeDriver Folder\\\\chromedriver_win32\\\\chromedriver.exe");	// <-- Change this path
		       WebDriver driver = new ChromeDriver();
		       String baseUrl = "https://www.google.com/";
		       //String expectedTitle = "Free trial";
		       //String actualTitle = "";
		       driver.get(baseUrl);
		       //actualTitle = driver.getTitle();
		       System.out.println("TEST PASSED!");
		       /*if (actualTitle.contentEquals(expectedTitle)){
		           
		       } else {
		           System.out.println("TEST FAILED");
		       }*/
		       //driver.close();
			//String title = driver.getTitle();				 
			//Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			//driver = new ChromeDriver();
			System.out.println("I am in beforeTest method");
			System.out.println("I am in beforeTest 2222 method");
			//driver.get("http://www.google.com");
	        
		}		
		@AfterTest
		public void afterTest() {
			System.out.println("I am in afterTest method");
			
			//driver.quit();			
		}		
}	
