package Week2;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.findElement(By.xpath("//*[contains(@class,'selectbooleancheckbox')]//span[contains(text(),'Basic')]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'selectbooleancheckbox')]//span[contains(text(),'Ajax')]")).click();

		String Msg = driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText();

		if (Msg.equals("Checked")) {

			System.out.println("Message displayed sucessfully");

		} else {
			System.out.println("Message is not matched");		


		}
		driver.findElement(By.xpath("//td//div[contains(@class,'ui-chkbox-box')]")).click();
		driver.findElement(By.xpath("//*[contains(@id,'ajaxTriState')]//div[2]")).click();
		

		
	String state =driver.findElement(By.xpath("//*[@role='alert']//div[2]")).getText();
	
	System.out.println(state);
		
		if (state.equals("Checked")) {

			System.out.println("Tri state chosen");

		} else {
			System.out.println("Tri state  not chosen");		

	}
		
}}
