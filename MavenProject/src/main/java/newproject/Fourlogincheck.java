package newproject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.biff.WorkbookMethods;
import jxl.read.biff.BiffException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fourlogincheck {

	//Login 
	
	//1.Username Correct Password Wrong.
	//2.Username Wrong Password Correct.
	//3.Username Wrong Password Wrong.
	//4.Username Correct Password Correct.
	
	String [][] data=null;
			
	public void getexcelvalue() throws BiffException, IOException
	{
		FileInputStream excel=new FileInputStream("C:\\Users\\Maddy\\Desktop");
		jxl.Workbook book=jxl.Workbook.getWorkbook(excel);
		  Sheet page=book.getSheet(0);
		  int rowvalue=sheet.
		  int columnvalue=Sheet.column();
		  
		  Stringp[p[]]
				
		 
		 
		
	}
	
	
	
	@DataProvider(name="giving data")
	public String[][] gettingdata()
	{
		return(data);
	}
	
	
	
	
	
	 @Test(dataProvider="giving data")
	 
	 public void logincorrectpassword(String username,String password)
	 {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 
		 
		 WebElement usernamebutton=driver.findElement(By.id("txtUsername"));
		 usernamebutton.sendKeys(username);
		 
		 WebElement passwordbutton=driver.findElement(By.id("txtPassword"));
		 passwordbutton.sendKeys(password);
		 
		
		 
		 WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		 loginbutton.click();
		 
		 driver.quit();
		 
		 
		 
		 
		 
	 }
	
	
	
	
}
