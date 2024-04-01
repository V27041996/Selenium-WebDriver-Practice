package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locator_xpathORoperation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//*[@class=\"cb-hm-mnu-itm\" or @title=\"Live Cricket Scoresetxgdfgjvgc\"]")).click();
		System.out.println("Script sucess");

	}

}
