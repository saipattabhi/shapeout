package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.confirmation;
import pageobject.image;
import pageobject.ordersummary;
import pageobject.pavilion;
import pageobject.products;
import pageobject.sold;
import pageobject.welcomepage;
import resources.base;

public class login extends base {

	WebDriver driver;

	@Test
	public void login() throws Exception {

		driver = intializedriver();

		driver.get(prop.getProperty("url"));

		welcomepage welcome = new welcomepage(driver);

		welcome.emailfield().sendKeys("saipattabhi18@gmail.com");
		welcome.passwordfield().sendKeys("Sai@2255");
		welcome.submitbutton().click();

		products item = new products(driver);

		Thread.sleep(3000);

		item.laptopicon().click();

		image im = new image(driver);

		Thread.sleep(3000);
		im.image().click();

		pavilion pro = new pavilion(driver);

		pro.hpproduct().click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String mainwd = itr.next();
		String childwd = itr.next();

		driver.switchTo().window(childwd);

		sold out = new sold(driver);
		out.soldout().click();

		ordersummary sum = new ordersummary(driver);

		sum.continuebutton().click();

		confirmation dialog = new confirmation(driver);

		Assert.assertTrue(dialog.review().isDisplayed());

	}

}
