package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionassignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		
		WebElement text = driver.findElement(By.xpath("//*[text()='Conditions of Use & Sale']"));
		a.scrollToElement(text).perform();
		
		System.out.println("The displayed Text is: " + text.getText());
		
	
		
		
	}

}
