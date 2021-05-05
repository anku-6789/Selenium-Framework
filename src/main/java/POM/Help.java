package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Help {
	
	public WebDriver driver;

	
	  public Help(WebDriver driver) {
		  
		  this.driver=driver;
		  
		// TODO Auto-generated constructor stub
	}
	  
	  By helppp = By.xpath("//span[contains(text(),'Help')]");

	//By Search =By.id("135:0-input");
	  
	  By  Loyality =By.xpath("//span[contains(text(),'Loyalty')]");
	  
	  By Resevations =By.xpath(" //span[contains(text(),'Reservations')]");
	  
	  By  CustomCare =By.xpath("//span[contains(text(),'Customer Care')]");
	  
	  By Helphome= By.linkText("Help Home");
	  
	  
	 
	  
	  By Travel = By.xpath("//span[contains(text(),'Travel Information & COVID-19?')]");
	  
		By LastNews  =By.xpath("//span[contains(text(),'What is the Latest News?')]")	;
		
		By Week = By.xpath("//span[contains(text(),'What is the Week of Wonders?')]");
		
		
		By Certificates =By.xpath("//span[contains(text(),'How do I Book Using My Points or Certificates?')]");
		
		
		By MissingStay  = By.xpath("//span[contains(text(),'How Do I Request Credit for a Missing Stay?')]");
	
		By  StatusMatch  =By.xpath("//span[contains(text(),'Competitor Elite Status Match')]");
		
		By EliteStatus =By.xpath("//span[contains(text(),'Competitor Elite Status Match')]");

		
		
		  public   WebElement gethelppp()
		{
			return driver.findElement(helppp);
		}
		
		public   WebElement getLoyality()
		{
			return driver.findElement(Loyality);
		}
		
		public   WebElement getResevations()
		{
			return driver.findElement(Resevations);
		}
		
		public   WebElement getHelphome()
		{
			return driver.findElement(Helphome);
		}
		
		
		
		
		
		public   WebElement getCustomCare()
		{
			return driver.findElement(CustomCare);
		}
		
		public   WebElement getTravel()
		{
			return driver.findElement(Travel);
		}
		public   WebElement getLastNews()
		{
			return driver.findElement(LastNews);
		}
		public   WebElement getWeek()
		{
			return driver.findElement(Week);
		}
		public   WebElement getCertificates()
		{
			return driver.findElement(Certificates);
		}
		public   WebElement getMissingStay()
		{
			return driver.findElement(MissingStay);
		}
		
		
		public   WebElement getStatusMatch()
		{
			return driver.findElement(StatusMatch);
		}
		
		
		public   WebElement getEliteStatus()
		{
			return driver.findElement(EliteStatus);
		}
		
	/*	public void action(String abc)
		{
			gethelppp().click();
			
			switch(abc) {
			
			case "Loyalty":
				getLoyality().click();
				getHelphome().click();
				
			case "Resevations":
				getResevations().click();
				getHelphome().click();;
				
			default:
				gethelppp().click();
					
			}
		}
		*/
		
		
}
