package practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linksbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		/*
		WebElement hyperlink=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a"));
		hyperlink.click();
		*/
		
		
		WebElement Gotohome=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
		Gotohome.click();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement wheream=driver.findElement(By.partialLinkText("Find where am"));
		String Iamin=wheream.getAttribute("href");
		System.out.println("I am in"+Iamin);
		
		WebElement error=driver.findElement(By.partialLinkText("Verify am I"));
	    error.click();
	    
	    String errortitle=driver.getTitle();
		
	    if(errortitle.contains("404"))
	    {
	    	System.out.println("The page is broken");
	    }

		driver.navigate().back();
		driver.navigate().refresh();
		
     	WebElement Gotohome2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
		Gotohome2.click();
		
		driver.navigate().back();
		
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		int totalnooflinks=totallinks.size();
		
	System.out.println("no of links is"+totalnooflinks);
		
	}

}
