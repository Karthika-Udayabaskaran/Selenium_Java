package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sel");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Java");		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.click();
		Select s = new Select(state);
		s.selectByVisibleText("New York");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String Pagetitle = driver.getTitle();
		System.out.println(Pagetitle);
		
		String ExpectedTitle ="View Lead | opentaps CRM";
		if(Pagetitle.equals(ExpectedTitle))
		{
			System.out.println("Passed: Title of the page matched");
		}

		else
			System.out.println("Failed: Title of the page not matched");
	}

}
