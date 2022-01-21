package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {
	
	WebDriver driver;
	public welcomepage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[@class='_2IX_2- VJZDxU']")
	
	public WebElement emailfield;
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[@class='_2IX_2- _3mctLh VJZDxU']")
	
	public WebElement passwordfield;
	
	
	@FindBy(xpath = "//div[@class='_1D1L_j']//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	
	public WebElement submitbutton;
	
	
	public WebElement emailfield()
	{
		
		return emailfield;
	}
	
	
	public WebElement passwordfield()
	{
		return passwordfield;
	}
	public WebElement submitbutton()
	{
		
		return submitbutton;
	}

}
