package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LWebTables {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://leafground.com/table.xhtml");
		
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody"));
	
		List <WebElement> columncount = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody/tr/td[3]"));
		
		for (WebElement row : columncount) {
			System.out.println(
			row.getText());
		}
		
		
		
		
	}
	

}
