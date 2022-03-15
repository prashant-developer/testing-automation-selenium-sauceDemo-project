package Master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VariableDeclaration {

	public static final String wait = null;

	public static WebDriver driver;

	public static String browserName = "Chrome";
	public static String testURL = "https://www.saucedemo.com/";
	public static long timeMS = 3000;

	public static int polling_time = 100;

	public static int out_time = 2000;

	public static String LoginUserNameFieldXPath = "//*[@id='user-name']";
	public static String LoginUserNameFieldValue = "standard_user";

	public static String LoginPasswordFieldXPath = "//*[@id='password']";
	public static String LoginPasswordFieldValue = "secret_sauce";

	public static String LoginClickXPath = "//*[@id='login-button']";

	public static String navigationAllItemsXPath = "//*[@id='inventory_sidebar_link']"; 
	public static String navigationAboutXPath =	"//*[@id='about_sidebar_link']";
	public static String navigationLogoutXPath = "//*[@id='logout_sidebar_link']";
	public static String navigationResetXPath = "//*[@id='reset_sidebar_link']"; 
	public static String navigationThreeDotXPath = "//*[@id='react-burger-menu-btn']";
	public static String navigationBarCloseSignXpath = "//*[@id='react-burger-cross-btn']";
	
	public static String[] navigationItemsArray = {
			"//*[@id='inventory_sidebar_link']",
			"//*[@id='about_sidebar_link']",
			"//*[@id='logout_sidebar_link']",
			"//*[@id='reset_sidebar_link']",		
	};
	
	public static String[] inventoryItemsArray = {
			"//select/option[@value='hilo']",
			"//select/option[@value='lohi']",
			"//select/option[@value='za']",
			"//select/option[@value='az']",		
	};
	
	public static String inventoryFilterClickXPath = "//*[@class='product_sort_container']";
	
	public static String pageSliderXPath = "//*[@id='item_3_title_link']"; 
	
	public static String[] productItemsXpathArray = {
			"//*[@id='add-to-cart-sauce-labs-backpack']",
			"//*[@id='add-to-cart-sauce-labs-bike-light']",
			"//*[@id='remove-sauce-labs-bike-light']",
			"//*[@id='remove-sauce-labs-fleece-jacket']",
			"//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']",
			"//*[@id='remove-sauce-labs-bolt-t-shirt']",
			"//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']",
			"//*[@id='remove-sauce-labs-backpack']",
	};
	
	public static String cartIconXPath = "//*[@id='shopping_cart_container']";
	
	public static String continueShoppingClickXPath = "//*[@id='continue-shopping']";
	
	public static String checkOutClickXPath = "//*[@id='checkout']";
	
	public static String checkOutFirstNameXpath = "//*[@id='first-name']";
	
	public static String checkOutFirstName = "Prashant";
	
	public static String checkOutLastNameXPath = "//*[@id='last-name']";
	
	public static String checkOutLastName = "Gadhiya";
	
	public static String checkOutPostalCodeXpath = "//*[@id='postal-code']";
	
	public static String checkOutPostalCode = "395004";
	
	public static String checkOutContinueXPath = "//*[@id='continue']";
	
	public static String backHomeButtonXPath =  "//*[@id='back-to-products']";
	
	public static String finishClickXPath = "//*[@id='finish']";
	
	public static String linkedInXPath = "//*[@href='https://www.linkedin.com/company/sauce-labs/']";
}
