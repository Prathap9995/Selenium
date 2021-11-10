import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input#search-field")).sendKeys("Tomato");
	List<WebElement> items = 	driver.findElements(By.xpath("//tr/td[1]"));
List<WebElement> filteredList = 	items.stream().filter(p->p.getText().contains("Tomato")).collect(Collectors.toList());

Assert.assertEquals(items.size(), filteredList.size());
	}

}
