package practice;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {
	
	
	public static void main(String[] args)
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement dragclick=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[14]/a"));
		dragclick.click();
		
		
		
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		
	    Actions mouse= new Actions(driver);
	    
	 //   mouse.clickAndHold(from).moveToElement(to).release(to).build().perform();
	    
	    
	    mouse.dragAndDrop(from, to).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
