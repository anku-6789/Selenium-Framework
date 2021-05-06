package AddingItmsInCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
		WebDriver d = new ChromeDriver();
		int j = 0;

		String[] Items = { "Cauliflower", "Beetroot", "Brocolli" };

		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");

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

		}

	}

}
