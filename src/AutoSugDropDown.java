import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSugDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    //here return type is webelement and we are parameter to get the all the options using list<webelemt> return type
	
	//Using for each loop we are scanning for elements.
	 for(WebElement option :options) {
		  if(option.getText().equalsIgnoreCase("India"))     //here getText() scans for items then if it equals to India...it will click.
		  {
			  option.click();
		break;
		  } 
	 //We can achieve it by for loop also
	 for(int i =0; i<options.size(); i++) {
		 String country = options.get(i).getText();
		 
		 if(country.equalsIgnoreCase("India")) {
			 
	 options.get(i).click(); 
		
		 }
			 
			
		 }
	 }
		
		}
	
