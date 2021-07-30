package Week1day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selinium {

	public static void main(String[] args) 
	{
	
     
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
		
		WebElement Emailbox=driver.findElement(By.id("email"));
		Emailbox.sendKeys("\"www.singakutti.com\"");
		
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Hello");
		
		String value=driver.findElement(By.name("username")).getAttribute("value");
		
		System.out.println("The value is = "+value);
		
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();
		
		boolean value2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled();
		
		System.out.println("the value is =");
		
		
	

		
	






	}


}






