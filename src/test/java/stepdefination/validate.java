package stepdefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.confirmation;
import pageobject.image;
import pageobject.ordersummary;
import pageobject.pavilion;
import pageobject.products;
import pageobject.sold;
import pageobject.welcomepage;
import resources.base;

public class validate extends base {
	
	WebDriver driver;
	welcomepage welcome;
	pavilion pro;
	sold out;
	ordersummary sum;
	confirmation dialog;
	
	
@Given("^Open application using browser$")
public void Open_application_using_browser() throws Exception
{
	 driver=intializedriver();
	
	
}
	
@When("^User enter username as (.+) and password as (.+) into the fields$")	
public void User_enter_username_as_and_password_as_into_the_fields(String usernmae,String password)
{
	

	driver.get(prop.getProperty("url"));

	 welcome = new welcomepage(driver);

	welcome.emailfield().sendKeys(usernmae);
	welcome.passwordfield().sendKeys(password);
}
@And("^User clicks on the submitbutton$")
public void User_clicks_on_the_submitbutton()
{
	welcome.submitbutton().click();
}
@When("^User clickson the electronics option in the application$")
public void User_clickson_the_electronics_option_in_the_application() throws InterruptedException
{
	products item = new products(driver);

	Thread.sleep(3000);

	item.laptopicon().click();
}
@When("^User  clicks on the laptops icon$")	
public void User_clicks_on_the_laptops_icon() throws InterruptedException
{

	image im = new image(driver);

	Thread.sleep(3000);
	im.image().click();

	
}
@When("^User navigated to required position with products display$")
public void User_navigated_to_required_position_with_products_display()
{
    pro = new pavilion(driver);

	pro.hpproduct().click();

	Set<String> window = driver.getWindowHandles();

	Iterator<String> itr = window.iterator();

	String mainwd = itr.next();
	String childwd = itr.next();

	driver.switchTo().window(childwd);

	 out = new sold(driver);
	out.soldout().click();

	 sum = new ordersummary(driver);

	sum.continuebutton().click();
}
@Then("^User should see buyout option$")
public void User_should_see_buyout_option()
{

   dialog = new confirmation(driver);

	Assert.assertTrue(dialog.review().isDisplayed());
}
	

}
