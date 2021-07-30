package elementspract;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceleafgnd {

	@Test
	public void buttons() throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*WebElement frame1=driver.findElement(By.linkText("//iframe[@id='a077aa5e']"));
		frame1.click();*/
		
		driver.switchTo().frame("a077aa5e");
		WebElement frame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame.click();
		
		
		WebElement frame2=driver.findElement(By.xpath("//*[@id=\'g-footer\']/div/div[1]/div/div/div/div/div/div[2]/div[2]/div/div/div/a/i"));
		
		if(frame2.getText().contains("Selenium Fundamentals"))
		{
			System.out.println("Selenium fundamentals is found");
		}
		


	}
}
