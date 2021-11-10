import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		//Assertion
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected()); //Instead of using system.out.println....it is recommended
		//our assert condition wants false result. here our code result false hence execution will continue		
		//If above code is true then our test will fail and stops execution  i,e Assert.assertfalse(true)-->Testfail
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected()); 
		
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();    //To click on the desired checkbox.
	  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
	  //expecting true condition and from our code it is true hence it is continues execution
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());   
		//==>To print whether it is selected or not...If it prints true thene selected.
		
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); // ==> To get the size of that elements
  
	
	driver.findElement(By.id("divpaxinfo")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1; i<5; i ++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	//Here it compares condition and expected result it it both matches then executes
	
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("btnclosepaxoption")).click();
	driver.close();
	
	
	}

}
