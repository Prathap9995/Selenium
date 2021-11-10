import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExcs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
	driver.findElement(By.cssSelector("input#OneWay")).click();
	
	driver.findElement(By.cssSelector("input#FromTag")).sendKeys("Ban");
	
	List<WebElement> fromCity = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
	
	for(WebElement fromCities :fromCity) {
		fromCities.getText().contains("Bangalore");
		fromCities.click();
	}
		
	}

}
