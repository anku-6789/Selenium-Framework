package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Find {

	public WebDriver driver;

public Find(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 this.driver=driver;
}

By  Findreservation = By.xpath("//p[contains(text(),'Find & Reserve')]");

 
 By destination = By.xpath("//input[@placeholder=\"Where do you want to go?\"]");
 
// By members = By.xpath("//header/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/a[1]");
	
By  Findhotels= By.xpath("//button[contains(text(),'Find Hotels')]");


By backbutton=By.cssSelector("body.t-bg-extralightgrey.is-form-takeover div.page-container:nth-child(2) header.m-header div.l-header-outer-wrapper.l-print-hide div.m-header-container.t-bg-standard-20.t-border-header.mi-header.l-pos-relative div.l-header-inner-wrapper.l-m-container-fullbleed div.l-lower-header div.l-overlay-parent.l-l-display-block.overlay-opened.t-overlay div.l-overlay-container.l-container ul.l-header-navigation.l-margin-top-one-and-half.l-l-margin-top-three-quarters li.l-nav-item.l-l-display-inline-block.l-l-margin-left-five-quarters.l-padding-none.js-flydown-trigger.is-active:nth-child(1) div.l-panel.l-width-max.t-bg-standard-20.l-pos-absolute.l-pos-left.is-hidden.sticky-y-scroll.l-pos-top:nth-child(3) div.l-container a.l-pos-absolute.t-icon.t-icon-header-close.t-font-m.t-cursor-pointer.l-float-right.l-margin-right-half.is-visible-l > span.is-hidden-text");

By morethan1= By.xpath("//a[contains(text(),'Find a Hotel for Groups (10+ rooms)')]");

By about= By.xpath("//p[contains(text(),'About Marriott Bonvoy')]");


By  destinationsearch=  By.xpath("//a[contains(text(),'Browse by Destination')]");


public   WebElement getFindreservation()
	{
		return driver.findElement(Findreservation);
	}


public   WebElement getdestination()
{
	return driver.findElement(destination);
}

public   WebElement getbackbutton()
{
	return driver.findElement(backbutton);
}

public   WebElement getFindhotels()
{
	return driver.findElement(Findhotels);
}
public   WebElement getmorethan1()
{
	return driver.findElement(morethan1);
}
public   WebElement getabout()
{
	return driver.findElement(about);
}

public   WebElement getdestinationsearch()
{
	return driver.findElement(destinationsearch);
}

}



