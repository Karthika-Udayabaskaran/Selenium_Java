package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionBigbasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.bigbasket.com/");

		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions a = new Actions(driver);


		Thread.sleep(5000);
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		a.moveToElement(food).perform();

		Thread.sleep(5000);
		WebElement rice = driver.findElement(By.xpath("//li[@class='jsx-1259984711']//a[text()='Rice & Rice Products']"));
		a.moveToElement(rice).perform();


		Thread.sleep(5000);
		WebElement boiledrice = driver.findElement(By.xpath("//li[@class='jsx-1259984711']//a[text()='Boiled & Steam Rice']"));
		a.moveToElement(boiledrice).perform();
		boiledrice.click();

		//		driver.findElement(By.xpath("//*[@placeholder='Search for Products...']")).sendKeys("bb Royal",Keys.ENTER);

		WebElement Tamil = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));

		driver.executeScript("arguments[0].click()", Tamil);
		
		String Parentwindow = driver.getWindowHandle();
		Set<String> childwindows = driver.getWindowHandles();

		List<String> cw =new ArrayList<String>(childwindows);

		driver.switchTo().window(cw.get(1));
		System.out.println(driver.getCurrentUrl());

		WebElement item = driver.findElement(By.xpath("//span[text()='5 kg']"));
		driver.executeScript("arguments[0].click()", item);

		WebElement add = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		driver.executeScript("arguments[0].click()", add);

		String msg = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();

		System.out.println(msg);

		if (msg.contains("An item has been added to your basket successfully")) {

			System.out.println("Passed: ");

		}

		else
		{

			System.out.println("Fail: ");
		}

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snaps/bigbasket.png");
		FileUtils.copyFile(src, dest);


		driver.close();

		driver.switchTo().window(Parentwindow).close();

	}

}
