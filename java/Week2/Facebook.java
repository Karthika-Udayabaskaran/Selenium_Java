package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window 
		driver.manage().window().maximize();

		//Launch the URL
		driver.get("https://www.facebook.com");

		WebElement Email = driver.findElement(By.id("email"));

		WebElement Password = driver.findElement(By.id("pass"));

		WebElement Login = driver.findElement(By.name("login"));
		
		
		
		Email.sendKeys(" testleaf.2023@gmail.com");
		Password.sendKeys("Tuna@321");
		Login.click();
		driver.findElement(By.linkText("Find your account and log in.")).click();

		//Get the title of the page 
		String ExpectedTitle ="Log in to Facebook";
		String Pagetitle = driver.getTitle();
		System.out.println("Title of the Page :" +Pagetitle);

		//Verify the Title of the page 
		if(ExpectedTitle.equals( Pagetitle)) {

			System.out.println("Title of the page Matches");
		}

		else
		{
			System.out.println("Title of the page does not  Match");	
		}

		driver.close();

	}

}
