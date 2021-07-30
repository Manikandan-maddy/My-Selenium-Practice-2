package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltipexample {
	
	
	
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
     
		WebElement tooltipbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[20]/a/img"));
		tooltipbutton.click();
		
		
		WebElement inputbox=driver.findElement(By.id("age"));
		String value=	inputbox.getAttribute("title");
		
		System.out.println("the text is "+value );
		
		
		
		
		
		
	}

}
