package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Guru99 {

	WebDriver driver;
	
	By UserID = By.name("uid");
	By Password = By.name("password");
	By Login = By.name("btnLogin");
	
	public Guru99(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void userid(String UID)
	{
		driver.findElement(UserID).sendKeys(UID);
	}
	public void pass(String PWD)
	{
		driver.findElement(Password).sendKeys(PWD);
	}
	public void sub()
	{
		driver.findElement(Login).click();
	}
	
}

