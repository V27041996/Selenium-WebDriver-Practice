package TestNg;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class TestNgAnnotations7 {
WebDriver driver;
@BeforeClass
public void appteststart()
{
System.out.println("Test started");	
}

@AfterClass
public void apptestend()
{
System.out.println("Test Ended");	
}

@Test(priority=1)
public void First()
{
System.out.println("1st Test case passed");	
}

@Test(priority=2)
public void Second()
{
System.out.println("2nd Test case passed");	
}

@Test(priority=3)
public void Third()
{
System.out.println("3rd Test case passed");	
}
}
