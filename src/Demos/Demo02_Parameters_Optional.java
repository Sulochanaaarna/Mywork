package Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

public class Demo02_Parameters_Optional {
	
	@BeforeClass
	
	@Parameters({"browser","URL"})
	public void Setup(@Optional("Chrome")String browser1,String url) {
		System.out.println("Browser:"+browser1);
		System.out.println("AUT Link:"+url);
	}
  @Test
  public void test() {
  }
}
