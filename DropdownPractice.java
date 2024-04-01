package VINDVG1.Vinay27;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		Select Ab= new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		Ab.selectByValue("IND");
		List<WebElement>Vs=Ab.getOptions();
		int q=Vs.size();
		for(int i=0; i<q; i++)
		{
			String Options = Vs.get(i).getText();
			System.out.println(Options);
		}
		System.out.println(Vs.size());
		
		
	}

}
