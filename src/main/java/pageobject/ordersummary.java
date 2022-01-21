package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ordersummary {
	
WebDriver driver;


public ordersummary(WebDriver driver)
{
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	
}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	
	public WebElement continuebutton;
	
	
	
	public WebElement continuebutton()
	{
		return continuebutton;
	}
	

}
