package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgFramework7 {
	WebDriver driver;
@Test
public void launchbrowser() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}
@Test
public void verifythetitle() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Assert.assertEquals("Google", driver.getTitle());
}
@Test
public void closethebrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.close();
}
}
