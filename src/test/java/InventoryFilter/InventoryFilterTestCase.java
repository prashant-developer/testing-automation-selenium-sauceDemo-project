package InventoryFilter;

import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import Login.FunctionLoginTestCase;
import Master.VariableDeclaration;

public class InventoryFilterTestCase {

	@Test
	public static void inventoryTestCaseMethod() throws InterruptedException {

		int i = 0;

		while (i < VariableDeclaration.inventoryItemsArray.length) {

			if (VariableDeclaration.driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {

				System.out.println("Value of I is " + i + "in inventory filter test case");
				DataProcessModule.ClickEvent(VariableDeclaration.inventoryFilterClickXPath);
				Thread.sleep(500);
				DataProcessModule.ClickEvent(VariableDeclaration.inventoryItemsArray[i]);
				Thread.sleep(1200);
				//DataProcessModule.ClickEvent(VariableDeclaration.inventoryFilterClickXPath);
				i++;

			} else {
				FunctionLoginTestCase.LogintestCaseMethod();
			}
		}
	}

}
