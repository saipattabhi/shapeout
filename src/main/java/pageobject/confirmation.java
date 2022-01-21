package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmation {
	
WebDriver driver;	
	public  confirmation(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1uR9yB _3dESVI']")
	
	public WebElement review;
	
	public WebElement review()
	{
		
		return review;
		
	}
	
	
	

}
