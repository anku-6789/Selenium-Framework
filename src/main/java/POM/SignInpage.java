package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  SignInpage{
	
	public WebDriver driver;
	
		
       By Join =By.xpath("//span[contains(text(),'Sign In or Join')]");
		
       By Email= By.id("user-id");
    		  
       By Password = By.id("password");
		
	 By Submit =By.xpath("//button[@name='submitButton']");
		
	 public SignInpage(WebDriver driver) {
			
			
			this.driver=driver;
			
		}

	 
		public   WebElement getJoin ()
		{
			return driver.findElement(Join);
		}

	 
	 
	 public   WebElement getEmail()
		{
			return driver.findElement(Email);
		}


		public   WebElement getPassword ()
		{
			return driver.findElement(Password);
		}

		

		public   WebElement getSubmit ()
		{
			return driver.findElement(Submit);
		}

	 
	 
		
	}


