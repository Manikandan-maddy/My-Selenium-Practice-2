package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorttablebuttom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		
		WebElement Sortbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[16]/a/img"));
		Sortbutton.click();
		
		List<WebElement> lists=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		//WebElement from=lists.get(6);
		//WebElement to=lists.get(0);
		WebElement from1=lists.get(6);
		WebElement to2 =lists.get(0);
		
		Actions mouse=new Actions(driver);
	//	mouse.dragAndDrop(from, to).build().perform();
		
		mouse.clickAndHold(from1);
		mouse.moveToElement(to2);
		mouse.release(to2);
		mouse.build().perform();
		
	}

}
