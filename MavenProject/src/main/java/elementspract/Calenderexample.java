package elementspract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderexample {

	
	@Test
	public void calander() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement calenderbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[12]/a/img"));
		calenderbutton.click();
		
		
		WebElement calenderbutton1=driver.findElement(By.id("datepicker"));
		calenderbutton1.click();
		
		WebElement calenderbutton2=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span"));
		calenderbutton2.click();
	
		
		
		WebElement calenderbutton3=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[7]/a"));
		calenderbutton3.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
