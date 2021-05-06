package SCopeandEndToENdPrograming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		d.get(" https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//give me the count of links on the page
		 //a
		
		System.out.println(d.findElements(By.tagName("a")).size());
		
		//limiting scope of webdriver
		WebElement footerd=d.findElement(By.id("gf-BIG"));
		
		
		System.out.println(footerd.findElements(By.tagName("a")).size());
		
		
		//3.column specifc limiting scope of webdriver
		WebElement columndriver=footerd.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		
		
		
		//click on each link in column check if the page are opening or nt
		
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		
		{
			
			String clickOnLink=Keys.chord(Keys.COMMAND,Keys.ENTER);//to open a link in seprate tab
			
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);;//we are clicking keyboard event
			
			Thread.sleep(3000L);	
			
			
		}//opens the all tab
			Set<String> abc=d.getWindowHandles();//to  handles 4 windows
			
			Iterator<String> it =abc.iterator();//to iterate from 1 window  to 2nd
			
			while(it.hasNext())
			{
				d.switchTo().window(it.next());//Print window id
				System.out.println(d.getTitle());
			}
			
			
		
		
		d.close();
		
		
		
	}

}
