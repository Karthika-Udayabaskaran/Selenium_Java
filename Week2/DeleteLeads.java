package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Input Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//input password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	


		//click on submit button
		WebElement Submitbtn = driver.findElement(By.className("decorativeSubmit"));
		Submitbtn.click();

		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement LeadId = driver.findElement(By.xpath("//a[text()='11758']"));
		System.out.println( LeadId.getText());
		LeadId.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11758");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		System.out.println(
		driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText());
		
		

	}


}
