package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int TotalLinks = Links.size();
		System.out.println("Total Links:" +TotalLinks);
		
		List<String> anchor = new ArrayList <String> ();
		
		for (WebElement wb : Links) {
		
			String text = wb.getText();
			anchor.add(text);


		}
		System.out.println(anchor);
	//	driver.close();


	}

}
