package elementspract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imagebutton {
	
	
	@Test
	public void imagebutton() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement imagebutton=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a/img"));
		imagebutton.click();
		
		WebElement gotohome=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		gotohome.click();
		
		driver.navigate().back();
		
		WebElement broken=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
		if(broken.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is Broken");
		}else
		{
			System.out.println("The image is not Broken");
			
		}
		
		driver.close();
		
		
		
	}

}
