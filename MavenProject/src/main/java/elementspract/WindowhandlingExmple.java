package elementspract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandlingExmple {

	@Test
	public void window() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement windowbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a"));
		windowbutton.click();
		
		
	    String parentpage=driver.getWindowHandle();
	
	    WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		
		Set<String> childstore=driver.getWindowHandles();
		
		ArrayList<String> makelist=new ArrayList<String>(childstore);
 	    driver.switchTo().window(makelist.get(1));
 	   String childtitle= driver.getTitle();
 	   
 	   System.out.println(childtitle);
 	   
 	   
 	
 	   //*****************************childpage operation***********************************
 	    WebElement childpage=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		childpage.click();
		
		
		WebElement childpage1=driver.findElement(By.id("email"));
		childpage1.sendKeys("www.india.com");
		
		driver.close();
		
		//****************************************************************************************************
		
		driver.switchTo().window(parentpage);
		
		 WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
			multiplewindow.click();
		
			Set<String> childwindow2=driver.getWindowHandles();
 	      ArrayList<String> makelist2=new ArrayList<String>(childwindow2);
 	   driver.switchTo().window(makelist2.get(1));
 	   
 	   //****************************************childpage 1*************************************************
 	   
 	   
 	  WebElement multiplewindow1=driver.findElement(By.linkText("Go to Home Page"));
		multiplewindow1.click();
 	   Thread.sleep(3000);
 	   driver.close();
 	   
 	   //*********************************childpage 2*******************************************************
 	   driver.switchTo().window(makelist2.get(2));
 	  WebElement multiplewindow2=driver.findElement(By.id("home"));
		multiplewindow2.click();
 	   
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentpage);
		
		
		driver.close();
	}
	
	
	
	
	
	
	
	
}
