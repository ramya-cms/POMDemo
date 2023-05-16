package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class PlaceOrderTest extends TestBase {
	HomePage homePage;
	SearchResultPage resPage;
	ShoppingCartTest chkPage;
	ShoppingCartTest empCart;
	CheckOutPage chkForm;
  @BeforeTest
  public void setup() {
	initialize();  
  }
  @Test
  public void addItemTest() {
	//searchItem
	//addItemtocart
	  
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
	  
	  resPage = new SearchResultPage();
	  resPage.viewItemDetails();
	  resPage.addToCart();
  }  

	  @Test
	  public void checkOutTest() throws InterruptedException
	  {
		  chkPage = new ShoppingCartTest();
		  chkPage.chkOut();
		 // empCart = new ShoppingCartTest();
		  //empCart.emtCart();
	  }
  
	  @Test
	  public void formchkPage()
	  {
		  chkForm = new CheckOutPage();
		  chkForm.name("Ram");
		  chkForm.sname("S");
		  chkForm.addr("Bengaluru");
		  chkForm.zipcode("560070");
		  chkForm.city("Bengaluru");
		  chkForm.cmp("CMS");
		  chkForm.asap();
		  chkForm.buy();
	  }
  @AfterTest
  public void tearDown() {
	  closeBrowser();
  }
  
}
