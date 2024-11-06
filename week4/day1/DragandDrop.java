package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		//drag and drop
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://jqueryui.com/draggable/");

		Actions a= new Actions(driver);


		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement dest =driver.findElement(By.xpath(""));
		a.dragAndDropBy(src, 40,150).perform();

	}

}
