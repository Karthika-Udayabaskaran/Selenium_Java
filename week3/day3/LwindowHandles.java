package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LwindowHandles {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();

		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Get the CurrentWindow
		String Parent = driver.getWindowHandle();

		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[1]")).click();

		//store the windowhandles in set
		Set<String> windowHandles = driver.getWindowHandles();

		//convert to list
		List <String> childwindows = new ArrayList <String> (windowHandles);

		//switch to child
		driver.switchTo().window(childwindows.get(1));

		System.out.println("Child URL: " +driver.getCurrentUrl());
		
		//switch to parent
		driver.switchTo().window(childwindows.get(0));

		System.out.println("Parent URL: " +driver.getCurrentUrl());
		//close the current window
	
		driver.close();
		
	}

}
