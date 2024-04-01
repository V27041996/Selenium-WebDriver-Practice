package TestNgsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class TestTest {
WebDriver driver;
@BeforeTest
public void Teststarted()
{
	System.out.println("Test Start");
}
@AfterTest
public void TestStopped()
{
	System.out.println("Test Stop");
}

@Test(priority=1)
public void Test1()
{
    System.out.println("Test1 is passed");	
}

@Test(priority=2)
public void Test2()
{
     System.out.println("Test2 is passed");	
}

@Test(priority=3)
public void Test3()
{
    System.out.println("Test3 is passed");	
}
}
