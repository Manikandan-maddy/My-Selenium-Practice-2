package testNG;

import org.testng.annotations.Test;

public class groupingexample {

	//4 Diff cellphones
	
	
	@Test (groups= {"apple"})
	public void apple1()
	{
		System.out.println("Apple phone 1 ");
	}
	@Test (groups= {"apple"})
	public void apple2()
	{
		System.out.println("Apple phone 2 ");
	}
	@Test (groups= {"vivo"})
	public void vivo1()
	{
		System.out.println("vivo phone 1 ");
	}
	@Test (groups= {"vivo"})
	public void vivo2()
	{
		System.out.println("vivo phone 2 ");
	}
	@Test (groups= {"micromax"})
	public void micromax1()
	{
		System.out.println("micromax1 phone 1 ");
	}
	@Test (groups= {"micromax"})
	public void micromax2()
	{
		System.out.println("micromax phone 2 ");
	}
	@Test (groups= {"redmi"})
	public void redmi1()
	{
		System.out.println("redmi1 phone 1 ");
	}
	@Test (groups= {"redmi"})
	public void redmi2()
	{
		System.out.println("redmi1 phone 2 ");
	}
}

