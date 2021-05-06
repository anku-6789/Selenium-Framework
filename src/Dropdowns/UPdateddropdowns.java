package Dropdowns;//main dropdown under that dropdown

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UPdateddropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebDriverWait w = new WebDriverWait(driver,5);

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divpaxinfo']")));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		    Thread.sleep(4000);

		    // Selection of Adults

		    WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		    Select adultsdrp = new Select(Adults);

		    adultsdrp.selectByValue("4");

		    // Selection of Childs

		    WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

		    Select childsdrp = new Select(childs);

		    childsdrp.selectByValue("4");

		    driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		    System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

		    
		    driver.close();
    /*driver.findElement(By.id("divpaxinfo")).click();
	
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

	Select x = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));

	x.selectByIndex(4);
	
	
	
		/*Select q=new Select(driver.findElement(By.id("divpaxOptions")));
		
		Select s=new Select(driver.findElement(By.id("ctl00$mainContent$ddl_Adult")));
	      s.selectByValue("3");
		Select t=new Select(driver.findElement(By.id("ctl00$mainContent$ddl_Child")));
		t.selectByValue("0");
		Select u=new Select(driver.findElement(By.id("ctl00$mainContent$ddl_Infant")));
		u.selectByValue("0");*/
		
	}
	}


