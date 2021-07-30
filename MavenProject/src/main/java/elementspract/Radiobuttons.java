package elementspract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttons {

	@Test
	public void radiobutton()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img"));
		radiobutton.click();
		
		WebElement radiobutton1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
	
		
		WebElement radiobutton2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		
		boolean radio=radiobutton1.isSelected();
		boolean radio1=radiobutton2.isSelected();
		System.out.println(radio);
		System.out.println(radio1);
		
		
		WebElement age=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		age.click();
		
		
		
		
	}
	
	
	
	
	
}
