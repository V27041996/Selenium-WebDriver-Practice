package TestNgsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {
WebDriver driver;

@Test(priority=1)
public void LaunchBrowser()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.guru99.com/live-testing-project.html");
driver.manage().window().maximize();
System.out.println("Test case passed");
}

@Test(priority=2)
public void Verifythetitle()
{
driver.get("https://www.guru99.com/live-testing-project.html");
driver.manage().window().maximize();
String atitle = driver.getTitle();
Assert.assertEquals("Live Manual Testing Project: Online Software Testing Practice", atitle);
System.out.println("Test case passed");
}

@Test(priority=3, enabled=false)
public void Enterthevalue()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.guru99.com/live-selenium-project.html");
driver.manage().window().maximize();
driver.findElement(By.id("awf_field-93653884")).sendKeys("vinay0@gmail.com");
driver.findElement(By.id("af-submit-image-482158182")).click();
System.out.println("Test Case passed");
}
}
