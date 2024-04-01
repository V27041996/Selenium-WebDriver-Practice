package DataDrivenFrameWork;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.Sheet;
import jxl.Cell;

public class Datadriven3 {
    static WebDriver driver;
	@Test(dataProvider = "testdata")
	
public void Slabslogin(String User, String Pwd)throws  InterruptedException
{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("User");
		driver.findElement(By.id("password")).sendKeys("Pwd");
		driver.findElement(By.id("login-button")).click();
		driver.close();
		String url = driver.getCurrentUrl();
		if(url.contains("https://www.saucedemo.com/"))
		{
			System.out.println("User Successful Login Test Case Passed");
		}
		else
		{
			System.out.println("User Fail to Login Test Case Failed");
		}
		Assert.assertEquals(url, "https://www.saucedemo.com/");
}
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();	
	}
	
	@DataProvider(name = "testdata")
	public Object[][] readExcel() throws BiffException,IOException
	{
		File ff = new File("C:\\Users\\salka\\Documents\\DDFW\\DDFramework.xls");
		Workbook ww =Workbook.getWorkbook(ff);
		Sheet ss = ww.getSheet(0);
		int cols = ss.getColumns();
		int rows = ss.getRows();
		System.out.println(cols);
		System.out.println(rows);
		String inputData [] [] = new String [rows] [cols];
		for(int i=0;i<rows;i++)
		{
		for (int j=0;j<cols;j++)
		{
		Cell cc=ss.getCell(j,i);
		inputData[i][j]=cc.getContents();
		System.out.println(inputData[i][j]);
		}
		}
		return inputData;	
	}
}

