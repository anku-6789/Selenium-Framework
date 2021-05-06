package MislaniousTopics;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Desire Capabilities
		//general chrome profile
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		//it will add inscecure files
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belos to uour lcal browesr
		Capabilities c = new ChromeOptions();
	     c.merge(ch);
	     
	     
			System.setProperty("webdriver.chrome.driver", "//Users//amandhare//Downloads//chromedriver");
	     WebDriver  d = new ChromeDriver();
	     d.get(" ");
		

}
}