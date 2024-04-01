package TestNg;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class TestNgFramework2 {	
	@Test
	public void title()
	{
	String etitle = "Google";
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	String atitle = driver.getTitle();
	Assert.assertEquals(atitle, etitle);
	}

}
