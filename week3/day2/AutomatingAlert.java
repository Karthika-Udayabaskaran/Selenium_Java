package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();

		driver.get("https://leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("(//button[@role='button'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Its Week3 class now");
		System.out.println(alert.getText());
		alert.accept();
		String Msg = driver.findElement(By.xpath("//*[@id='confirm_result']")).getText();

		System.out.println(Msg);

		
		if (Msg.contains("Its Week3 class now")) {
			
			System.out.println("Expected Text is present");
		}
		else
		{
			System.out.println("Expected Text not Present");
		}

	}

}
