package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartTest extends TestBase
{
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	WebElement checkout;

	
	@FindBy(xpath="//button[normalize-space()='Empty Cart']")
	WebElement emptycart;

	public ShoppingCartTest() {
	PageFactory.initElements(driver, this);
	}

	public void chkOut() throws InterruptedException
	{
	checkout.click();
	Thread.sleep(2000);
	//driver.navigate().back();
	}

	public void emtCart()
	{
		emptycart.click();
	}

}
