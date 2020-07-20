package Demos;

import org.testng.annotations.Test;

public class Demo05_Attributes {

 /* @Test(priority = 0) 
  public void test() {
		  System.out.println("testing Priority");
  }
  
  @Test(priority = -1, enabled=true) 
  public void testen() {
		  System.out.println("testing enablity");
  }
  @Test(priority = -3) 
  public void test1() {
		  System.out.println("testing dependson");
  }*/
	  @Test(enabled=false)
	  public void login() {
		  System.out.println("Login method");
	  }
	  
	 /* @Test(dependsOnMethods = {"login"})
	  public void Dashboard() {
		  System.out.println("dashboard method");
	  }*/
	  @Test(dependsOnMethods = {"Dashboard"})
	  public void logout() {
		  System.out.println("Logout method");
	  }

	/*@Test(dependsOnMethods = {"login"}) 
	  public void test1() {
			  System.out.println("testing dependson");
	  }*/
}
