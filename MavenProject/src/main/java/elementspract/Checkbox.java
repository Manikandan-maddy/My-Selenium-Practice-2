package elementspract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	@Test
	public void checkboxbutton()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		checkbox.click();
		
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		checkbox1.click();
		
	
		
		WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean select=checkbox2.isSelected();
		System.out.println(select);
		
		

		
		WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
				if(checkbox3.isSelected())
				{
					checkbox3.click();
				}
		
		
		WebElement checkbox4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		
		if(checkbox4.isSelected())
		{
			checkbox4.click();
		}
		
		
		
		WebElement checkbox5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		checkbox5.click();
	
	
	}
	
	
	
}
