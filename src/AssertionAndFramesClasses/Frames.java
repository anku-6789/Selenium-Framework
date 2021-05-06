package AssertionAndFramesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		
		d.get("https://jqueryui.com/droppable/");
		//switch to frame big container
		//d.swithchTo().frame(1);
		
		//finding the no of frames in webpage
		System.out.println(d.findElements(By.tagName("iframe")).size());
		//no of frame by fefault 1st
		d.switchTo().frame(0);
		
		//d.switchTo().frame(d.findElement(By.cssSelector("iframe.demo-frame")));
		
		//click on that drag box
		//d.findElement(By.id("draggable")).click();
		
		
		Actions a =new Actions(d);
		WebElement source=d.findElement((By.id("draggable")));
		
		WebElement target=d.findElement((By.id("droppable")));
		
		a.dragAndDrop(source, target).build().perform();
		
		d.switchTo().defaultContent();
		d.close();
		
	}

}
