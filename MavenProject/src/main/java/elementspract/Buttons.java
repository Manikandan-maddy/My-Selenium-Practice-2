package elementspract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	
	@Test
	public void buttonpage() {
		
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.navigate().to("http://www.leafground.com/");
   
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    WebElement buttonclick=driver.findElement(By.xpath("//*[@alt='Buttons']"));
    buttonclick.click();
    
    WebElement gotohome=driver.findElement(By.id("home"));
    gotohome.click();
    
    driver.navigate().back();
    
    WebElement xyposition=driver.findElement(By.id("position"));
    Point bothposition=xyposition.getLocation();
   int xpoint= bothposition.getX();
   int ypoint= bothposition.getY(); 
   System.out.println("The XPosition is "+xpoint+"The YPoisition is"+ypoint);

    WebElement colour=driver.findElement(By.id("color"));
    String cssvalue=colour.getCssValue("background-color");
   System.out.println("The colour is "+cssvalue);
   
   WebElement size=driver.findElement(By.id("size"));
   int height  =size.getSize().height;
   int width =size.getSize().width;
   System.out.println("The Height is"+height+"The width is"+width);
   
   
		
		
		
		
	}
	
	
	
	

}
