package Resources;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public   WebDriver driver;
	public   Properties prop;
	
	public WebDriver Initalizedriver() throws IOException
	{
		
		 prop =new Properties();
		//FileInputStream Fis = new FileInputStream("//Users//amandhare//eclipse-workspace//FrameworkE2EFlow//src/main//java//Resources//data.properties");
		

		FileInputStream Fis = new FileInputStream(System.getProperty("user.dir")+"//src/main//java//Resources//data.properties");
		
		
		prop.load(Fis);
		
		
		
		String browsername=System.getProperty("browser");
		
		//string browsername= System.get
		
		String browerName=prop.getProperty("browser");
		
		System.out.println(browerName);
		
		if(browerName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
			 driver = new ChromeDriver(); 
			driver.get("http://google.com");
			System.out.println(driver.getTitle());
		}
		
		else if(browerName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "//Users//amandhare//Downloads//geckodriver");
			 driver = new FirefoxDriver(); 
			
			
		}
       driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		return driver;
		}
		
		/*public void  getScreenshotpath(String testcseName ,Webdriver driver) 
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testcseName+".png";
			FileUtils.copyFile(source,new File( destinationFile));
		}
		
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"//Reports//"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
			*/
		
}
		
	


