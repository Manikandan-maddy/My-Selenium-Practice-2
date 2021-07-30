package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersexample {

	
	
	@Test
	@Parameters("inputname")
	public void givingname(String namerev)
	{
		System.out.println("The name is "+namerev);
	}
	
	
}
