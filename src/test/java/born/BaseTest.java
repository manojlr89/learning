package born;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public void setup(String browser,String url) {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		String fs = System.getProperty("file.separator");
		System.out.println(fs);
		//ChromeOptions chromeOptions = new ChromeOptions();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new firefox(chromeOptions);
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentDirectory+ fs + "driver"+ fs + "chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if 
		(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.chrome.driver", currentDirectory+ fs + "driver"+ fs + "chromedriver.exe");
			driver=new FirefoxDriver();
			}
		
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("manoj");
		//driver.findElement(By.id("month")).click();
		//WebElement element;

		List<WebElement> ele=new ArrayList<WebElement>();
		System.out.println(ele);
		ele=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		//List<WebElement> ele=driver.findElements(By.id("month"));
		 for (WebElement e : ele) {
             System.out.println(e);
             
         }
		//WebElement month=driver.findElement(By.id("month"))
		//System.out.println(month);
		 //Traverse the list through Iterator  
//	        Iterator itr=ele.iterator();  
//	        System.out.println("The contents of the arraylist are:");
//	        while(itr.hasNext()){  
//	            System.out.println(itr.next());  
//	        }  
//		 
		 
		 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTest b=new BaseTest();
		
		b.setup("chrome", "https://www.facebook.com/r.php?locale=en_GB&display=page");
	}

}
