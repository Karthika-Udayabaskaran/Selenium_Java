package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Baseclass {

	ChromeDriver driver = new ChromeDriver();

	
	@BeforeSuite
	public void beforesu() {
		System.out.println("Beforesuite is Executed");
	}
	@Parameters({"url","username","password"})
	@BeforeMethod	
	public void precondition(String url, String username, String password) {

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@AfterMethod
	public void postcondition() {	

		driver.close();
	}

}