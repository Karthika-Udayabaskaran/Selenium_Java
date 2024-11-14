package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class salesforce {

	public ChromeDriver driver;
	
	@Given("Login into the application")
	public void login_into_the_application() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// Launch the browser
	        driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}
	@And("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
			}
	@And("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
		driver.findElement(By.xpath("//*[@aria-label='View All Applications']")).click();
		WebElement Le = driver.findElement(By.xpath("//p[text()='Sales']"));

		Thread.sleep(5000);
		Le.click();
	}
	@And("Click on Accounts tab")
	public void click_on_accounts_tab() {
		
		WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()",accountsTab);

	
	}
	@Then("I Click on New button")
	public void i_click_on_new_button() {
	    
	driver.findElement(By.xpath("//*[text()='New']")).click();
	}
	@And("Enter {string} as account name")
	public void enter_as_account_name(String name) throws InterruptedException {
	   Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	@And("Select Ownership as Public")
	public void select_ownership_as_public() {
		Actions a = new Actions(driver);
		
		WebElement ddown = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		a.moveToElement(ddown).perform();

		driver.executeScript("arguments[0].click()", ddown);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@Then("Click save")
	public void click_save() {

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@And("verify Account name")
	public void verify_account_name() {
	   String msg = driver.findElement(By.xpath("(//*[text()='Karthi'])[2]")).getText();
		
	   System.out.println(msg);
		
		if (msg.contains("karthi")) {
			System.out.println("Passed:");
		} else {
			System.out.println("Failed: ");
		}

	}


}
