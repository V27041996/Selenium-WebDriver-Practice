package TestNgsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class TestSuite {
WebDriver driver;

@BeforeSuite
public void TestStart()
{
System.out.println("Test Excution start");
}
@AfterSuite
public void TestEnd()
{
System.out.println("Test Excution Stop");
}

@Test(priority=1)
public void Testsuite1()
{
System.out.println("Testsuite 1 passed");	
}

@Test(priority=2)
public void Testsuite2()
{
System.out.println("Testsuite 2 passed");	
}

@Test(priority=3)
public void Testsuite3()
{
System.out.println("Testsuite 3 passed");	
}
}
