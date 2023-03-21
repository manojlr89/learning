package born;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngtesting {  

	WebDriver driver ;
	
	
	@Test 
	public void f() {
	  
	    String baseUrl = "https://www.toolsqa.com/";     
	         

	        System.out.println("Launching Google Chrome browserssss007"); 
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        driver = new ChromeDriver(options);
	        
	        driver.get(baseUrl);
	        //SoftAssert test= new SoftAssert();
	        String testTitle = "Tools QA";
	        String originalTitle = driver.getTitle();	        
	        
	        //test.assertEquals(originalTitle, testTitle); 
	        assertEquals(testTitle, originalTitle);
	        	        
	        System.out.println("Launching Google Chrome browser12333");
	       // test.assertAll();
	        driver.close();
  }
	@Test 
	public void f1() {
	  
	    String baseUrl = "https://www.toolsqa.com/";
	      
	         
	        System.out.println("Launching Google Chrome browser90"); 
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        driver = new ChromeDriver(options);
	        
	        driver.get(baseUrl);
	        //SoftAssert test= new SoftAssert();
	        String testTitle = "Tools QA1";
	        String originalTitle = driver.getTitle();	        
	        assertEquals(testTitle, originalTitle);
	       // test.assertEquals(originalTitle, testTitle);    
	        	        
	        System.out.println("Launching Google Chrome browser12333");
	        //test.assertAll();
	        driver.close();
  }
	

}
