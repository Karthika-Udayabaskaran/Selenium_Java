package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LnestedFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver ();

		driver.get("https://leafground.com/frame.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ParentFrame = driver.findElement(By.xpath("//*[@id='frame2']"));

		WebElement btn= driver.findElement(By.id("Click"));
				btn.click();
				System.out.println(btn.getText());

	}

}
