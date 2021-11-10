import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Broker URL
		//Java  method will calls the URL and helps to get the status code
		//To get URL we need Selenium\
		//If status code >400 then that url is not working-->link which tied up url is broken
		
		//Step-1 to get all the urls tied up with links using selenium
 String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//here we are getting the links by using getattribute method

//Then by using a predifined method openConnction() and URL class

   HttpURLConnection connect = (HttpURLConnection) new URL(url).openConnection();     //Or we can caste here by using HttpURLConnection
   connect.setRequestMethod("HEAD");  //We are requesting here
   connect.connect();   //We are connection to desired link
 int rescode =  connect.getResponseCode();  //We are getting response coed here
 System.out.println(rescode);  //Here the status codeb values is 200 which means it is working fine
 
 //Checking for broken link
  String brokenurl = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
HttpURLConnection newconnection =  (HttpURLConnection) new URL(brokenurl).openConnection();
newconnection.setRequestMethod("HEAD");
newconnection.connect();
int newcode = newconnection.getResponseCode();
System.out.println(newcode);    //This code value is greater than 400 hence broken page

//To check from all the links
List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));  //Listing links
//By using enchanced for loop or for loop
//Creating soft asswertion object

SoftAssert a = new SoftAssert();

for(WebElement link:links) {
	String newlink = link.getAttribute("href");
	HttpURLConnection con = (HttpURLConnection) new URL(newlink).openConnection();
	con.setRequestMethod("HEAD");
	con.connect();
int newcode1 = 	con.getResponseCode();
System.out.println(newcode1);
a.assertTrue(newcode1<400, "The webpage is failed in the link "+link.getText()+ " with code " +newcode1);  // The code will store the all failed method and executes for all the linkj

// Instead of using if condition we can use assert hence
/*if(newcode1>400) {
	System.out.println("The webpage is failed in the link "+link.getText()+ " with code " +newcode1);
	Assert.assertTrue(false);   //Here if our code is greater than 400 then test will fail  here our coe will stop eecuting
	//hence by using soft assert 
} */
}
a.assertAll();  //used to print the all failed message


	}

}
