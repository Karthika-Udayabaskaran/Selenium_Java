package week4.day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LAnnotation {
  @Test
  public void TC01() {
  
	  System.out.println("I am the First Test Case");
  }
  
  @Test
  public void TC02() {
  
	  System.out.println("I am the second Test Case");
  }
  
  
  @BeforeSuite
  public void Beforesuite() {
  
	  System.out.println("I am the Before suite");
  }
  
  @AfterMethod
  public void Aftermed() {
  
	  System.out.println("I am the After Method");
  }
  
  @BeforeClass
  public void Beforecl() {
  
	  System.out.println("I am the BeforeClass");
  }
  
  @BeforeMethod
  public void beforemed() {
  
	  System.out.println("I am the Before Method");
  }
  
  @AfterClass
  public void Afterclass() {
  
	  System.out.println("I am the Afterclass");
  }
  

  @AfterTest
  public void Afterte() {
  
	  System.out.println("I am the AfterTest");
  }
}
