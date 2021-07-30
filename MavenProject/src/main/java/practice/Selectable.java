package practice;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		WebElement clickselectable=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[15]/a/img"));
		clickselectable.click();
		
		 List<WebElement> totalsize=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		int fullvalue=totalsize.size();
		
		System.out.println("the value of size is "+fullvalue);
		
		Actions keyboard =new Actions(driver);
		
		//keyboard.keyDown(Keys.CONTROL).click(totalsize.get(0)).click(totalsize.get(1)).click(totalsize.get(2)).build().perform();
		
		keyboard.clickAndHold(totalsize.get(0));
		keyboard.clickAndHold(totalsize.get(1));
		keyboard.clickAndHold(totalsize.get(2));
		keyboard.build().perform();
		
		
		
		
	}

}
