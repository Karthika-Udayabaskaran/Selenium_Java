package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();

		driver.get("https://leafground.com/frame.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		
		WebElement btn= driver.findElement(By.id("Click"));
				btn.click();
				System.out.println(btn.getText());

	}

}
