package Login;

import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import Master.VariableDeclaration;

public class FunctionLoginTestCase{

	@Test(priority = 1)
	static void LogintestCaseMethod() throws InterruptedException {
		DataProcessModule.TextBox(VariableDeclaration.LoginUserNameFieldXPath,
								  VariableDeclaration.LoginUserNameFieldValue);
		
		System.out.println("Login textbox field completed log");
		
		DataProcessModule.TextBox(VariableDeclaration.LoginPasswordFieldXPath,
								  VariableDeclaration.LoginPasswordFieldValue);
		
		System.out.println("Login Password field complted log");
		
		DataProcessModule.ClickEvent(VariableDeclaration.LoginClickXPath);
		System.out.println("Login button clicked log");
		
	}
	
}

