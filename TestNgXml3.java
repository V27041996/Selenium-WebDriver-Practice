package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgXml3 {
WebDriver driver;

@Test(priority=1,groups="ReTesting")
public void launchbrowser()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.javatpoint.com/");
driver.manage().window().maximize();
System.out.println("TestCase Passed");
}


@Test(priority=2,groups="Regression")
public void Verifythetitle()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.javatpoint.com/");
driver.manage().window().maximize();
String atitle = driver.getTitle();
Assert.assertEquals("Tutorials List - Javatpoint", atitle);
System.out.println("TestCase Passed");
}

@Test(priority=2,groups="Regression")
public void clicktheseleniumsection()
{
driver.get("https://www.javatpoint.com/");
driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[13]")).click();
System.out.println("TestCase Passed");
}
}
