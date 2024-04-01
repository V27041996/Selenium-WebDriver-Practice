package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_id {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/login/show.do");
		driver.findElement(By.id("userName")).sendKeys("Vinay12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		System.out.println("Script success");

	}

}
