package Dropdowns;//from one country to another through from using web element


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyncamicropdownsAndParentChildRealtionship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    System.out.println(driver.getTitle());

	    // OriginStation

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
		 
		//driver.manage().window().maximize();
		
		
		/*driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.getTitle();
		
		driver.findElement(By.xpath("//a[@value='COK']")).click();
		
		
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		//driver.close();*/
	}

}
