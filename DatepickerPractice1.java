package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DatepickerPractice1 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://material.angular.io/components/datepicker/overview");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#datepicker-overview > div > div.docs-example-viewer-body.ng-star-inserted >"
			+ " datepicker-overview-example > mat-form-field > div.mat-mdc-text-field-wrapper.mdc-text-field.ng-tns-c2608167813-3."
			+ "mdc-text-field--filled > div.mat-mdc-form-field-flex.ng-tns-c2608167813-3 > "
			+ "div.mat-mdc-form-field-icon-suffix.ng-tns-c2608167813-3."
			+ "ng-star-inserted > mat-datepicker-toggle > button > span.mat-mdc-button-touch-target")).click();
	driver.findElement(By.cssSelector("#mat-datepicker-0 > div > mat-month-view > table > tbody > tr:nth-child(5) > "
			+ "td:nth-child(7) > button > span.mat-calendar-body-cell-content.mat-focus-indicator")).click();
	System.out.println("Calender Visibile");

	}

}
