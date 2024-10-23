package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("FN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LN");		

		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Title");	

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
