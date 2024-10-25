package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import week1.day1.Methods;

public class SeleniumSampleCode {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		//Maximize the window 
		driver.manage().window().maximize();
		
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		
		//Enter the username &Password
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		
		//Get the title of the page 
		
		String Pagetitle = driver.getTitle();
		System.out.println("Title of the Page :" +Pagetitle);
		

	
	
	}
	

}
