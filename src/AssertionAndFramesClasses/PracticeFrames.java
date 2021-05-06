package AssertionAndFramesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		
		d.get("https://the-internet.herokuapp.com/nested_frames");
		
		
	d.switchTo().frame("frame-top");
	d.switchTo().frame("frame-middle");
		
	System.out.println(d.findElement(By.id("content")).getText());


	}

}
