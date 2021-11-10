import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		//by casting we are invoking our driver to execute javascript
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("window.scrollBy(0,500)");

		//window.scrollBy(0,500) ==> It is javascript to scroll in wondows
		//To scroll inside a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=4000");

		//To handle grind in table[to select a perticular column from table]
		//by using parent-child of css i,e :- parentpath childtagname:nth-child[required field number]
		
		List<WebElement> num = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		//To calculate the sum of values
		
		int sum =0;
		
		for(int i=0; i < num.size();i++) {
			
			int intvalue = Integer.parseInt(num.get(i).getText());   //To get the value and then converts it into integer
		sum = sum+intvalue;
		
		
		}
		
		
		
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount"));
	String[] total=	driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
		int newtotal = Integer.parseInt(total[1].trim()) ;
		System.out.println(newtotal);
	//To compare	
	Assert.assertEquals(sum, newtotal);
			
//Assignment	
	
	List<WebElement> element = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
	int sum1 = 0;
	for(int i =0; i<element.size();i++) {
	sum1= sum1+	Integer.parseInt(element.get(i).getText());
	System.out.println(sum1);
	
	
	
		
		
	}
	
	}
		}
		
	

