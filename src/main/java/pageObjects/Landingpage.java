package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	
	
	
	
	
		
	private By signin=By.xpath("/html[1]/body[1]/app-root[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]");
	
	private By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	
    public By Navigation=By.xpath("//div[@class='nav-outer clearfix']//ul[@class='navigation clearfix']") ;
	
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}



	public   Login getlogin()
	{
		driver.findElement(signin).click();
		Login  lp = new Login(driver);
		
		return lp;
	}



	public   WebElement getitle()
	{
		return driver.findElement(title);
	}


	public   WebElement geNavigationbar()
	{
		return driver.findElement(Navigation);
	}
	
	
	
}
