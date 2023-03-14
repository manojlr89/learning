package born;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebdriverTest {
	WebDriver driver;
	
	public void setup(String browser,String url)
	{
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		String fs = System.getProperty("file.separator");
		System.out.println(fs);	
		
		ChromeOptions op=new ChromeOptions();
		//op.setHeadless(true);
		op.addArguments("--incognito");
		op.setAcceptInsecureCerts(true);
		//op.addArguments("start-maximized");
		
	  
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentDirectory+ fs + "driver"+ fs + "chromedriver.exe");
		driver=new ChromeDriver(op);
		}
		else if 
		(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			}

		driver.manage().window().maximize();
		driver.get(url);
		
		
			
//		WebElement email= driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
//		
//		
//		
//		Actions ac=new Actions(driver);
//		
//		ac.moveToElement(email).perform();
//		
//		WebElement subMenu = driver.findElement(By.xpath("//a[@data-product='Live']//div[contains(text(),'Interactive cross browser testing')]"));
//		
//		ac.moveToElement(subMenu).perform();
//		
//		ac.click().build().perform();
//		
//		System.out.println(driver.getTitle());	
	}
	

	 public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		     WebdriverTest b=new WebdriverTest();			
			b.setup("chrome", "https://www.browserstack.com/guide/mouse-hover-in-selenium/");
			//b.teste();
		}
	
	@Test
	public void teste()
	{
          System.out.println(driver.getTitle());	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}

	public void teste1()
	{
          System.out.println(driver.getTitle());	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}

}
