import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args)  {
		int j=0;
		String[] vegetables= {"Brocolli", "Tomato", "Beans"};
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items=driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		
		for(int i=0; i<items.size(); i++) {

			String[] itemname = items.get(i).getText().split("-");
			String name=itemname[0].trim();  
			
			List itemNeeded = Arrays.asList(vegetables);
			
			if(itemNeeded.contains(name)) {
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
		//		Thread.sleep(10000);
			 j++;
			 
			 if(j==vegetables.length) {
				 break;
			 
			}
		
		
			
		}
		}

	}

}
