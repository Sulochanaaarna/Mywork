package Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo01_TestNGClass {
  @Test
  public void test() {
	  System.out.println("Inside the Test method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside before method");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside after method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside before Class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Inside after class");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside before Test");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Inside after Test");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside before Suite");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside after Suite");
  }
}
