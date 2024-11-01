package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandAssign {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Input Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//input password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	

		//click on submit button
		WebElement Submitbtn = driver.findElement(By.className("decorativeSubmit"));
		Submitbtn.click();

		//partialLinkText 

		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();

		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		String ParentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();
		List<String> child = new ArrayList<String> (windows);
		
		driver.switchTo().window(child.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'DemoCustomer')]")).click();
		driver.switchTo().window(child.get(0));	
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowss = driver.getWindowHandles();
		List<String> child2 = new ArrayList<String> (windowss);
		
		driver.switchTo().window(child2.get(1));
		

		driver.findElement(By.xpath("//a[contains(text(),'DemoLBCust')]")).click();

		driver.switchTo().window(child2.get(0));
		driver.findElement(By.xpath("(//a[contains(text(),'Merge')])[2]")).click();

		Alert a = driver.switchTo().alert();
		a.accept();

		String title = driver.getTitle();

		System.out.println(title);
	}

}