import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntrwImp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com");
       System.out.println(driver.getCurrentUrl());
       driver.findElement(By.xpath("//div[contains(@class, 'gb_9d')]/div/a")).click();  //Using parent to child path
	driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//span[@class='group-heading']/following-sibling::span")).click();
//	driver.findElement(By.xpath("//span[@class='group-heading']/parent::a")).click();
	}

}



//  //div[contains(@class, 'gb_9d')]/div/a    //using parent-child relationship   --> parent class xpath/child tagname/chiltagename/original locator tagname
//chropath same as firepath...to get Xpath &css


//  To traverse with siblings==> Syntax - Xpath of Static element/following-sibling::tagname

//Traverse back to parent==>Syntax==> Xpath of child element/Parent::tagname{parenttagname}

// Write Xpath using text :- Syntax :- //*[text()=' UI text ']     --> Not preferred 

/*By using folowing :--> Select all the elements after the current node  --> It will refers the followed by the static elemnts..we can achieve using mentioning the index which element we desired
 * Syntax //*[@tagname='value']/following::tagname[index]*/ 

/*By Using ansestor :--> It will select all ansestor elements including grandparent parent etc   
 * Syntax :-->//tagname[text()='value']//ansestor::tagname[index]--->if we have to get desired set of nodes we have to set index*/

/*Child--> to list all the childe elements of current node--->to get desired element use index  
 *Syntax --> //*[@tagname='value']child::tagname[index] */

/*Preceding:--> To select all the elements before the current node
 * Syntax --> //*[@tagname='value']preceding::tagname[index]
 */

