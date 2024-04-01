package TestNg;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class TestNgAnnotations3 {

WebDriver driver;
@BeforeTest
public void appteststart()
{
System.out.println("Application Testing Started");	
}

@Test (priority = 1, description = "This is for launch Webbrowser")
	public void Launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

@Test (priority = 2, description = "This is for verify the Googletitle")

    public void Verifythegoogletitle()
    {
	driver.get("https://www.google.co.in/");
	Assert.assertEquals("Google", driver.getTitle());
    }

@Test (priority = 3, description = "This is for verify the Yahoootitle")

public void Verifytheyahootitle()
{
driver.get("https://www.yahoo.com/");
Assert.assertEquals("Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos", driver.getTitle());
}

@Test (priority = 4, description = "This is for verify the Yahoootitle")
public void verifyseleniumtitle()
{
driver.get("https://www.selenium.dev/");
Assert.assertEquals("Selenium", driver.getTitle());
}

@Test (priority=5, description = "This is for verify the closebrowser")
public void closebrowser()
{
driver.close();
}
@AfterTest
public void apptestfinish()
{
System.out.println("Application Testing Finished");	
}

}
