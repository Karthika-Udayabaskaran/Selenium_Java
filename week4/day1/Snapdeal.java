package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.snapdeal.com/");

		
		WebElement mens = driver.findElement(By.xpath("(//*[@class='catText'])[1]"));
		
		Actions a =new Actions(driver);
		a.moveToElement(mens);
		
		WebElement shoe = driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]"));
		driver.executeScript("argument[0].click()", shoe);
	}

}
