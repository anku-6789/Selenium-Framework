package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Laungage {
	public WebDriver driver;
	
	By laung= By.xpath("//span[contains(text(),'English')]");
	
	By german = By.xpath("//a[contains(text(),'Deutsch')]");
	
	By close = By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]");
	




	public Laungage(WebDriver driver) {
		// 
		this.driver=driver;//TODO Auto-generated constructor stub
	}



	public   WebElement getlaung()
	{
		return driver.findElement(laung);
	}
	
	
	
	public   WebElement getgerman()
	{
		return driver.findElement(german);
	}
	
	
	public   WebElement getclose()
	{
		return driver.findElement(close);
	}
	
	
	
	
	

}
