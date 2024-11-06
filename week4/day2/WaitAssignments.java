package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignments {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://leafground.com/waits.xhtml");
	
		WebElement btn = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(3));

		wait.until(ExpectedConditions.elementToBeClickable(btn));

		btn.click();

	}

}
