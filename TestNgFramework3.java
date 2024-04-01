package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgFramework3 {
	
	@Test
	public void title () 
	{
	SoftAssert Sassert = new SoftAssert();
	String etitle = "google";
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	String atitle = driver.getTitle();
	System.out.println("Verifying Title");
	Sassert.assertEquals(etitle, atitle, "Sorry Test Script failed");
	
	}
		
	

}
