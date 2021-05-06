package TablesAndGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		
		int rowcount=table.findElements(By.xpath("//table[@id='product']//tbody/tr")).size();
		System.out.println("count"  + rowcount);
	
		int columncount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		
		System.out.println("columncount" +columncount );
		
		String value=driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(2).getText();//to print the value of 2

		System.out.println(value);


		
		
	}

}
;;