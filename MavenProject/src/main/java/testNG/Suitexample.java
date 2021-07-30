package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suitexample {
	
	//open chrome,2.bing,3.yahoo and close:
	
	ChromeDriver driver;
	long starttime;
	long endtime;
	
	@BeforeSuite
	public void Browserlaunch()
	{
		  starttime=System.currentTimeMillis();	
			
	        WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	}
	
	
	
	
	
	@Test (priority=0)
	public void openchrome()
	{
    
		driver.get("https://www.google.com/");
		
	}

	
	
	@Test (priority=1)
	public void openBing()
	{
	     
		
		driver.get("https://www.Bing.com/");
		
	
	}
	
	
	
	@Test (priority=2)
	public void openyahoo()
	{
	     
		
		
		driver.get("https://www.yahoo.com/");
		
		
      
	}
	
	@AfterSuite
	public void endbrowser()
	{
        driver.quit();
		
		endtime=System.currentTimeMillis();
		
		long totaltime=endtime-starttime;
		System.out.println("The total time is"+totaltime);
	}
	
	
	
}
