import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepositories.RedfiiHOmePAge;
import ObjectRepositories.RediffLoginPage;

public class Loginapplocation {

	
	
	
	
	
	@Test
	public  void Login() {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage  rd= new  RediffLoginPage(driver);
		
		rd.Email().sendKeys("Hello");
		rd.Password().sendKeys("Hello");
		rd.login().click();
		
		
		RedfiiHOmePAge rh=  new RedfiiHOmePAge(driver);
		rh.searchbox().sendKeys("Home");
		
		rh.searchbutton().sendKeys("Home");
	}

}
