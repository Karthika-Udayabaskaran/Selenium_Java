package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome 
		ChromeDriver driver = new ChromeDriver();
		
		//Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Type "Bags for boys" in the Search box
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Print the total number of results (like 5
	//	example like this-----> 1-48 of over 5, results for "bags for boys"
		
		String Pagination = driver.findElement(By.xpath("//div [@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Total Results displayed :"  +Pagination);
		
		// Select the first 2 brands in the left menu
	//	(like American Tourister, Generic
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[3]")).click();		
		//Choose New Arrivals (Sort)
		
		driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		
		//Print the first resulting bag info (name, discounted price
		Thread.sleep(3000);
		String FirstPrdt = driver.findElement(By.xpath("//*[contains(text(),'Casual Backpack')]")).getText();
		System.out.println(FirstPrdt);
		
		
		//Get the page title and close the browser(driver.close(
		
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		//driver.close();
	}
	
	

}
