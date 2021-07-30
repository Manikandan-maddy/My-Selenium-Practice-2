package elementspract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertexample {

	@Test
	public void alert()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement alertbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img"));
		alertbutton.click();
		
		
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		
		
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();
		
		Alert confirmbox1=driver.switchTo().alert();
		confirmbox1.dismiss();
		
		
		WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		
		Alert promptbox1=driver.switchTo().alert();
		promptbox1.sendKeys("DUCK");
		promptbox1.accept();
	}
	
	
	
	
	
	
}
