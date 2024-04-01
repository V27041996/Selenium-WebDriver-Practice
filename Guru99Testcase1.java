package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Guru99Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Guru99 guru = new Guru99(driver);
		driver.get("https://www.demo.guru99.com/V4/");
		guru.userid("mngr563814");
		guru.pass("qYsajem");
		guru.sub();
		String Title = driver.getTitle();
		String ActualTitle = "Guru99 Bank Manager HomePage";
		if(ActualTitle.contentEquals(Title))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");
		}
		Thread.sleep(5000);
		//driver.close();
		System.out.println("POM file Excuted");
		

	}

}
