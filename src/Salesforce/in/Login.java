package Salesforce.in;//By x path and with regular  expression


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		
		driver.manage().window().maximize();
		//BY xpath:
		
	/*	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Mayu");
		
		
		
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("Mayu@123");
		
	      driver.findElement(By.cssSelector("*[id='Login']")).click();
		
		driver.findElement(By.cssSelector("input#Login")).click();*/
		
		//BY regular expression
		
		driver.findElement(By.xpath("//input[contains(@class,'input r4 wide mb16 mt8 ')]")).sendKeys("Mayur");
		
		//driver.findElement(By.cssSelector("input[id*=username]")).sendKeys("sad12323");
		
		
	}

}
