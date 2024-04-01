package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgxml2 {
WebDriver driver;

@Test(priority=1,groups="SmokeTesting")
public void launchbrowser()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	driver.manage().window().maximize();
	System.out.println("SmokeTest Completed");
}


@Test(priority=2,groups="FunctionalTesting")
public void verifytitle()
{
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	driver.manage().window().maximize();
    String atitle = driver.getTitle();
    Assert.assertEquals("W3Schools Online Web Tutorials", atitle);
    System.out.println("FunctionalTesting Passed");
}

@Test(priority=3,groups="FunctionalTesting")
public void Enterthevaalue()
{
	driver = new ChromeDriver(); 
	driver.get("https://www.w3schools.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("Typing Test");
    System.out.println("FunctionalTesting Passed");
}


@Test(priority=4,groups="FunctionalTesting")
public void clickthebutton()
{
	driver = new ChromeDriver(); 
	driver.get("https://www.w3schools.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("Typing Test");
    driver.findElement(By.id("learntocode_searchbtn")).click();
    System.out.println("FunctionalTesting Passed");
}


@Test(priority=5,groups="SanityTesting")
public void closethebrowser()
{
	driver = new ChromeDriver(); 
	driver.get("https://www.w3schools.com/");
    driver.manage().window().maximize();
	driver.close();	
}
}
