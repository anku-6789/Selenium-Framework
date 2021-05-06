package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugeestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		d.get(" https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
	d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
	d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	
	System.out.println(d.findElement(By.xpath("//input[@id='autocomplete']")).getText());
	
	
	JavascriptExecutor js=(JavascriptExecutor)d;

	String script=" return document.getElementById(\"autocomplete\").value";
	
	String text=(String)js.executeScript(script);
	System.out.println(text);
	
	while(!text.equalsIgnoreCase("Indonesia"))
	{
		
		d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);

		 text=(String)js.executeScript(script);
		System.out.println(text);
	}
		
		
	}

}
