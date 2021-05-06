package CheckbosAssetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String text="Ankita";
		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d=new ChromeDriver();
		
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	d.findElement(By.id("name")).sendKeys(text);
	
	d.findElement(By.id("alertbtn")).click();
	
	System.out.println(d.switchTo().alert().getText());//to print
	d.switchTo().alert().accept();//accpt the alert
	
	d.findElement(By.id("confirmbtn")).click();
	System.out.println(d.switchTo().alert().getText());
	
	d.switchTo().alert().dismiss();
	
	
	}
	

}
