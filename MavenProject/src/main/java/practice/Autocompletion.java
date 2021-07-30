package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocompletion {

	public static void main(String[] args) throws Exception  
	{
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		
		WebElement autobutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[17]/a/img"));
		autobutton.click();
		
		WebElement coursebutton=driver.findElement(By.id("tags"));
		coursebutton.sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement>totallist=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	int listsize=totallist.size();
	System.out.println("listsize"+listsize);
	for (WebElement onebyone : totallist)
	{
	if(onebyone.getText().equals("Web Services"))
		{
		onebyone.click();
	    System.out.println("match");
		}else 
		{
	System.out.println("notmatch");
		}
	}	
		
		
		
		
		
		
		
		
		
	}

}
