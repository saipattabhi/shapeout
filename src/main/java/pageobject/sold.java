package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sold {

	
	WebDriver driver;
	
	public sold(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath ="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']" )
	
	
	public WebElement soldout;
	
	public WebElement soldout()
	{
		
		return soldout;
	}
	
	
	
	
	
}
