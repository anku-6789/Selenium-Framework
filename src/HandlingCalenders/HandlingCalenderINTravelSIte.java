package HandlingCalenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderINTravelSIte {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5500);
		//month and date  july 2
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
      
      //while loops keeps on continue untile conditios will turn to false
      while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("August"))
      
      {
    	  driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
    	  
      }
      
      
      
      
      List<WebElement> dates=driver.findElements(By.className("day"));//search for all elements of dates
      
      //Grab the common attribute and //put into list 
      
    int count =driver.findElements((By.className("day"))).size();
    
    for(int i=0;i<count;i++)
    {
    	String text =driver.findElements((By.className("day"))).get(i).getText();//search for that date and it will grab text
    	if(text.equalsIgnoreCase("23"))
    		
    	{
    		
    		
    		driver.findElements((By.className("day"))).get(i).click();
    		break;
    	}
    	
    }
    
		
	}

}
