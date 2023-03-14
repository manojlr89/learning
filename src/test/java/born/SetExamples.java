package born;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Set interface not maintain any order.
//Does not allow duplicate values
//Doesnot accessed elements by their position
public class SetExamples {
	
	WebDriver driver;
	public void setup(String browser,String url) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		String fs = System.getProperty("file.separator");
		System.out.println(fs);	
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentDirectory+ fs + "driver"+ fs + "chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if 
		(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			}
		
		driver.get(url);
		
		String parentWindow=driver.getWindowHandle();
		Set<String> childWindows= driver.getWindowHandles();
		
		Iterator<String> itr=childWindows.iterator();
		
		while(itr.hasNext())
		{
			String childWindow= itr.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.close();
			}
			else
			{
				driver.switchTo().window(parentWindow);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
			
			
		}

	
		 public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
			 ListExamples b=new ListExamples();
				
				b.setup("chrome", "https://www.flipkart.com/");
			}
	
	
	
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


