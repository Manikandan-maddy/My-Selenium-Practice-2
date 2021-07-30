package testNG;

import org.testng.annotations.Test;

public class Dependenciesexm {
	
	//one is Depands on another thing
	//school
	//higher school
	//college,BE
	
	@Test 
	public void goingschool()
	{
		System.out.println("1st 10th pass");
	}
	
	@Test (dependsOnMethods="goingschool")
	public void goinghigherschool()
	{
		System.out.println("2nd 12th pass");
	}

	@Test (dependsOnMethods="goinghigherschool")
    public void goingcollege()
	{
		System.out.println("BE Gethu");
	}
	
}
