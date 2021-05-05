package Academy.FrameworkE2EFlow;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.ForgotPassword;
import pageObjects.Landingpage;
import pageObjects.Login;

public class Homepage extends Base {
	
	public WebDriver driver;
	@BeforeTest
	public void Initalize() throws IOException
	{
		driver=Initalizedriver() ;
		
	}
	
	@Test(dataProvider="getData")
	public  void basepageNavigation(String username,String password,String text ) throws IOException
	{
		
		
		//acesss the methods in 2 way one using inheritance and second
		//creating obejct of that class and invoke the methods
		driver.get(prop.getProperty("url"));
		Landingpage l= new Landingpage(driver);
		//l.getlogin()lick();;//similar to driver.findelements
		Login lp=l.getlogin();
		//Login  lp = new Login(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		//System.out.println(text);
		lp.getSubmit().click();
		
		
	//System.out.println(text);op

		ForgotPassword fp=lp.getforgotpwd();
		
		fp.getEmail().sendKeys("dsfd@gmail.com");
		 fp.getSendme().click();
		
	}

	
	@AfterTest
	public void teardown()
	{
		
		driver.quit();
		
		
		
	}
	
	
	@DataProvider
	private Object[][] getData() {
		// TODO Auto-generated method stub
		
		//row stands for how many different test should be run
		//column stand for home many values per each test 
		
		Object[][] data =new Object[2][3];
			//oth row	
		data[0][0]="esfsfs@gmail.com";
		data[0][1]="sdcsdHbj";
	   //data[0][1]="Restricted user";
		
		
		/*///1st row
		data[1][0]="Restricted user@bjhb.com";
		data[1][1]="sdciujhidHbj";
		data[1][1]="Non Restricted user";
		*/
		
		 return data;	
				
				
	}
	
	}
