import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderbutton {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		WebElement calenderbutton=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]/a"));
		calenderbutton.click();
		
		WebElement datepicker=driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		
		WebElement arror=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		arror.click();
		
		
		

		WebElement arrordate=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		arrordate.click();
	}

}
