package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameexample {

@Test	
public void iframe()
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://demo.guru99.com/test/guru99home/");

	
	
	/*WebElement Jmeter=driver.findElement(By.xpath("/html/body"));
	Jmeter.click();*/
	
	driver.switchTo().frame("a077aa5e");
	
	WebElement Frame1=driver.findElement(By.xpath("//*[@src='Jmeter720.png']"));
	Frame1.click();
	
	String framepage=Frame1.getText();
	System.out.println(framepage);
	
	String actualtitle=driver.getTitle();
	
	//*[@id="g-footer"]/div/div[1]/div/div/div/div/div/div[2]/div[2]/div/div/div/h4/a
Assert.assertEquals(actualtitle, "Selenium");
	
	
	
	
	
	
	
	
	}

}
