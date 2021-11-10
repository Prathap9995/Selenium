import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pricetable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	 
        //We are list out the webelements
		//By using filter we are getting required data then by using map we are getting the price 
		//Store into another list by using collect
		//We are creating custom method here to traverse to siblings and get the price value
	List<WebElement> vegs=	driver.findElements(By.xpath("//tr/td[1]"));
List<String> prices = 	vegs.stream().filter(p->p.getText().contains("Tomato")).map(p->getPriceVeggies(p)).collect(Collectors.toList());
prices.forEach(a->System.out.println(a));
	
		
//Pagination
		//If we dindnt find the element in first page then we to search in next page then by using pagination
		//Use do while loop here because at first we are searching then we are applying condition
List<String> dataprice;
driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();

do {
List<WebElement> data = driver.findElements(By.xpath("//tr/td[1]"));
  dataprice =   data.stream().filter(p->p.getText().contains("Rice")).map(p->getPriceVeggies(p)).collect(Collectors.toList());
	
	dataprice.forEach(p->System.out.println(p));
	 //If data is not present in the page then we have to search in next page
	if(dataprice.size()<1) {
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}}
	while(dataprice.size()<1); //Checks for condition 
	
	
	}
	private static String getPriceVeggies(WebElement p) {
	String newprice = 	p.findElement(By.xpath("following-sibling::td[1]")).getText();
	return newprice;
	}

	
	
	
	
	
}
