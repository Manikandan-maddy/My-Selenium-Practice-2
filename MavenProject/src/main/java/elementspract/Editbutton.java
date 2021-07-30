package elementspract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editbutton {

	@Test
	public void editbutton() throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement editbutton=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editbutton.click();
		
		WebElement emailadd=driver.findElement(By.id("email"));
		emailadd.sendKeys("www.singakuttida.com");
		
		WebElement append=driver.findElement(By.xpath("//*[@value='Append ']"));
		append.sendKeys("india");
		
		Thread.sleep(3000);
		WebElement gettext=driver.findElement(By.xpath("//*[@name='username']"));
		String value=gettext.getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(3000);
		WebElement cleartext=driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		cleartext.clear(); 	
		
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enable=disabled.isEnabled();
		System.out.println(enable);
				
		
	}

}
