import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PaginationTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//Click on veg tab
		//Check sorted or not
		//send key pu --> check for data is there or not and print the text
		//Search for rice in pages and get the price and discount price
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> Items = 	driver.findElements(By.xpath("//tr/td[1]"));
//Getting text for above item list
	List<String> NewItem = Items.stream().map(p->p.getText()).collect(Collectors.toList());
	//Sorting the above list to check whether it was in sorted order or not
List<String> filteredlist =	Items.stream().map(p->p.getText()).sorted().collect(Collectors.toList());
Assert.assertTrue(filteredlist.equals(NewItem));
	filteredlist.forEach(p->System.out.println(p));
	
//Validate data presentation
	
	driver.findElement(By.cssSelector("input#search-field")).sendKeys("PU");
List<WebElement> data = 	driver.findElements(By.xpath("//tr/td[@class='text-center']"));
 List<String> datas = data.stream().map(p->p.getText()).collect(Collectors.toList());
 boolean flag = datas.stream().anyMatch(p->p.contains("PU"));
//Our script will fail to execute here
 //by using soft assertion
 SoftAssert a = new SoftAssert();
a.assertTrue(flag, "The data is no present");


//To print rice price
driver.findElement(By.cssSelector("input#search-field")).clear();

	
	
	}

}
