package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Join {
	

	public WebDriver driver;
	By join= By.xpath("//a[contains(text(),'Join Now')]");
	
	By firstname =By.xpath("//input[@id='field-first-name']");
	
	By lastname=By.xpath("//input[@id='field-last-name']");
	
	By country=By.xpath("//body/div[@id='page-container']/div[@id='main-body-wrapper']/div[2]/section[2]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]");
	
	
	public Join(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		 this.driver=driver;
	}

	public   WebElement getjoin()
	{
		return driver.findElement(join);
	}
	
	public   WebElement getfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public   WebElement getlastname()
	{
		return driver.findElement(lastname);
	}
	
	
	public   WebElement getcountry()
	{
		return driver.findElement(country);
	}
		

}
