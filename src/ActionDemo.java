import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo { 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		// Here by using action object we are finding the element and then move to
		// specific locator
		// build() --> here our script is ready to execute but it will not executes
		// perform() --> Here our code will executes

		// For our convenience we are creating creating object for webelemnt

		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		// To enter letters in capital letter and select that string

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
//Here keyDown(Keys.SHIFT) --> It will holds the shift key and writes our string in caps
		// keyDown(Keys.SHIFT) --> used to select a string
		a.moveToElement(move).contextClick().build().perform();
		
		driver.manage().window().maximize();
		//To maximize the window
		// contextClick() --> To right click
	}

}


//clickAndHold()  :-- clicks without releasing
//KeyDown:- to hold the a key
//keyUp :- releases the key
 
