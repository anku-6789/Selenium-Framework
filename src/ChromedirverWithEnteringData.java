import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromedirverWithEnteringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.className("username")).sendKeys("Sarita");
		driver.findElement(By.name("pw")).sendKeys("Mau@12");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		
		
		driver.close();
	}
	

}
