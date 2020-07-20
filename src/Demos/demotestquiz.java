package Demos;

import org.testng.annotations.Test;

public class demotestquiz {
  @Test(groups = {"Light"})
  public void color1() {
	  System.out.println("white");	 
  }
  
  @Test(groups = {"Dark"})
  public void color2() {
	  System.out.println("Red");	 
  }
  
  @Test(groups = {"Medium"})
  public void color3() {
	  System.out.println("Orange");	 
  }
	

}
