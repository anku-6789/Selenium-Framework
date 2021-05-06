package CheckbosAssetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUIEnabledOrDisabled {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver =  new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 
		 System.out.println(driver.findElement(By.id("div1")).getAttribute("style"));
		 
		 //if driver.findElement(By.id("div")).getAttribute("style").contains(s)
		
		


	}

}
