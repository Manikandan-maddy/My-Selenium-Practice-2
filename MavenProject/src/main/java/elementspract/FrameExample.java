package elementspract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {

	@Test
	public void frame()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement framebutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/img"));
		framebutton.click();
		
		driver.switchTo().frame(0);
		
		
		
		WebElement framebutton1=driver.findElement(By.id("Click"));
		framebutton1.click();
		
		String Tagtext=framebutton1.getText();
		System.out.println("the text is  "+Tagtext);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement framebutton2=driver.findElement(By.id("Click1"));
		framebutton2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		int framesize=totalframe.size();
		
		System.out.println(framesize);	

		
		
	}
	
	
	
	
	
	
	
	
}
