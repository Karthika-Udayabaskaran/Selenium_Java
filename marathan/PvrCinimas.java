package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PvrCinimas {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =  new ChromeDriver();


		// Load the Url "https://www.pvrcinemas.com/"
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

		// Click on Cinema under Quick Book

		// Select Your Cinema
		driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX National')]")).click();

		// Select Your Date as Tomorrow
		driver.findElement(By.xpath("//*[contains(@role,'listbox')]/li/span[contains(text(),'Tomorrow')]")).click();


		// Select Your Movie
		driver.findElement(By.xpath("//span[contains(text(),'Select Movie')]")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][4]")).click();


		// Select Your Show Time

		driver.findElement(By.xpath("//span[contains(text(),'Select Timing')]")).click();

		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][2]")).click();

		//Click on Book Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click Accept on Term and Condition
		driver.findElement(By.xpath("//*[contains(text(),'Accept')]")).click();

		// Click any one available seat
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='SL.SILVER|F:12']")).click();

		// Click Proceed Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();


		// Print the Seat info under book summary

		String SeatInfo = driver.findElement(By.xpath("//*[@class='select-seat-number']")).getText();
		System.out.println("Seat Number:" +SeatInfo);

		// Print the grand total under book summary

		String Total = driver.findElement(By.xpath("//*[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Total Amount:" +Total);

		// Click Proceed Button

		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

		// Close the popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();

		// Print Your Current Page title
		String pagetitle = driver.getTitle();
		System.out.println("Title of the Page:" +pagetitle);

		// Close Browser




	}

}
