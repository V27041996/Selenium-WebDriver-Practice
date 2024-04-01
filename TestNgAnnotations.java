package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgAnnotations {
	WebDriver driver;
@Test (priority=1)
public void launchbrwoser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Test(priority=2)
public void verifythetitle() {
	driver.get("https://www.google.com/");
	Assert.assertEquals("Google", driver.getTitle());
}

@Test (priority=3)
public void closeBrowser()
{
driver.close();
}
}
