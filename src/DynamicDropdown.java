import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
  driver.findElement(By.xpath("//a[@value='IXG']")).click();
  driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();   // Here we are passing the value to 2nd index
//	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
	}

}



// //a[@value='BLR'])[1] -->xpath of the desire option[index number]  -->here we are specifying to which index we have to select values
//By default next index will open once we choose the value from last index.

/*  Another way to get second index value by parent child relationship --Alternate of index (some of the cases client will not accept index so hence)

i,e Xpath of parent xpath of child

 i,e //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']
*/