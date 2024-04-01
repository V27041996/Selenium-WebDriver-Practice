package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleFormsample {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeI8_vYyaJgM7SJM4Y9AWfLq-tglWZh"
				+ "6yt7bEXEOJr_"
				+ "L-hV1A/viewform?formkey=dGx0b1ZrTnoyZDgtYXItMWVBdVlQQWc6MQ");
		driver.manage().window().maximize();
		Actions Sudha = new Actions(driver);
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		firstname.sendKeys("QuillBot");
		Sudha.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Sudha.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Sudha.sendKeys(Keys.TAB);
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/textarea"));
		Sudha.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		WebElement ccc = driver.findElement(By.cssSelector("#i16 > div.vd3tt > div"));
		ccc.click();	
	    WebElement cc =driver.findElement(By.cssSelector("#i30 > div.uHMk6b.fsHoPb"));
		cc.click();
		/*Select ss =new Select(driver.findElement(By.cssSelector("#mG61Hd > div.RH5hzf.RLS9Fe > div > div.o3Dpx > div:nth-child(5) > div > div > div.vQES8d > div > div:nth-child(1) > div.ry3kXd > div.MocG8c.HZ3kWc.mhLiyf.OIC90c.LMgvRb.KKjvXb > span")));
		List<WebElement> ny=ss.getOptions();
		int q = ny.size();
		for(int i=0;i<q;i++)
		{
			String Options=ny.get(i).getText();
			System.out.println(Options);
		}*/
		WebElement bot =driver.findElement(By.cssSelector("#mG61Hd > div.RH5hzf.RLS9Fe > div > div.o3Dpx > div:nth-child(6) > "
				+ "div > div > div.PY6Xd > div.lLfZXe.fnxRtf.BpKDyb > "
				+ "span > div > label:nth-child(4) > div.eRqjfd > div > div > div.vd3tt > div"));
		bot.click();
		WebElement ab =driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div/div[3]/div"));
		ab.click();
		WebElement bc =driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div/div[3]"));
		bc.click();
		WebElement xy =driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div/div[3]/div"));
		xy.click();
		WebElement rt =driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[8]/span/div[5]/div/div/div[3]/div"));
		rt.click();
		
		System.out.println("Script sucess");
	}

}
