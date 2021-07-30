import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablebutton {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    
	    
	    WebElement tablebutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[8]/a"));
	    tablebutton.click();
	    
	    List<WebElement> countcolumn=driver.findElements(By.tagName("th"));
	  int columnsize=  countcolumn.size();
	    
		System.out.println(columnsize);
		
		List<WebElement> countrow=driver.findElements(By.tagName("tr"));
		  int columnsize1=  countrow.size();
		    
			System.out.println(columnsize1);
			
			
			
		WebElement tdvalue=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String td=tdvalue.getText();
			
			System.out.println("The value is="+td);
			
		List<WebElement>leastvalue=driver.findElements(By.xpath("//td[2]"));
		int totalpercentage=leastvalue.size();
		System.out.println(totalpercentage);
		
		
		List<Integer>store=new ArrayList<Integer>();
		
		
		for (WebElement webElement : leastvalue) {
		String individual=	webElement.getText().replace("%","");
		
			store.add(Integer.parseInt(individual));
		}
	System.out.println("Total value is ="+store);
	
	  int minvalue=Collections.min(store);
	  
	  System.out.println("the smallest value is="+minvalue);
	  
	  String finalstringvalue=Integer.toString(minvalue)+"%";
	  
	  String finalxpath="//td[normalize-space()="+"\""+finalstringvalue +"\""+"]"+"//following::td[2]";
	  		
			  System.out.println(finalxpath);
	

	
	WebElement good=driver.findElement(By.xpath(finalxpath));
	good.click();
	
	
	}
	
	
	

}
