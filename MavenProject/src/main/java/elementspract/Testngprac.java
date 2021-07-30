package elementspract;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngprac {

	
	   
	
	
	private static final String Bing = null;

	@Test
	public void bing() throws IOException {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.bing.com/");
	    
	    File from= driver.getScreenshotAs(OutputType.FILE);
	    
	    File to=new File("./snaps/img.png");
	    org.openqa.selenium.io.FileHandler.copy(from, to);
	    
String title=driver.getTitle();
System.out.println(title);
   
 

if(title.contains("Bing")) {
	System.out.println("the statement is correct");
}

	}	   


	
	
	
}
