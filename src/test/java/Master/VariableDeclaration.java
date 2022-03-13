package Master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VariableDeclaration {

	public static WebDriver driver;

	public static String browserName = "Chrome";
	public static String testURL = "https://www.saucedemo.com/";
	public static long timeMS = 2000;

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
	
}
