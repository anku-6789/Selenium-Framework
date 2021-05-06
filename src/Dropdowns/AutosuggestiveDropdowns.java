package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		//java script DOM CAN EXTRACT HIDDEN ELEMENTS
		//because selenium cannot identify hidden elements-ajax auomation
		//investigate the properties of object if it have any hidden text
		
		//javscriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;

		String script=" return document.getElementById(\"fromPlaceName\").value";
		
		String text=(String)js.executeScript(script);
		System.out.println(text);
		
		//BENGALURU AIRPORT
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU AIPORT"))//it will kepp  on executiong until it findstill
			//that it will returen false
		{
			
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			text=(String)js.executeScript(script);
			System.out.println(text);
			
			if (i>2)
			{
				break;
			}
			
			
		}

		if (i>2)
		{
			System.out.println("fnot ound");
		}
		else
		{
			System.out.println(" found");
		}
			
			
		driver.close();
		
		
		
		
		
		
	}

}
