import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magicbricks {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> button =	driver.findElements(By.xpath("//div[@class='product-action']/button"));
	System.out.println(button.size());
	button.get(2).click();
	System.out.println(button.get(2).getText());
		}

	}

