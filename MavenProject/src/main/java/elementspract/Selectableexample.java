package elementspract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectableexample {

	@Test	
	public void dragme() {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.navigate().to("http://www.leafground.com/");
			
			
			WebElement dragbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[15]/a/img"));
			dragbutton.click();
	
	
			
	
			List<WebElement> selectbutton=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
			
	        int size=selectbutton.size();
			System.out.println(size);
			
			Actions action=new Actions(driver);
			
			action.clickAndHold(selectbutton.get(0));
			action.clickAndHold(selectbutton.get(1));
			action.clickAndHold(selectbutton.get(2));
			action.build().perform();
			
	
	}
	
}
