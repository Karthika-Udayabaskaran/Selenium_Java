package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTextVer {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fr = driver.findElement(By.xpath("//*[@id='iframeResult']"));
		driver.switchTo().frame(fr);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Try it')]")).click();	
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		String msg = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		
		if (msg.contains("Harry Potter!")) {
			
			System.out.println("Passed:");
			
		}
		
		else
		{
			
			System.out.println("Failed: ");
		}
		
	}

}
