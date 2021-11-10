import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //implicit wait.
		//Here our code will wait for 5 min for each and every steps
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemVeg = {"Brocolli","Cauliflower","Beetroot","Tomato"};
		
		Synchronization s = new Synchronization();
		s.addItem(driver, itemVeg);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='action-block'] button")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		WebDriverWait w= new WebDriverWait(driver, 5);  
		//We are creatin object of webdriver wait class...and declaring object driver with required time to wait 5 sec
		//we can declare the above class globally 
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		//here we are targeting a perticulat element to wait
		//By avove syntax we can ac hieve it.
		
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	

	}
	public void addItem(WebDriver driver, String[] itemVeg) {
		List<WebElement> itemList = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j=0;
		for(int i=0; i<itemList.size();i++) {
			List itemNeeded = Arrays.asList(itemVeg);
		String[] itemName=itemList.get(i).getText().split("-");
			String newItem = itemName[0].trim();
			
			if(itemNeeded.contains(newItem)) {
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();   //Here add to cart text is dynamic.
				//Hence by using get(index) we can achieve required field with parent child locator
				
				j++;
			if(j==itemVeg.length) {
				break;
			}
			
			}
			
		
		
	}
	
	
	
	}
}



//based on project requirement we can use any of the waut mechanism to achieve our result