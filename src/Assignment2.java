import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		driver.findElement(By.cssSelector("input[id='FromTag']")).sendKeys("New");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("New Delhi, IN - Indira Gandhi Airport (DEL)"))
				;
			{
				option.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[id='ToTag']")).sendKeys("Ban");
		List<WebElement> Lists = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));

		for (WebElement List : Lists) {
			if (List.getText().equalsIgnoreCase("Bangalore, IN - Kempegowda International Airport (BLR)")) {
				List.click();
				break;

			}
		}

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight")).click();
//	driver.findElement(By.cssSelector("a[class*='ui-state-highlight")).click();

		driver.findElement(By.id("Adults")).click();
		WebElement staticDropdown = driver.findElement(By.id("Adults"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("5");

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("Class")).click();
		WebElement statrDpdn = driver.findElement(By.id("Class"));
		Select dpdown = new Select(statrDpdn);
		dpdown.selectByVisibleText("First");

		driver.findElement(By.cssSelector("input[name='airline']")).sendKeys("AirIndia");
//System.out.println(driver.findElement(By.cssSelector("input[name='airline']")).getText());
		driver.findElement(By.id("SearchBtn")).click();

	}

}
