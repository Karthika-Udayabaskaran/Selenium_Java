package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends BaseClass {

	@Test
	public void Legalentity() throws InterruptedException {

		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//*[@aria-label='View All Applications']")).click();
		WebElement Le = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(Le).perform();
		Le.click();

		driver.findElement(By.xpath("//*[@title='New']")).click();

		driver.findElement(By.xpath("//*[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//*[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		WebElement ddown = driver.findElement(By.xpath("//span[text()='--None--']"));
		a.moveToElement(ddown).perform();

		driver.executeScript("arguments[0].click()", ddown);
		driver.findElement(By.xpath("//*[text()='Active']")).click();

		driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();

		String Msg = driver.findElement(By.xpath("//*[@class='panel-content scrollable']//div[@class='slds-popover__body']")).getText();

		System.out.println(Msg);
		
		if (Msg.contains("Legal Entity Name")) {
			System.out.println("Error message for name displayed");
		} else {
			System.out.println("Error message for name not displayed");
		}
		
	}

}
