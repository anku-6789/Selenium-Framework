package POM;

import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Deals {

	public WebDriver driver;
	
	
	
	


	public Deals(WebDriver driver) {
		
		
		 this.driver=driver;

		// TODO Auto-generated constructor stub
	}
 By special = By.xpath("//p[contains(text(),'Special Offers')]");

	By deals= By.xpath("//p[contains(text(),'Deals & Packages')]");
	
	
	
	By clickondeals = By.xpath("//header/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	
	
	
	
	
	public   WebElement getspecial()
	{
		return driver.findElement(special);
	}

	public   WebElement getdeals()
	{
		return driver.findElement(deals);
	}


	public   WebElement getclickondeals()
	{
		return driver.findElement(clickondeals);
	}

	

	
	
	
	
	
	
	

}
