package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadingbutton {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		
		
		WebElement uploadbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[19]/a/img"));
		uploadbutton.click();
		
		WebElement task=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		task.click();
	
		Thread.sleep(20000);
		StringSelection datatransfer= new StringSelection("C:\\Users\\Maddy\\Downloads\\testleaf(1).xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(datatransfer, null);
		
		Thread.sleep(3000);
		
		Robot mouse=new Robot();
		mouse.keyPress(KeyEvent.VK_CONTROL);
		mouse.keyPress(KeyEvent.VK_V);
		mouse.keyRelease(KeyEvent.VK_CONTROL);
		mouse.keyRelease(KeyEvent.VK_V);
		
		mouse.keyPress(KeyEvent.VK_ENTER);
		mouse.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
