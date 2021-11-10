import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Exercise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.cssSelector("input#OneWay")).click();
		driver.findElement(By.cssSelector("input#FromTag")).sendKeys("Ban");
		List<WebElement> Fromcities = driver.findElements(By.cssSelector("ul#ui-id-1 li"));

		for (int i = 0; i < Fromcities.size(); i++) {
			String City = Fromcities.get(i).getText();
			if (City.contains("Bangalore")) {
				driver.findElement(By.cssSelector("ul#ui-id-1 li")).click();
			}

		}

		driver.findElement(By.cssSelector("input#ToTag")).sendKeys("New");

		List<WebElement> toCities = driver.findElements(By.cssSelector("ul#ui-id-2 li"));

		for (WebElement tocity : toCities) {
			String newcity = tocity.getText();
			if (newcity.contains("New York")) {
				tocity.click();
			}
		}

		driver.findElement(By.cssSelector("a[class*=ui-state-active]")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[title='Return date']")).isEnabled());
		
		driver.findElement(By.id("Adults")).click();
		
	WebElement number = 	driver.findElement(By.cssSelector("select#Adults"));
	Select staticdropdowns = new Select(number);
	staticdropdowns.selectByValue("5");
	driver.findElement(By.cssSelector("div#MoreOptionsDiv i")).click();
	
	driver.findElement(By.cssSelector("select#Class")).click();
	WebElement coach = driver.findElement(By.cssSelector("select#Class"));
		Select dropdown = new Select(coach);
		dropdown.selectByVisibleText("Business");
		
		driver.findElement(By.cssSelector("input#AirlineAutocomplete")).sendKeys("APG");
		List<WebElement> Airlines = driver.findElements(By.cssSelector("ul#ui-id-3 li"));
		for(int i=0; i<Airlines.size();i++) {
			String newAir = Airlines.get(i).getText();
			if(newAir.contains("APG")) {
				driver.findElement(By.cssSelector("ul#ui-id-3 li")).click();
				driver.findElement(By.cssSelector("input#SearchBtn")).click();
			}
		}
	}

}





/*
 * driver.findElement(By.
 * cssSelector("div.monthBlock.last div.title span.ui-datepicker-month")).
 * getText().contains("August");
 * 
 * while(!driver.findElement(By.
 * cssSelector("div.monthBlock.last div.title span.ui-datepicker-month")).
 * getText().contains("August")) {
 * driver.findElement(By.cssSelector("div.header a.nextMonth")).click();}
 */

/*
 * List<WebElement> dates =
 * driver.findElements(By.cssSelector("div#ui-datepicker-div table[css='2']"));
 * int num = dates.size();
 * 
 * for (int i = 0; i < num; i++) { String newdate = dates.get(i).getText(); if
 * (newdate.equalsIgnoreCase("5")) {
 * driver.findElement(By.cssSelector("div#ui-datepicker-div table[css='2']")).
 * click(); break; }
 * 
 * }
 */
