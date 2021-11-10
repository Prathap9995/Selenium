import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class  WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on desired column
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
        //List the elements
		List<WebElement> veglist = driver.findElements(By.xpath("//tr/td[1]"));
		// Get the text from original list and store it in another list
		List<String> newlist = veglist.stream().map(s -> s.getText()).collect(Collectors.toList());
        //Sort the original list
		List<String> sortedlist = newlist.stream().sorted().collect(Collectors.toList());
		// Then compare both
		Assert.assertTrue(newlist.equals(sortedlist));

		// To scan the name column and to get the price of Beans
		List<String> price = veglist.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getPriceVeg(s))
				.collect(Collectors.toList());
		// here we are filters and then map that data and store it in a list
		// To print the price of the wheat
		price.forEach(a -> System.out.println(a));
	}

	    // To get the price of veg we are implementing custom method
	public static String getPriceVeg(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// Here we are using sibling traverse method
		return pricevalue;
	}

}
