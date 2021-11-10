import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		String[] vegetables = {"Cucumber","Beetroot","Brocolli"}; // Declaring an array to get multiple products

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000); // Sleeps for 3 secs
	
			
			int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']")); // Passing
																										// webelement
																										// for list of
																										// products

		for (int i = 0; i < products.size(); i++) { // here we are using for loop to check every element

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// By using get(i) to retrive the product and to get the text we are using
			// getText
			// format product name to get actual product name
			// Using split we are seperating our vegetable name into two part...so hence we
			// are declared it as array...bcz there were two elements
			// To romove the spaces in the name we are usimg trim() ..here we are trimming
			// first name(frst index)

			List prodVeg = Arrays.asList(vegetables);
			// converting array into arraylist to search very easily

			if (prodVeg.contains(formattedName)) // check whether extracted name is present in arraylist or not
			{
				j++;
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				// //using visible text we are creating --> this is not consitance hence we are
				// not using it

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i) .click();// Its recommended in// this type of scenario
				
				//get(i) we are clicking here for required field
				
				if (j == vegetables.length) {
//Here we can't insert break directly...bcz it will not meet all the condition hence by using if we can achieve it			
					break;
				}
			}
		}
	}

}

//Here every element have same locator we are unable to find unique hence by passing webelement and for loop we are finding it.
//If we have multiple item to select by using array we can achieve it

//Where text locator is not recommende as we seen in this scenario add to cat button is changing and it will take time to load hence....by using parent child traverse we did that
