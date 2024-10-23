package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		//Input Username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		//input password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");	


		//click on submit button
		WebElement Submitbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		Submitbtn.click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

	}

}
