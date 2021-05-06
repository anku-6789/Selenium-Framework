package CheckbosAssetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectingDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.spicejet.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();

		// OriginStation

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.cssSelector("a[value='DEL']")).click();

		// Destination

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		while (!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']"))
				.getText().contains("December"))

		{

			// driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

			driver.findElement(By.xpath(
					"//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']"))
					.click();

			System.out.println(
					driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']"))
							.getText());

		}

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

		int count = dates.size();

		for (int i = 0; i < count; i++)

		{

			String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i)
					.getText();

			if (txt.equalsIgnoreCase("28"))

			{

				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();

				System.out.println(txt);

				break;

			}
		}

	}

}
