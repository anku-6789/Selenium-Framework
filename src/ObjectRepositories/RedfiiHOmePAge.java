package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedfiiHOmePAge {

	

	
		

		private static Object driver;

		public RedfiiHOmePAge(WebDriver driver2) {
		// TODO Auto-generated constructor stub
			
			
			this.driver=driver;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		
		By  searchbox=By.id("srchquery_tbox");

		By  SearchBUtton= By.className("newsrchbtn");
	                 
		
		
	public WebElement searchbox() {
			// TODO Auto-generated method stub
		
		return findElement(searchbox);
			
		}
	
	
	
	}

		public Object searchbutton() {
			// TODO Auto-generated method stub
			
			
			
			return findElement(SearchBUtton);
			
			
		}

}
