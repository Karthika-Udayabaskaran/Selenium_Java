package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonactivity {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Search th emobiles in text box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		
		//Get the price of Mobiles
		List<WebElement> pp= driver.findElements(By.xpath("//*[@class='a-price']"));
		
		//Create the List 
		List <String> Total = new ArrayList <String> ();
		
		//Iterate and get text 
		for (WebElement Price : pp) {
			String text = Price.getText();
			
			Total.add(text);
			
		}
		//Print 
	System.out.println("List of Prices:" +Total);
	}

}
