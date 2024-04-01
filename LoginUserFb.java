package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class LoginUserFb {
WebDriver driver;

By user = By.id("email");
By password = By.id("pass");
By login = By.name("login");

public LoginUserFb(WebDriver driver)
{
this.driver = driver;	
}

public void username(String name)
{
 driver.findElement(user).sendKeys(name);
}

public void password(String Psd)
{
driver.findElement(password).sendKeys(Psd);
}

public void clickloggedin()
{
driver.findElement(login).click();	
}
}
