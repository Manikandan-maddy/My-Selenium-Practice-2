package testNG;

import org.testng.annotations.Test;

public class TestNGexample {

	@Test (priority=0)
	public void getcarstart()
	{
		System.out.println("getcarstart");
	}
	@Test (priority=1)
	public void putfirstgear()
	{
		System.out.println("put 1stgear");
	}
	@Test (priority=2)
	public void putsecondgear()
	{
		System.out.println("put 2ndgear");
	}
	@Test (priority=3)
	public void putthirdgear()
	{
		System.out.println("put 3rdgear");
		
	}
	
	@Test (priority=4)
	public void putfourthgear()
	{
		System.out.println("put 4thgear");	
	}
	
	@Test (priority=5,enabled=false)
	public void turnonmusic()
	{
		System.out.println("return ON Music");
	}
}
