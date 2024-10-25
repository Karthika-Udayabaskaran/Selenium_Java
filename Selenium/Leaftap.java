package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftap {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window 
		driver.manage().window().maximize();
		//Launch the URL
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		//Get the title of the page 

		String Pagetitle = driver.getTitle();
		System.out.println("Title of the Page :" +Pagetitle);
		
		//Input Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//input password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		//click on submit button
		WebElement Submitbtn = driver.findElement(By.className("decorativeSubmit"));
		Submitbtn.click();
		
		//partialLinkText 
		
		driver.findElement(By.partialLinkText("CRM")).click();

		//driver.close();

	}

}
