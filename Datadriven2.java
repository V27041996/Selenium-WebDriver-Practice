package DataDrivenFrameWork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Datadriven2 {
WebDriver driver;

@Test(dataProvider = "create")
public void test(String Username, String Password)
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.id("email")).sendKeys("Username");
driver.findElement(By.id("pass")).sendKeys("Password");
driver.findElement(By.id("loginbutton")).click();
driver.close();
}

@DataProvider(name="create")
public Object[][] datset()
{
return new Object [][]
	{{"vinay9620@gmail.com","9986078150"},
	{"salkattevinay@gmail.com","8105813019"},
	{"vajra123@gmail.com","7406612475"}};

}
}
