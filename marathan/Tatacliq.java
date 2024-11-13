package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) {



		//	ChromeOptions Options = new ChromeOptions();
		//Options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
		Actions a = new Actions(driver);

		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));

		a.moveToElement(brands).perform();

		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));

		a.moveToElement(watches).perform();

		WebElement brand = driver.findElement(By.xpath("//a[text()='Lavie']"));
		driver.executeScript("arguments[0].click()", brand);

		
		WebElement dropdown = driver.findElement(By.xpath("//*[@class='SelectBoxDesktop__hideSelect']"));
		dropdown.click();
		
		driver.findElement(By.xpath(""));

	}

}
