package GTapplication.GTTTTT;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.Deals;
import POM.Find;
import POM.Help;
import POM.Join;
import POM.Laungage;
import POM.MyTrips;
import POM.SignInpage;
import Resources.Base;


public class homepage extends Base {
	


	public  void setDriver() throws InterruptedException {
		// TODO Auto-generated method stub
				try {
					Initalizedriver();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.get(prop.getProperty("url"));
			/*	
				SignInpage  Si = new  SignInpage(driver);
			    Si.getJoin().click();
				Si.getEmail().sendKeys("sarika345@gmail.com");
				Si.getPassword().sendKeys("tesasda1333");
			    Si.getSubmit().click();
			   
			
			    MyTrips My = new   MyTrips(driver);
			    
			    My.getTripe().click();
			    My.getConfirmation().sendKeys("43223213");
			    My.getChekIn().click();
			    My.getFirstname().sendKeys("mayuri");
			    My.getLasttname().sendKeys("shaha");
			 //   My.Findreservation().click();
			   
			    My.getclose().click();;
				 
			    
			    
			    Help he= new Help(driver);
			   
			    
			    he.gethelppp().click();
			   
			    
			    //he.getSearch().click();
			    he.gethelppp().click();
			    he.getLoyality().click();
			    he.getHelphome().click();
			    
			    he.getResevations().click();
			    he.getHelphome().click();
			    
			    he.getCustomCare().click();
			    he.getHelphome().click();
				
			   
			    he.getTravel().click();
			    he.getHelphome().click();
			    
			    he.getLastNews().click();
			    he.getHelphome().click();
			    
			    he.getWeek().click();
			    he.getHelphome().click();
			    
			    he.getCertificates().click();
			    he.getHelphome().click();
			    
			    he.getMissingStay().click();
			    he.getHelphome().click();
			    
			    he.getEliteStatus().click();
			    he.getHelphome().click();
			    
			     Laungage le = new Laungage(driver);
			    
			    le.getlaung().click();
			    
			   // le.getgerman().click();
			  
			   // le.getlaung().click();
			    le.getclose().click();
			   
		
			   
		
			Find fd = new Find (driver);
			
			
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			fd.getFindreservation().click();
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//fd.getdestination().sendKeys("pune");
			
			//fd.getFindhotels().click();
		fd.getbackbutton().click();
		fd.getFindreservation().click();
			fd.getmorethan1().click();
			fd.getabout().click();
		
			
			*/ 	
		
				Join jn= new Join(driver);
	
				Thread.sleep(200);
				jn.getjoin().click();
				jn.getfirstname().sendKeys("asbds");
				jn.getlastname().sendKeys("badsss");
           jn.getcountry().sendKeys("Ind");
				
				
				
	}
	
	
	
	

}
