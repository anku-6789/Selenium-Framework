package Dropdowns;//want to select 2 adults

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaicDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","//Users//amandhare//Downloads//chromedriver");

		WebDriver  driver= new ChromeDriver(); 
		
		driver.get("https://www.spicejet.com/");
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adultctl00_mainContent_ddl_Adult")));
		//s.selectByValue("AFD");
//		
		//s.selectByIndex(3);
		s.selectByVisibleText("AED");
		
		
		driver.close();
	}

}
