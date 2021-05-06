package CheckbosAssetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d=new ChromeDriver();
		
		
		d.get("https://www.cleartrip.com/");
		
		d.manage().window().maximize();
		Select s= new Select(d.findElement(By.id("Adults")));
		
		s.selectByIndex(4);
		
      Select f= new Select(d.findElement(By.id("Childrens")));
		
		f.selectByIndex(4);
		 
		
	Select n= new Select(d.findElement(By.id("Infants")));
		
		n.selectByIndex(4);
		
		d.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[6]/p[1]/a[1]/strong[1]/i[1]")).click();
		
		
		d.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		
	d.findElement(By.id("SearchBtn")).click();
    System.out.println(d.findElement(By.id("homeErrorMessage")).getText());
		
		d.close();
	}

}
