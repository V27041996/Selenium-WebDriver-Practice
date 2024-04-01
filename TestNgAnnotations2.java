package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgAnnotations2 {
WebDriver driver;
@Test (priority=1)
public void Launchbrowser() 
{
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
}


@Test (priority=2)
public void verifygoogletitle() throws InterruptedException
{
driver.get("https://www.google.co.in/");
Assert.assertEquals("Google", driver.getTitle());

}


@Test (priority=3)
public void verifyyahootitle() throws InterruptedException
{
driver.get("https://www.yahoo.com/");
Assert.assertEquals("Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos", driver.getTitle());
}

@Test (priority=4)
public void verifyseleniumtitle() throws InterruptedException
{
driver.get("https://www.selenium.dev/");
Assert.assertEquals("Selenium", driver.getTitle());
}

@Test (priority=5)
public void closebrowser()
{
driver.close();
}

}

