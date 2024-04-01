package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locator_xpathAndoperation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//*[@class=\"cb-hm-mnu-itm\" and @title=\"Live Cricket Score\"]")).click();
		//and condition 2 condition must be true in the above condition 2 attributes are true so script is pass
		driver.findElement(By.xpath("//*[@title=\"Domestic\" and @id=\"domestab\"]")).click();
		//in above condition 1 attribute is false so output so script is failed
		System.out.println("Script sucess");
	}

}
