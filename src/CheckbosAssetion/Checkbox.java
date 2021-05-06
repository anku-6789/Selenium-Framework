package CheckbosAssetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.spicejet.com/");
		 driver.getTitle();
		 
		 Assert.assertFalse( driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected());//Assertion
				 
		 		
		 System.out.println(( driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected()));// to print whether checkbox is select or not
		 
		 driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).click();
		 
		System.out.println(( driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected()));
		
	Assert.assertTrue( driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected());//Assertion
		
		System.out.println((driver.findElements(By.cssSelector("input[type='checkbox']")).size()));// to print the how many chceckbox
		
		
		
	}

}
