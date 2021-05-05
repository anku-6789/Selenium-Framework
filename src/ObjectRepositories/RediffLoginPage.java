package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	
	static WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static WebElement main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
		
		
		
		
		By userName =By.xpath("input@[id='login1']");
		
		By Password=By.name("passwd");
		
		By login=By.name("proceed");
		
	
	
		
	
	public WebElement   Email() {
		// TODO Auto-generated method stub
		return (WebElement) userName;
	}
	
	
	public WebElement  Password {
		// TODO Auto-generated method stub
		return Password;
	}
	public WebElement  login() {
		// TODO Auto-generated method stub
		return login;
	}
	}

}
