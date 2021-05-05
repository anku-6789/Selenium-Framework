package Academy.FrameworkE2EFlow;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.Landingpage;
import pageObjects.Login;

public class VAlidateNAvigationbar extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void Initalize() throws IOException
	{
		driver=Initalizedriver() ;
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test()
	public  void basepageNavigation() throws IOException
	{
		
		
		//acesss the methods in 2 way one using inheritance and second
		//creating obejct of that class and invoke the methods
		
		Landingpage l= new Landingpage(driver);
		
		driver.findElement(l.Navigation);
		//l.getlogin().click();;//similar to driver.findelements
	//compare the text from browser with actual  text error
      //Assert.assertEquals(l.getitle().getText(),"Featured Courses123");
	
	AssertJUnit.assertTrue(l.geNavigationbar().isDisplayed());
	

	
	}
		
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.quit();
	}
	
	}
	

