package Master;

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

}
