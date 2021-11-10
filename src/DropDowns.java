import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
//dropdown with select tag -it is static and we special class to handle this dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));   //passing the webelement
		Select dropdown = new Select(staticDropdown);   //creating object
	
	//Selecting the value of dropdown by different 	
		
		dropdown.selectByIndex(1);
	dropdown.selectByValue("AED");
	dropdown.selectByVisibleText("USD");
	//To deselect the selected elements us .deSelectByValue()  or any other type
	//To de select all use :-- .deSelectAll()
	
	//Adding in dropdown by clicking
	
	driver.findElement(By.id("divpaxinfo")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	//by using for or while loop
	/* int i =1;
	 while(i<5){
	driver.findElement(By.id("hrefIncAdt")).click();
	i++ ;
	}
	
	
	*/
	
	for(int i=1; i<5; i ++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("btnclosepaxoption")).click();
	driver.close();
	}
	
	}


