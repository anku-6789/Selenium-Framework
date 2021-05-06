package AssertionAndFramesClasses;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinfow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/windows ");
		
		d.findElement(By.linkText("Click Here")).click();
		System.out.println(d.getTitle());
		
		Set<String> Ids=d.getWindowHandles();
		
		Iterator <String> itt= Ids.iterator();
		
		String parentid =itt.next();
		

		d.switchTo().window(itt.next());
		
		System.out.println(d.findElement(By.xpath("//div/h3")).getText());
		
		d.switchTo().window(parentid);



		System.out.println(d.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		d.close();
	}

}
