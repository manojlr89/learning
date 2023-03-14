package born;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	      
	         
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        SoftAssert test= new SoftAssert();
	        String testTitle = "Tools QA";
	        String originalTitle = driver.getTitle();	        
	        
	        test.assertEquals(originalTitle, testTitle);    
	        	        
	        System.out.println("Launching Google Chrome browser12333");
	        test.assertAll();
  }
	@Test 
	public void f1() {
	  
	    String baseUrl = "https://www.toolsqa.com/";
	      
	         
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        SoftAssert test= new SoftAssert();
	        String testTitle = "Tools QA";
	        String originalTitle = driver.getTitle();	        
	        
	        test.assertEquals(originalTitle, testTitle);    
	        	        
	        System.out.println("Launching Google Chrome browser12333");
	        test.assertAll();
  }
	

}
