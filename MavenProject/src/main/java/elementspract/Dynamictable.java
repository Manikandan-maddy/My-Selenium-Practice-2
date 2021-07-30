package elementspract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamictable {

	@Test
	public void dynamictable()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement tablebutton=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img"));
		tablebutton.click();
		
		
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int noofcolumn=column.size();
		System.out.println(noofcolumn);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int noofrow=column.size();
		System.out.println(noofrow);
		
		//td[normalize-space()='Learn to interact with Elements']//following::td[1];
		
		WebElement tablebutton1=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String value=tablebutton1.getText();
		System.out.println(value);
		
		
		
		List<WebElement>leastvalue=driver.findElements(By.xpath("//td[2]"));
		int totalpercentage=leastvalue.size();
		System.out.println(totalpercentage);
		
		
		
		
		List<Integer>store= new ArrayList<Integer>();
		
		for (WebElement webElement : leastvalue) {
			String allvalue=webElement.getText().replace("%", "");
			
		
		store.add(Integer.parseInt(allvalue));
		
		}
		
		System.out.println(store);
		
		int minvalue=Collections.min(store);
		System.out.println("the smallest value is="+minvalue);
		
		
		String finalvalue=Integer.toString(minvalue)+"%";
		
		/* String finalxpath="//td[normalize-space()="+"\""+finalstringvalue +"\""+"]"+"//following::td[1]";
	  		
		  System.out.println(finalxpath);*/

	
	String finalpath="//td[normalize-space()="+"\""+finalvalue+"\""+"]"+"//following::td[1]";
	System.out.println(finalpath);
	
	WebElement good=driver.findElement(By.xpath(finalpath));
	good.click();

	
	}
}
