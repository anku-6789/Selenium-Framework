package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	
	
	
	
	
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.id("user_password");
	
	By Submit= By.className("btn btn-primary btn-md login-button");
	
	By forgotPassword= By.linkText("Forgot Password?");


	public Login(WebDriver driver) {
		
		
		this.driver=driver;
		
	}


	public   WebElement getEmail()
	{
		return driver.findElement(email);
	}


	public   WebElement getPassword()
	{
		return driver.findElement(password);
	}

	public   WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
	
	
	public   ForgotPassword getforgotpwd()
	{
		driver.findElement(forgotPassword).click();
		ForgotPassword fp= new ForgotPassword(driver);
		return fp;
	}
	
	
	
}
