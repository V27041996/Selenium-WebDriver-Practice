package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_xpathcontains {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//*[@class=\"cb-hm-mnu-itm\" and @title=\"Live Cricket Score\"]")).click();
		driver.findElement(By.xpath("//a[contains(@id,'domestic-tab')]")).click();
		//first copy xpath paste and keep only attribute name
		System.out.println("Script sucess");
		driver.close();
	}

}
