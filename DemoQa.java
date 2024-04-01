package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class DemoQa {
WebDriver driver;

By firstname = By.id("firstName");
By lastname = By.id("lastName");
By email = By.id("userEmail");
By gender = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
By number = By.id("userNumber");
By subjects = By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
By hobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");
By address = By.id("currentAddress");
By submit = By.id("submit");

public DemoQa(WebDriver driver)
{
	this.driver = driver;
}

public void nameA(String fname)
{
  driver.findElement(firstname).sendKeys(fname);	
}

public void nameB(String lname)
{
  driver.findElement(lastname).sendKeys(lname);	
}

public void Email(String mail)
{
  driver.findElement(email).sendKeys(mail);	
}

public void Gender()
{
  driver.findElement(gender).click();
}

public void Mobile(String num)
{
	driver.findElement(number).sendKeys(num);
}
}
