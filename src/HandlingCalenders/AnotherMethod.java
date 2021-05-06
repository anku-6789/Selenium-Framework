package HandlingCalenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnotherMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.path2usa.com/travel-companions");
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(5500);
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@src=\"https://www.path2usa.com/responsive_filemanager/source/CA-Gold-Travel-Insurance_1680x655.jpg\"]")));


		

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id='travel_date']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

		while(!month.getText().contains("Auguest"))

		{

		     driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		     System.out.println(month.getText());

		}

		int count= driver.findElements(By.cssSelector("td[class*='day']")).size();

		for(int i=0;i<count;i++)

		{

		     String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();

		     if(text.equalsIgnoreCase("26"))

		     {

		   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();

		    System.out.println(text);

		    break;

		     }

		}

		}
		
		

	}


