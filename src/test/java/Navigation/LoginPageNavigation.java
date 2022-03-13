package Navigation;

import java.util.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import Login.FunctionLoginTestCase;
import Master.Base;
import Master.VariableDeclaration;

public class LoginPageNavigation extends FunctionLoginTestCase {

	@Test
	public static void NavigationTestCaseModule() throws InterruptedException {
		System.out.println("The length of value " + VariableDeclaration.navigationItemsArray.length);
		
		int i = 0;

		while ( i  < VariableDeclaration.navigationItemsArray.length) {
			System.out.print("The value of I is " + i);
			 if (VariableDeclaration.driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
				// Module ahead

				DataProcessModule.ClickEvent(VariableDeclaration.navigationThreeDotXPath);

				if (VariableDeclaration.driver.findElement(By.xpath(VariableDeclaration.navigationItemsArray[i]))
						.getAttribute("innerHTML").equals("About")) {
					DataProcessModule.ClickEvent(VariableDeclaration.navigationItemsArray[i]);
					VariableDeclaration.driver.navigate().back();
					i++;
					System.out.println("About click task finish");
				} else if (VariableDeclaration.driver.findElement(By.xpath(VariableDeclaration.navigationItemsArray[i]))
						.getAttribute("innerHTML").equals("Logout")) {
					DataProcessModule.ClickEvent(VariableDeclaration.navigationItemsArray[i]);
					i++;
					FunctionLoginTestCase.LogintestCaseMethod();
					System.out.println("Logout task finish");
				} else {
					DataProcessModule.ClickEvent(VariableDeclaration.navigationItemsArray[i]);
					DataProcessModule.ClickEvent(VariableDeclaration.navigationBarCloseSignXpath);
					System.out.println("Other task finish");
					i++;
				}

			} else if (VariableDeclaration.driver.getCurrentUrl().equals("https://www.saucedemo.com/")
					|| VariableDeclaration.driver.getCurrentUrl().equals("https://www.saucedemo.com")) {
				// Login again
				FunctionLoginTestCase.LogintestCaseMethod();
			} else {
				// Go to inventory if session expired login again
				VariableDeclaration.driver.get((String) VariableDeclaration.testURL);
			}
		}
		System.out.println("Loop out");
	}
}
