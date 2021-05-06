package Salesforce.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class csslocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("Mayu");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("@Seffr");
		driver.findElement(By.cssSelector("[name='Login']")).click();
		
		driver.close();
		
	}
}
