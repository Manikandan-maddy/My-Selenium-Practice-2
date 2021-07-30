import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imagebutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		WebElement imagebutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a"));
		imagebutton.click();
		
		
		
		
		WebElement imageclick=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imageclick.click();
		
Thread.sleep(3000);
		
		driver.navigate().back();
	
		
		WebElement imagenotavailable=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		
		
		//
		
		
		//Natural width =0 (image broken)
		
		
		if(imagenotavailable.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("This image is broken");
		}else
		{
			System.out.println("This image is exists");
		}

	}

}
