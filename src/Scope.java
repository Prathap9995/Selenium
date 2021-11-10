import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait w = new WebDriverWait(driver,3);
		
	//To get the links in whole page	
	System.out.println(	driver.findElements(By.tagName("a")).size());
	
	//To get links from footer section
	WebElement footer = driver.findElement(By.id("gf-BIG"));     //Limiting the scope of driver to footer section only
	
	System.out.println(	footer.findElements(By.tagName("a")).size());
	
	//To get links count from perticular section from footer
	WebElement column1 = footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
	System.out.println(	column1.findElements(By.tagName("a")).size());
	
	//To click on each link in the column and check if the pages are opening
	//using for loop
	//Here we are starts from second link 
	for(int i =1; i<column1.findElements(By.tagName("a")).size(); i++)
	{
		
		/*column1.findElements(By.tagName("a")).get(i).click();  ---> It will give error because once click on the link
	it navigate to new window from that window we are unable to fetch the details
	hence by using control key we can open every link in new tab*/
		// We can achieve it by every time we have to click back button   --> It will take lots of time
		
		String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);  //By hitting the control+Enter button we can open a new tab
		column1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		w.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));
	}
	//to print the title of the new 
		//By using window handler method
		
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	
	while(it.hasNext()) {    //here hasNext checks for whether current window has a next window or not
		driver.switchTo().window(it.next());    //here we are switching to new windows
	System.out.println(driver.getTitle());
	
	}
		
		
	}
	}


