package Academy.FrameworkE2EFlow;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.Landingpage;
import pageObjects.Login;

public class VAlidateTitleHomepage extends Base {
	public WebDriver driver;
	public static Logger Log= LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void Initalize() throws IOException
	{
		driver=Initalizedriver() ;
		Log.info("Driver is intialized");
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test()
	public  void basepageNavigation() throws IOException
	{
		driver.get(prop.getProperty("url"));
		Log.info("Driver is Navigated correctly");
		
		//acesss the methods in 2 way one using inheritance and second
		//creating obejct of that class and invoke the methods
		
		Landingpage l= new Landingpage(driver);
		//l.getlogin().click();;//similar to driver.findelements
	//compare the text from browser with actual  text error
      Assert.assertEquals(l.getitle().getText(),"Featured Courses");
      Log.info("Driver is navigated correctly");
	
	}

	
	@AfterTest
	public void teardown()
	{
		
		driver.quit();
	}
	
	
	
				
	}
	

