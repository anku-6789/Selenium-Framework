package TablesAndGrid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DescendingOrderStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();

		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.findElement(By.xpath("//tr/th[2]")).click();
		//d.findElement(By.xpath("//tr/th[2]")).click();

		List<WebElement> fistcolumn = d.findElements(By.xpath("//tr/td[2]"));
		// creating a arry list for 2nd column
		ArrayList<String> orignallist = new ArrayList<String>();

		for (int i = 0; i < fistcolumn.size(); i++) {
			// System.out.println((fistcolumn.get(i).getText()));
			orignallist.add((fistcolumn.get(i).getText()));
		}
		// copay above arraylist insto another

		ArrayList<String> coppiedlist = new ArrayList<String>();

		for (int j = 0; j < fistcolumn.size(); j++) {

			coppiedlist.add(orignallist.get(j));
		}
		System.out.println("#############");

		Collections.sort(coppiedlist);
		Collections.reverse(coppiedlist);
		
		for (String sd : coppiedlist)// another for (int i=o;i<copiedlist.size();i++)
		{
			System.out.println(sd);

		}
		System.out.println("**********");

		for (String s : orignallist)// another for (int i=o;i<copiedlist.size();i++)
		{
			System.out.println(s);

		}

		Assert.assertTrue(orignallist.equals(coppiedlist));

		d.close();

	}

}
