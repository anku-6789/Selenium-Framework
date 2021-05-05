package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTrips {

	public WebDriver driver;

	public MyTrips(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
        By Tripe =By.xpath("//span[contains(text(),'My Trips')]");
			
	       By Confirmation = By.id("confirmationNumber");
	    		  
	       By ChekIn = By.id("cInDate");
			
		 By Firstname =By.xpath("//input[@id='firstName']");
		 
			
		 By Lasttname =By.xpath("//input[@id='lastName']");
		 
		// By Findreservation  =By.id("find-reservaton");
		
		 By close= By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]");
		 
		public   WebElement getTripe()
			{
				return driver.findElement(Tripe);
			}

		public   WebElement getConfirmation()
		{
			return driver.findElement(Confirmation);
		}

		public   WebElement getChekIn()
		{
			return driver.findElement(ChekIn);
		}
		public   WebElement getFirstname()
		{
			return driver.findElement(Firstname);
		}
		public   WebElement getLasttname()
		{
			return driver.findElement(Lasttname);
		}
	/*	public   WebElement Findreservation()
		{
			return driver.findElement(Findreservation);
		}

			*/
			
			
		public   WebElement getclose()
		{
			return driver.findElement(close);
		}
		
		
	}


