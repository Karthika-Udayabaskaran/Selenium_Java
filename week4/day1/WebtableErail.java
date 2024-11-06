package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableErail {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://erail.in/");

		WebElement From = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		From.clear();
		From.sendKeys("MAS");
		
		WebElement To = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		To.clear();
		To.sendKeys("MDU");	
		
		driver.findElement(By.xpath("//*[@id='chkSelectDateOnly']")).click();
		
		
		//Retrieve the train names from the web table.
		
		
		//Verify if there are any duplicate train names in the web table.


	}

}
