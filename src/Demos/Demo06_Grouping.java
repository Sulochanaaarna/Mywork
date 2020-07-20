package Demos;

import org.testng.annotations.Test;

public class Demo06_Grouping {
  @Test(groups = {"car","ecar"})
  public void car() {
	  System.out.println("Car");
  }
  @Test(groups = {"car","sedan"})
  public void car1() {
	  System.out.println("Car1");
  }
  @Test(groups = {"car"})
  public void car2() {
	  System.out.println("Car2");
}
  @Test(groups = {"ecar"})
  public void car3() {
	  System.out.println("Car3");
  }
}