package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoQaTestcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DemoQa Demo = new DemoQa(driver);
		driver.get("https://demoqa.com/automation-practice-form");
		Demo.nameA("Vinay");
		Demo.nameB("Kumar");
		Demo.Email("salkattevinay@gmail.com");
		Demo.Gender();
		Demo.Mobile("9999999999");
		Thread.sleep(5000);
		driver.close();
		System.out.println("POM file Excuted");
		

	}

}
