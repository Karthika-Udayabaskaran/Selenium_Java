package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonValida {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.leafground.com/radio.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//h5[contains(text(),'browser')]/following::span[contains(@class,'ui-radiobutton')][1]")).click();

		WebElement Radiobutn = driver.findElement(By.xpath("//div[@class='ui-g']//div[contains(@class,'ui-corner')]"));
		Radiobutn.click();

		Radiobutn.click();

		boolean selected = Radiobutn.isSelected();

		if(selected) {

			System.out.println("Selected");
		}
		else
		{
			System.out.println("Notselected");
		}

		WebElement Defaultselected = driver.findElement(By.xpath("//td//label[contains(@for,'console2:2')]"));

		String text = Defaultselected.getText();


		System.out.println("Default Selected " +text ) ;


		WebElement age = driver.findElement(By.xpath("//div//label[contains(@for,':age:1')]"));

		boolean ageselected = age.isSelected();
		
		if (ageselected) {
			
			System.out.println("Not selected");
			age.click();
		}
		
		else
		{
			System.out.println(" Already selected");
		}
	}



}