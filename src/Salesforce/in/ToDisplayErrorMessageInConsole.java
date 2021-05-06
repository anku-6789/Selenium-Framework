package Salesforce.in;//To print error message in console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisplayErrorMessageInConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.name("username")).sendKeys("Neha Shitole");
		driver.findElement(By.name("pw")).sendKeys("Nwha@3445");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		

	}

}
