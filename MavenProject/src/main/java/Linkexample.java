	import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkexample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String windowhomepage=driver.getWindowHandle();
		
		WebElement openhomepage=driver.findElement(By.id("home"));
		openhomepage.click();
		
		Set<String>totalopenwindow=driver.getWindowHandles();
		ArrayList<String> makelist= new ArrayList<String>(totalopenwindow);
		driver.switchTo().window(makelist.get(1));
		String titlename=driver.getTitle();
		System.out.println("title is "+titlename);
		
		WebElement buttonoption=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
		buttonoption.click();
		
		WebElement findposition=driver.findElement(By.id("position"));
	     org.openqa.selenium.Point xyposition= findposition.getLocation();
	     int xvalue=xyposition.getX();
	     int yvalue=xyposition.getY();
	     
	     System.out.println("the valur of x is"+xvalue);
	     System.out.println("the value of y is"+yvalue);
	     
	     driver.close();
	     
	     driver.switchTo().window(windowhomepage);
	     
	     
	WebElement openmultiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	openmultiple.click();
	
	Set<String>twowindowtask=driver.getWindowHandles();
	ArrayList<String>twowindow= new ArrayList<String>(twowindowtask);
	driver.switchTo().window(twowindow.get(2));
	
	WebElement findcolour=driver.findElement(By.xpath("//*[@id=\'color\']"));
	String backcolour=findcolour.getCssValue("background-color");
	System.out.println("the background colour is"+backcolour);
	driver.close();
	
	
	
	driver.switchTo().window(twowindow.get(1));
	
	//WebElement openmultiple2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	//openmultiple2.click();
	
	//Set<String>twowindowtasks=driver.getWindowHandles();
	//ArrayList<String>twowindows= new ArrayList<String>(twowindowtasks);
	//driver.switchTo().window(twowindows.get(1));
	
	 
	WebElement screen2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
	screen2.click();
	
	
	
	
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
}


