package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.xpath("//button[@role='button']")).click();
		
		//driver.findElement(By.xpath("(//button[@role='button'])[2]")).click();
		driver.findElement(By.xpath("(//button[@role='button'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("String");
		alert.accept();
		
		//String Msg = driver.findElement(By.xpath("//*[@id='simple_result']")).getText();
		
		//String Msg = driver.findElement(By.xpath("//*[@id='result']")).getText();
		String Msg = driver.findElement(By.xpath("//*[@id='confirm_result']")).getText();
		
		System.out.println(Msg);
		
		
	}

}
