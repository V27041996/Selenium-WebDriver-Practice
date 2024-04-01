package TestNg;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgAnnotations4 {
WebDriver driver;
@BeforeMethod
public void dbconnect()
{
System.out.println("DB is connected");	
}
@AfterMethod
public void dbdisconnect()
{
System.out.println("DB is disconnected");
}
@Test (priority=1)
public void firstone() 
{
	System.out.println("First test case passed");
}

@Test (priority=2)
public void secondone()
{
	System.out.println("Second Test case passed");
}

@Test (priority=3)
public void thirdone()
{
    System.out.println("Third Test case passed");	
}
}
