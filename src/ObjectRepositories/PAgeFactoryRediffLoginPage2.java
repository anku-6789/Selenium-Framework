package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PAgeFactoryRediffLoginPage2 {

	
	static WebDriver driver;
	
	public PAgeFactoryRediffLoginPage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static WebElement main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//By userName =By.xpath("input@[id='login1']");
		
		//By Password=By.name("passwd");
		
		//By login=By.name("proceed");
		
	
	
		@FindBy(name="login");
	
     WebElement userName;
	
	

		@FindBy(name="passwd");
	
  WebElement Password;
	

	@FindBy(name="proceed");

WebElement login ;


	
	
	}

}
