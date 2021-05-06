package CheckbosAssetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		WebElement Origin= driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));

	    Origin.click();	 

	    java.util.List<WebElement> origin = driver.findElements(By.xpath("(//a[@value='DEL'])[1]"));

	    System.out.println(origin.size());

	        driver.findElement(By.cssSelector("a[value='DEL']")).click();

	        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));//printing the value  on console

	        // Destination

	        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

	        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();   //if we do not want indexing mechanism   use parent   child realtionship
	                                                 
	                                               

	        System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
		 
	        
	        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	        
	        driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
	        
	        
	        WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		    Select adultsdrp = new Select(Adults);

		    adultsdrp.selectByValue("4");
		    
		    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	        
	        
	        
	}

}
