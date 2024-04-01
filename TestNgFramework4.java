package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;

public class TestNgFramework4 {
@Test
public void title() 
{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.ebay.com/");
driver.manage().window().maximize();
String atitle = driver.getTitle();
System.out.println(atitle);
String etitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
Assert.assertEquals(etitle, atitle);
String atext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Value");
System.out.println(atext);
String etext = "Search";
Assert.assertEquals(etext, atext);
}
}
