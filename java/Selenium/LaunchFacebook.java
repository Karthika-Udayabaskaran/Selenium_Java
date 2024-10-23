package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		//Maximize the window 
		driver.manage().window().maximize();

		//Launch the URL
		driver.get("https://www.facebook.com");

		//Get the title of the page 
		String Pagetitle = driver.getTitle();
		System.out.println("Title of the Page :" +Pagetitle);

		//Verify the Title of the page 
		
		driver.close();
	}

}
