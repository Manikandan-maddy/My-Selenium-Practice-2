package elementspract;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	@Test
	public void links() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement linkbutton=driver.findElement(By.xpath("//*[@alt='Link']"));
		linkbutton.click();
		
		
		WebElement Gotohome=driver.findElement(By.linkText("Go to Home Page"));
		Gotohome.click();
		
		driver.navigate().back();
		
		WebElement Wheream = driver.findElement(By.partialLinkText("Find where am supposed"));
		String wheregoing=Wheream.getAttribute("href");
		System.out.println("The WebSite is"+wheregoing);
		
		
		WebElement errorpage=driver.findElement(By.linkText("Verify am I broken?"));
		errorpage.click();
		
	String broken=driver.getTitle();
		
		if(broken.contains("Status 404 – Not Found"))
		{
			System.out.println("The page is broken");
			
		}
		
		driver.navigate().back();
		
		WebElement Gotohome1=driver.findElement(By.linkText("Go to Home Page"));
		Gotohome1.click();
		
		driver.navigate().back();
		
		 List<WebElement> nooflinks=driver.findElements(By.tagName("a"));
	     int value=	nooflinks.size();
		System.out.println("No of Links in this page is "+value);

	driver.close();
	}
	
	
	
	
	
	
	
	
	
}
