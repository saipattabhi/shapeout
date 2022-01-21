package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class image {
	
WebDriver driver;

public image(WebDriver driver)
{
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	
}
	
	@FindBy(xpath = "//img[@src='https://rukminim1.flixcart.com/flap/100/41/image/d6e85fb659d1438e.jpg?q=50']")
	
	public WebElement image;
	
	public WebElement image()
	{
		return image;
	}
	
	
	

}
