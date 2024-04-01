package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 ;

public class Locator_xpathabsolute {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[4]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[3]/a")).click();
	System.out.println("Scrpit Sucess");

	}

}
