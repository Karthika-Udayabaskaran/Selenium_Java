package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();


		driver.get(" https://leafground.com/button.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Click']")).click();

		String Pagetitle = driver.getTitle();
		System.out.println(Pagetitle);

		String ExpectedTitle ="Dashboard";
		if (Pagetitle.equals(ExpectedTitle)) {

			System.out.println("Passed:" +Pagetitle );

		} else {

			System.out.println("Failed:" +Pagetitle);

		}

		driver.navigate().back();
		boolean Disabled = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();

		if (Disabled) {

			System.out.println("Enabled");
		}
		else
		{
			System.out.println("disabled");
		}
		WebElement Button = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		String text = Button.getText();
		System.out.println(Button.getSize() +  "Text displayes:" +text);

		WebElement colour = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		String Btnclr = colour.getCssValue("background-color");
		

		String Textdisplayed = driver.findElement(By.xpath("//h5[contains(text(),'color')]")).getText();
		
		System.out.println("Button colour" +Btnclr  +Textdisplayed);
		
		WebElement HeightW = driver.findElement(By.xpath("//h5[contains(text(),'height and width')]/following::span[contains(text(),'Submit')]"));
		String Textheight = driver.findElement(By.xpath("//h5[contains(text(),'height and width')]")).getText();
		
		Dimension heightofbtn = HeightW.getSize();
		System.out.println("Btn height" +heightofbtn  +Textheight);
		driver.close();

	}

}
