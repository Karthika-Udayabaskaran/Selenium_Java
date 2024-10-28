package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		String Total = driver.findElement(By.xpath("//*[@class='length']")).getText();
		System.out.println("Total Items displayed:" +Total);

		List<WebElement> BrandNames = driver.findElements(By.xpath("//*[@class='brand']"));

		List <String> bn =new ArrayList <String>();
		for (WebElement BNames : BrandNames) {

			String names = BNames.getText();
			bn.add(names);
		}

		System.out.println("Brand Names:" +bn);
		List<WebElement> Bn = driver.findElements(By.xpath("//*[@class='nameCls']"));

		List <String> b =new ArrayList <String>();
		for (WebElement BagNames : Bn) {

			String bags = BagNames.getText();
			b.add(bags);

		}
		System.out.println("Bag Names:" +b);


		driver.close();
	}

}
