package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	

  public  ChromeDriver driver;
	
	@Parameters({"url","uname","pass"})
@BeforeMethod
	public  void prerequisite(String url,String uname,String pass) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// Launch the browser
	        driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id='Login']")).click();

	}
@AfterMethod
	public void close() {
		
		driver.close();
	}
}
