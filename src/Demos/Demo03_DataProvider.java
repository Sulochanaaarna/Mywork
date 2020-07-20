package Demos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo03_DataProvider {
  @Test(dataProvider ="credentials")
  public void f(String username,String password) {
	  System.out.println(username);
	  System.out.println(password);
  }
  
  @DataProvider(name="credentials")
  public Object[][] getData(){
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] ="dan00";
	  data[0][1]= "Dan@01";
	  
	  data[1][0] ="dan10";
	  data[1][1]= "Dan@11";
	  
	  data[2][0] ="dan20";
	  data[2][1]= "Dan@21";
	  
	  return data;
	  
  }
}
