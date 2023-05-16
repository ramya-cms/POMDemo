package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase
{
	@FindBy(xpath="//input[@id='s-name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='s-surname']")
	WebElement sname;
	
	@FindBy(xpath="//input[@id='s-address']")
	WebElement addr;
	
	@FindBy(xpath="//input[@id='s-zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id='s-city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='s-company']")
	WebElement cmp;
	
	@FindBy(xpath="//input[@id='asap']")
	WebElement asap;
	
	@FindBy(xpath="//button[normalize-space()='Buy']")
	WebElement buy;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
		}
	
	public void name(String nm)
	{
		name.sendKeys(nm);
		
	}
	
	public void sname(String snme)
	{
		sname.sendKeys(snme);
	}
	
	public void addr(String adr)
	{
		addr.sendKeys(adr);
	}
		
		
	public void zipcode(String zpcode)
	{
		zipcode.sendKeys("zpcode");
	}
	
	public void city(String cit)
	{
		city.sendKeys(cit);
	}
	
	public void cmp(String comp)
	{
	cmp.sendKeys(comp);
	}
		
	public void asap()
	{
	asap.click();
	}
	
	public void buy()
	{
		buy.click();
	}
}
	
	

