package TestNg;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class TestNgAnnotations5 {
WebDriver driver;
@BeforeMethod
public void dbconnect()
{
System.out.println("Db is connected");	
}

@Test(priority=1)
public void launchbrowser()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("Test case 1 passed");
}

@Test(priority=2)
public void verifythegoogletitle()
{
driver.get("https://www.google.co.in/");	
Assert.assertEquals("Google", driver.getTitle());
System.out.println("Test case 1 passed");
}

@Test(priority=3)
public void verifyseleniumTitle()
{
driver.get("https://www.selenium.dev/");
Assert.assertEquals("Selenium", driver.getTitle());
System.out.println("Test case 2 passed");
}

@Test(priority=4)
public void verifyyoutubeTitle()
{
driver.get("https://www.youtube.com/");
Assert.assertEquals("YouTube", driver.getTitle());
System.out.println("Test case 3 passed");
}

@Test(priority=5)
public void closebrowser()
{
	driver.close();
}
@AfterMethod
public void Dbdisconnected()
{
System.out.println("Db is disconnetd");
}
}


