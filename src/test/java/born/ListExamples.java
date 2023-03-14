package born;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//List interface Store date in order.
//Allow duplicate values
//Accessed elements by their position
public class ListExamples {
	
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
		//driver.findElement(By.name("firstname")).sendKeys("manoj");
		
	/*//All Dropdown values
		List<WebElement> ele=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		
		for(int i=0;i<=ele.size()-1;i++)			
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
			String DropdownValues= ele.get(i).getText();			
			System.out.println(DropdownValues);
		}*/
		
		//Find all links in a page
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		int linksCount=alllinks.size();
		System.out.println(linksCount); 
		for(WebElement link:alllinks)
		{
		
			try {
				if(link.getText().contains("Log in"))
				{ 
					driver.findElement(By.xpath("//a[contains(text(), \"Log in\")]")).click();
					
					System.out.println("Page Title is---> " + driver.getTitle() );	
					Thread.sleep(5000);
					driver.navigate().back();
					
					Thread.sleep(5000);
					driver.navigate().refresh();
					List<WebElement> alllinks1=driver.findElements(By.tagName("a"));
				}
				else {
					System.out.println(link.getText());
				}
			} catch (Exception e) {
				//In selenium, the StaleElementReferenceException implies the absence of an element that might have been present earlier. 
				
				
				//Thread.sleep(5000);
				System.out.println(e);
			}
			
			
		}
//		for(int i=0;i<=alllinks.size()-1;i++)			
//		{
//			//System.out.println(alllinks.get(i).getText());
//			
//			
//			if(alllinks.get(i).getText().contains("Log in"))
//			{
//				driver.findElement(By.xpath("//a[contains(text(), \"Log in\")]")).click();
//				System.out.println("Page Title is---> " + driver.getTitle() );
//				
//			}
//			
//		}
		
		Iterator<WebElement> itr=alllinks.iterator();
		while(itr.hasNext())
		{
			WebElement test=itr.next();
			
			String value=test.getText();
			
		}
			
		
	}
		 public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
			 ListExamples b=new ListExamples();
				
				b.setup("chrome", "https://www.facebook.com");
			}
	
	

}
