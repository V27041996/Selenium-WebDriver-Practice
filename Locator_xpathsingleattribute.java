package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_xpathsingleattribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("Vajra739@gmail.com");
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Sudha@123");
		driver.findElement(By.xpath("//*[@value=\"1\"]")).click();
		System.out.println("Script Sucess");
	}

}
