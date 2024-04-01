package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUserTestcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginUser login = new LoginUser(driver);
		driver.get("https://www.saucedemo.com/");
		login.typeusername("standard_user");
		login.typepassword("secret_sauce");
		login.clicklogin();
		Thread.sleep(5000);
		driver.close();
		System.out.println("POM File Excuted");

	}

}
