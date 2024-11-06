package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Laction {


	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		//MouseOver the element
		WebElement MouseOver = driver.findElement(By.xpath("//span[text()='Prime']"));		
		Actions a= new Actions(driver);
		a.moveToElement(MouseOver).perform();


		//scroll down to the page
		WebElement copyrights = driver.findElement(By.xpath("//*[contains(text(),'1996-2024,')]"));	
		a.scrollToElement(copyrights).perform();
		System.out.println(	copyrights.getText());

	
		
		
	}
}
