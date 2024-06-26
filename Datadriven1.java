package DataDrivenFrameWork;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Datadriven1 {
	WebDriver driver;
	@Test(dataProvider="create")
	public void test(String username, String Password)
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	@DataProvider(name="create")
	public Object[][] dataSet()
	{
	return new Object [][] 
	{{"standard_user","secret_sauce"},
	{"locked_out_user","secret_sauce"},
	{"problem_user","secret_sauce"},
	{"performance_glitch_user","secret_sauce"}};
	}

}
