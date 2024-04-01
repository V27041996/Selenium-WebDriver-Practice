package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.asserts.SoftAssert;
public class TestNgFramework6 {
@Test

public void verifytitle() 
{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/");
driver.manage().window().maximize();
String atitle = driver.getTitle();
System.out.println(atitle);
String etitle = "jQuery U";
if(atitle.equals(etitle))
{
System.out.println("Jquery title verified test case passed");	
}
else
{
System.out.println("Jquery title not verified test case failed");
}
SoftAssert soft = new SoftAssert();
soft.assertEquals(etitle, atitle, "Sorry");
}
}
