package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUser {
WebDriver driver;
By User = By.id("user-name");
By Password = By.id("password");
By LoginButton = By.id("login-button");

public LoginUser(WebDriver driver)
{
	this.driver = driver;
}

public void typeusername(String uname)
{
	driver.findElement(User).sendKeys(uname);
}

public void typepassword(String pwd)
{
    driver.findElement(Password).sendKeys(pwd);
}

public void clicklogin()
{
    driver.findElement(LoginButton).click();	
}
}
