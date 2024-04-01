package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginUserFbTestcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginUserFb logged = new LoginUserFb(driver);
		driver.get("https://www.facebook.com/");
		logged.username("vinay9620@gmail.com");
		logged.password("VinayKumar");
		logged.clickloggedin();
		Thread.sleep(3000);
		//driver.close();
		System.out.println("POM file Excuted");
		

	}

}
