package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import Master.VariableDeclaration;

public class FunctionLoginTestCase{

	@Test
	public static void LogintestCaseMethod() throws InterruptedException {
		DataProcessModule.TextBox(VariableDeclaration.LoginUserNameFieldXPath,
								  VariableDeclaration.LoginUserNameFieldValue);
		
		System.out.println("Login textbox field completed log");
		
		DataProcessModule.TextBox(VariableDeclaration.LoginPasswordFieldXPath,
								  VariableDeclaration.LoginPasswordFieldValue);
		
		System.out.println("Login Password field compelted log");
		
		
		//System.out.println("Before login URL is " + VariableDeclaration.driver.getCurrentUrl());
		
		DataProcessModule.ClickEvent(VariableDeclaration.LoginClickXPath);
		System.out.println("Login button clicked log");
		
		//System.out.println("Logout text value is " + VariableDeclaration.driver.findElement(By.xpath(VariableDeclaration.navigationLogoutXPath)).getAttribute("innerHTML"));
		
		//System.out.println("After login URL is " + VariableDeclaration.driver.getCurrentUrl());
		
	}
	
}

