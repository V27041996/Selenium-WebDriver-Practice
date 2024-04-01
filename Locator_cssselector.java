package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_cssselector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		//driver.findElement(By.cssSelector("search2.ga-fp[placeholder='Search our tutorials, e.g. HTML']")).sendKeys("test your typing speed");
		driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("test your typing speed");
		System.out.println("Script Success");

	}

}