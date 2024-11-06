package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lwait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://leafground.com/waits.xhtml");
		WebElement btn1 = driver.findElement(By.xpath("//span[text()='Click']"));
		btn1.click();
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(3));

		WebElement herebtn = driver.findElement(By.xpath("//span[text()='I am here']"));
		wait.until(ExpectedConditions.visibilityOf(herebtn));

		boolean displayed = herebtn.isDisplayed();
		
		System.out.println(displayed);




	}

}
