package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Tagname1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver set = new ChromeDriver();
		set.get("https://jqueryui.com/accordion/");
		List<WebElement> links = set.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
		System.out.println((links.get(i)).getText());
		}
		
		
		

	}

}
