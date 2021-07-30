package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;



public class Downloadtask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		WebElement downloadbutton=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a"));
		downloadbutton.click();
		
		WebElement downloadexcel=driver.findElement(By.linkText("Download Excel"));
			
		downloadexcel.click();
		
		Thread.sleep(4000);
		
		//Downloads
	
	  File totalfile=new File("C:\\Users\\Maddy\\Downloads");
	
	   File[] totalfilelist= totalfile.listFiles();
	   
	   for (File file : totalfilelist) {
		
		  if(file.getName().equals("testleaf (1)"))
		   {
			  System.out.println("File downloaded");
			   break;
		   }
		


		
		
		
		
	   }
	   
	}


}