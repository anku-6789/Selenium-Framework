import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWithEnteringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "//Users//amandhare//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.findElement(By.id("userName")).sendKeys("Neha");
		driver.close();
		
	}

}
