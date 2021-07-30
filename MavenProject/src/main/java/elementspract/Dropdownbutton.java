package elementspract;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownbutton {

	@Test
	public void dropdown() throws InterruptedException
	{
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement dropdown=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/img"));
	dropdown.click();
	
	//SELECT IS MAJOR ROLE IN DROPDOWN
	
	WebElement dropdown1=driver.findElement(By.id("dropdown1"));
	
	org.openqa.selenium.support.ui.Select Select =new Select(dropdown1);
	
	Select.selectByIndex(1);
	
	Thread.sleep(3000);
	
	Select.selectByValue("2");
	
	Thread.sleep(3000);
	
	Select.selectByVisibleText("Loadrunner");
	
	
	
	List<WebElement> listofoptions=Select.getOptions();
	System.out.println("total list is "+listofoptions);
	int size=listofoptions.size();
	System.out.println("total size of list is "+size);
	
	
	dropdown1.sendKeys("UFT/QTP"+Keys.ENTER);
	
	
	
	WebElement multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	
	Select multipleselect=new Select(multiselect);
	multipleselect.selectByIndex(0);
	multipleselect.selectByIndex(1);
	multipleselect.selectByIndex(2);
	multipleselect.selectByIndex(3);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
