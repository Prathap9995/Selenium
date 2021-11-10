import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
  driver.findElement(By.xpath("//a[@value='IXG']")).click();
  driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
  
  driver.findElement(By.cssSelector(".ui-state-default")).click();

  
  //To check whether Element is enabled or Disabled
  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));  //To print the value before clicking on radio button
  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));  //Prints value after clicking
  
 if( driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {    //Here using get attribute we are validating the elements condition 
	 System.out.println("Enabled"); //or by using assertion
	 Assert.assertTrue(true);
 } 
 else {
	 Assert.assertTrue(false);   //Test will fail here icase of condition is not met only
 }
	}

}
