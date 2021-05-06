package AddingItmsInCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemwithMethodsAndsync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		int j = 0;

		String[] Items = { "Cauliflower", "Beetroot", "Brocolli" };

		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		
		addItems(d,Items );
		d.findElement(By.xpath("html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/a[4]/img[1]")).click();
		d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//d.findElement(By.cssSelector("html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("rahulshettyacademy");
		d.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

}


public static void addItems(WebDriver d,String[]Items)
          

{
	int j = 0;
	List<WebElement> products = d.findElements(By.xpath("//h4[@class='product-name']"));

	for (int i = 0; i < products.size(); i++)

	{

		String[] name = products.get(i).getText().split("-");

		String formattedName = name[0].trim();
		// format it to get actual vegetable

		// check wheather items you extracted in present in array or not
		// convert array into array list for easy search

		List amList = Arrays.asList(Items);

		if (amList.contains(formattedName))

		{

			j++;
			// click on add to cart
			d.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			// 3 times

			if (j == Items.length) {
				break;
			}

		}
		//d.close();

	}

}
	}
