package VINDVG1.Vinay27;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
public class SmaplepageTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		WebElement Name =driver.findElement(By.id("g2599-name"));
		Name.sendKeys("Vinay Kumar");
		WebElement Email = driver.findElement(By.id("g2599-email"));
		Email.sendKeys("salkattevinay@gmail.com");
		WebElement Website = driver.findElement(By.id("g2599-website"));
		Website.sendKeys("www.testing.com");
		Select sp = new Select (driver.findElement(By.id("g2599-experienceinyears")));
		sp.selectByValue("1-3");
		List<WebElement> vk = sp.getOptions();
		int Virat=vk.size();
		for(int i=0;i<Virat;i++)
		{
			String Options = vk.get(i).getText();
			System.out.println(Options);
		}
		System.out.println(vk.size());
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]/input")).click();
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div[2]/form/div[5]/label[2]")).click();
		//driver.findElement(By.cssSelector("#contact-form-2599 > form > div.grunion-field-wrap.grunion-field-checkbox-multiple-wrap > label:nth-child(6) > input")).click();
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("Software testers fulfill"
				+ " the quality assurance of software and identify bugs or glitches that would present problems for users. "
				+ "Software testers are required to flag every glitch they encounter and provide feedback for developers. \r\n"
				+ "\r\n"
				+ "Like many of the functions involved in software development and applications, "
				+ "significant savings can be made by accessing the highly experienced and skilled workforce in lower cost "
				+ "labour markets like the Philippines.");
		driver.findElement(By.cssSelector("#contact-form-2599 > form > button")).click();
		Alert Vs=driver.switchTo().alert();
		Vs.accept();	
		System.out.println("Script sucess");
		

	}

}
