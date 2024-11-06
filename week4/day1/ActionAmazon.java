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
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class ActionAmazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("(//*[@class='a-price-whole'])[1]"));
		System.out.println("Price of the First Product: " +price.getText());

		WebElement Cusrating = driver.findElement(By.xpath("(//*[@class='a-size-base s-underline-text'])[1]"));
		System.out.println("Customer Rating is:" +Cusrating.getText());

		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		Set<String> ChildWindows = driver.getWindowHandles();

		List <String> ch = new ArrayList(ChildWindows);

		driver.switchTo().window(ch.get(1));

		//take screenshot

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc =new File("./snaps/amazon.png");
		FileUtils.copyFile(src, desc);
		
		Actions a = new Actions(driver);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		a.moveToElement(addtocart).perform();
		addtocart.click();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement Subtotal = driver.findElement(By.xpath("//*[@class='a-size-base-plus a-color-base']"));
		wait.until(ExpectedConditions.visibilityOf(Subtotal));
		String Sub = Subtotal.getText();
		System.out.println("SubTotal Is:" +Sub);

		if (Sub.contains("Cart subtotal (1 item):")){

			System.out.println("Passed: ");
		}

		else
		{
			System.out.println("Failed: ");
		}
	}

}
