package elementspract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soorable {

	@Test	
	public void stortbale() {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.navigate().to("http://www.leafground.com/");
			
			
			WebElement sortbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[16]/a/img"));
	         sortbutton.click();
	         
	     
	         List<WebElement> sortbutton1=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
	         int size=sortbutton1.size();
	         System.out.println(size);
	         
	         WebElement from=sortbutton1.get(6);
	         WebElement to=sortbutton1.get(0);
	         
	         Actions action=new Actions(driver);
	       
	         action.dragAndDrop(from, to).build().perform();
	         
	         /*mouse.clickAndHold(from1);
	 		mouse.moveToElement(to2);
	 		mouse.release(to2);
	 		mouse.build().perform();*/
	 		
	         
	}	
}