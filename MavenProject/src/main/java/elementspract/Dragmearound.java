package elementspract;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragmearound {

	
@Test	
public void dragme() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement dragbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[13]/a/img"));
		dragbutton.click();
	
		
	
		WebElement fromdragbutton=driver.findElement(By.id("draggable"));
		
		
		WebElement todrag=driver.findElement(By.id("mydiv"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(fromdragbutton, todrag).build().perform();
		
	
		
	
}
}