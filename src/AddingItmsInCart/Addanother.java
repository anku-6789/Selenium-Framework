package AddingItmsInCart;

import java.awt.List;
import java.awt.Point;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addanother {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();

		String[] addItem = {"Potato", "Cauliflower", "Onion", "Tomato"};



		java.util.List<String> addItemList = Arrays.asList(addItem);

		java.util.List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		java.util.List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		String[] productArray;

		String product;

		int j = 0;



		for(int i = 0;i<products.size();i++) {

		productArray = products.get(i).getText().split("-");

		product = productArray[0].trim();

		if (addItemList.contains(product)) {

		j++;

		buttons.get(i).click();

		Thread.sleep(3000);

		if (j == (addItem.length)) {

		break;

		}

		}
		}
		}
	}


	


