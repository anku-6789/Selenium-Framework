import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=eu");
		
		//driver.findElement(By.className("username")).sendKeys("Mayu");
		//driver.findElement(By.name("pw")).sendKeys("Mayu@12");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Sarita"); 
		
		driver.close();
	}
	

}
