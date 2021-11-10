

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		  driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR'])")).click();
		
		driver.findElement(By.cssSelector("span.ui-state-default")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		if(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()) {
			Assert.assertTrue(true);
			System.out.println("Selected");
		}
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	driver.findElement(By.id("divpaxinfo")).click();
	for(int i=1; i<5; i ++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(selectdropdown);
		dropdown.selectByVisibleText("USD");
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		
		
	}

}
