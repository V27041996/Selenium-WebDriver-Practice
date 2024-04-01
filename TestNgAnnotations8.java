package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
public class TestNgAnnotations8 {
WebDriver driver;

@BeforeClass
public void ApptestStarted()
{
System.out.println("Testing started");	
}


@Test(priority=1)
public void launchbrowser()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}

@Test(priority=2)
public void verifytitle()
{
driver.get("https://demo.guru99.com/telecom/addcustomer.php");
String atitle = driver.getTitle();
Assert.assertEquals("Guru99 Telecom Add Customer", atitle);
System.out.println("Test case passed");
}
@Test(priority=3)
public void EnteringValuesintextBox() throws InterruptedException
{
	driver.get("https://demo.guru99.com/telecom/addcustomer.php");
	driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys("Vinay");
	driver.findElement(By.id("lname")).sendKeys("Kumar");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("salkattevinay@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("telephoneno")).sendKeys("9999999999");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().accept();
	
	System.out.println("Test Case Passed");
}

@Test(priority=4)

public void Closethebrowser()
{
driver.close();	
}


@AfterClass
public void AppTestended()
{
System.out.println("Testing ended");	
}

}
