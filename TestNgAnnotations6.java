package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class TestNgAnnotations6 {
WebDriver driver;

@BeforeMethod
public void dbconnected()
{
System.out.println("Db is connected");
}

@Test(priority=1)
public void launchbrowser()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("Testcase 1 passed");
}

@Test(priority=2)
public void verifyfacebooktitle()
{
driver.get("https://www.facebook.com/");
String atitle = driver.getTitle();
Assert.assertEquals("www.facebook.com", atitle);
System.out.println("Testcase 2 passed");
}


@Test(priority=3)
public void verifytitle()
{
driver.get("https://www.w3schools.com/");
String atitle = driver.getTitle();
Assert.assertEquals("W3Schools Online Web Tutorials", atitle);
System.out.println("Testcase 3 passed");
}

@Test(priority=4)
public void closebrowser()
{
	driver.close();
}

@AfterMethod
public void dbdisconnected()
{
	System.out.println("Db is dsconnected");
}
}
