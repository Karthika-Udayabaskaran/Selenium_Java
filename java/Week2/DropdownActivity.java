package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownActivity {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	
		//Launch the URL
		
		driver.navigate().to("http://leaftaps.com/opentaps");
		
		//Maximize the window 
		driver.manage().window().maximize();

		//Get the title of the page 

		String Pagetitle = driver.getTitle();
		System.out.println("Title of the Page :" +Pagetitle);
		
		//Input Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//input password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		//click on submit button
	   driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//partialLinkText 
		
		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("U");
		
		WebElement Sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Sourcedd.click();
		Select S = new Select(Sourcedd);

		S.selectByIndex(4);
		
		WebElement MC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select s =new Select(MC);
		s.selectByVisibleText("Automobile");
		
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select o = new Select(Ownership);
		o.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		String PageTitle = driver.getTitle();
		String ExpTitle="View Lead | opentaps CRMs";
		System.out.println(PageTitle);
		
		if(ExpTitle.equals(PageTitle))
		{
			System.out.println("Passed: Title Matched");
		
		}
		
		else
		{
			System.out.println("Failed: Title  Not Matched");
			
		}
		
		

	}

}
