package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgFramework5 {
@Test
public void title() throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	String atitle = driver.getTitle();
	System.out.println(atitle);
	String etitle = "jQuery UI";
	SoftAssert SAs = new SoftAssert();
	SAs.assertEquals(etitle, atitle);
	String atext = driver.findElement(By.xpath("//*[@id=\"logo-events\"]/h2/a")).getAttribute("Value");
	System.out.println(atext);
	String etext = "null";
	SAs.assertEquals(etext, atext);
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
