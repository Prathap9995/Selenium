import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
	
		//To check
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption2")).isSelected());
		
	String label = driver.findElement(By.cssSelector("div#checkbox-example label:nth-child(3)")).getText();
	
	WebElement options = driver.findElement(By.id("dropdown-class-example"));
	Select dropdown = new Select(options);
	dropdown.selectByVisibleText(label);
 	driver.findElement(By.cssSelector("input#name")).sendKeys(label);
	driver.findElement(By.cssSelector("input#alertbtn")).click();
	System.out.println(driver.findElement(By.cssSelector("input#name")).getText());
	String text = driver.switchTo().alert().getText();
	if(text.contains(label)) {
		System.out.println(text);}
	else {
		System.out.println("Error");
	}

		

	}
   
	   
   
 
	}


