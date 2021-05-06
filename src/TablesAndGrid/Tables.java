package TablesAndGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		int sum=0;
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20202/rsa-vs-pak-2nd-odi-pakistan-tour-of-south-africa-2018-19");

		
		WebElement table = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));

		//parent to child
		int count = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();

		//int count = table.findElements(By.cssSelector("div[id='innings_1'] [class='cb-col cb-col-100 cb-scrd-itms']")).size();     

		for (int i=0;i<count-2;i++)
		{
	//System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());pri
	      String value = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).getText();//stroing the value 19 in value variable
		int valueinteger= Integer.parseInt(value);//converting string into integer
	      sum=sum+valueinteger;//
	      
		}
		
		System.out.println(sum);
		
		//sibling to sibling
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		
       driver.close();

		
	}	
	}


