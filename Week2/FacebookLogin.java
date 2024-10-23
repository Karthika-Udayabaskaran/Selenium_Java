package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookLogin {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();


		//Launch the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window 
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("FB");
		driver.findElement(By.name("lastname")).sendKeys("ACCOUNT");	
		
		WebElement Wday = driver.findElement(By.id("day"));
		Wday.click();
		
		Select day= new Select (Wday);
		day.selectByVisibleText("23");
		
		WebElement Montth = driver.findElement(By.id("month"));
		Montth.click();
		
		Select Mon= new Select (Montth);
		Mon.selectByVisibleText("Nov");
		
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		
		Select yr= new Select (year);
		yr.selectByVisibleText("1991");
		
		driver.findElement(By.id("sex")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("facebook@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook@01");		
		
		
		
		
	}

}
