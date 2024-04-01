package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class Guru99 {
	
WebDriver driver;
	
@BeforeTest
public void LoginStarted()
{
System.out.println("Login started");	
}

@Test(priority=1)
public void launchbrowser()
{
	WebDriverManager.chromedriver();
	driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4/index.php");
	driver.manage().window().maximize();
}
@Test(priority=2)
public void InvaliduserValidPassword() throws InterruptedException
{
driver.findElement(By.name("uid")).sendKeys("mngr56381");
driver.findElement(By.name("password")).sendKeys("qYsajem");
driver.findElement(By.name("btnLogin")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();
System.out.println("Login failed");
}

@Test(priority=3)
public void ValiduserInValidPassword() throws InterruptedException
{
driver.findElement(By.name("uid")).sendKeys("mngr563814");
driver.findElement(By.name("password")).sendKeys("qYsaje");
driver.findElement(By.name("btnLogin")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();
System.out.println("Login failed");
}

@Test(priority=4)
public void InvaliduserInValidPassword() throws InterruptedException
{
driver.findElement(By.name("uid")).sendKeys("mngr56381");
driver.findElement(By.name("password")).sendKeys("qYsaje");
driver.findElement(By.name("btnLogin")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();
System.out.println("Login failed");
}

@Test(priority=5)
public void closethebrowser()
{
driver.quit();	
}


@AfterTest
public void LoginEnded()
{
System.out.println("Login Ended");	
}

}
