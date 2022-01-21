package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pavilion {
	
	
	WebDriver driver;
	
	public pavilion(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//a[text()='HP Pavilion Gaming Ryzen 7 Octa Core 4800H - (16 GB/1 TB HDD/256 ...']")
	
	public WebElement hpproduct;
	
	public WebElement hpproduct()
	{
		return hpproduct;
	}
	
	
	
	
	
	

}
