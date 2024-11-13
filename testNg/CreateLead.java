package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CreateLead extends Baseclass {

	@DataProvider
	public  String[][] sendData() {

		String[][]  data =new String[2][3];

		data[0][0]="TestLeaf";
		data[0][1]="Kanda";
		data[0][2]="sasti";

		data[1][0]="TestLeaf";
		data[1][1]="Lord";
		data[1][2]="Murugan";

		return data;
	}


	@Test(dataProvider ="sendData")
	public  void tc01_createlead(String CN, String FN , String LN) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CN);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FN);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LN);
		driver.findElement(By.name("submitButton")).click();
	}
}






