package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoWebSiteTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div:nth-child(1) > div > div > h2:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > input"));
		firstname.sendKeys("Vinay");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
		lastname.sendKeys("Kumar S P");
		WebElement radio = driver.findElement(By.cssSelector("#sex-0"));
		radio.click();
		WebElement radioq =driver.findElement(By.cssSelector("#exp-0"));
		radioq.click();
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("27/04/1996");
		WebElement exp = driver.findElement(By.id("profession-1"));
		exp.click();
		//driver.findElement(By.id("tool-2")).click();
		Select countries = new Select(driver.findElement(By.id("continents")));
		countries.selectByVisibleText("Australia");
		List<WebElement> Vs = countries.getOptions();
		int V = Vs.size();
		System.out.println(Vs.size());
		for(int i=0;i<V;i++)
		{
		 String Options = Vs.get(i).getText();
		 System.out.println(Options);
		}
		Select commands = new Select (driver.findElement(By.id("selenium_commands")));
		commands.selectByVisibleText("Wait Commands");
		List<WebElement> xy = commands.getOptions();
		int X = xy.size();
		System.out.println(xy.size());
		for(int i=0; i<X; i++)
		{
		String Options = xy.get(i).getText();
		System.out.println(Options);
		}
		System.out.println("Script sucess");
	}

}
