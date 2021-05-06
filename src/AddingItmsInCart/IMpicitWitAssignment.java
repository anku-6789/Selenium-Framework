package AddingItmsInCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMpicitWitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
        d.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		d.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		WebDriverWait w= new WebDriverWait(d,5);
		w.until(ExpectedConditions.elementToBeClickable(By.id("results")));

	       System.out.println(d.findElement(By.id("results")).getText());
 d.close();
}
}
