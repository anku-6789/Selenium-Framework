package AssertionAndFramesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		Actions a= new Actions(d);
		WebElement move=d.findElement(By.id("nav-link-accountList"));
		//composite actions like we are navigating to search box and entering hello in capital
		
		Thread.sleep(2000);
		a.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		//moves to sepcific element
		//a.moveToElement(d.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(move);
		//right click on element
		a.moveToElement(move).contextClick().build().perform();
		
		d.close();
	}

}
