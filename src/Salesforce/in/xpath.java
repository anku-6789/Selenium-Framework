package Salesforce.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		
		driver.manage().window().maximize();


	}

}
