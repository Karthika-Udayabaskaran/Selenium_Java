package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {

	public ChromeDriver driver;

	@Given("Browser launched sucessfully")
	public void browser_launched_sucessfully() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("enter the username as  {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@When("enter the password as {string}")
	public void enter_the_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("user should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		System.out.println("Sucessfully login");
	}


}



