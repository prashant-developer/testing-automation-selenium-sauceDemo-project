package CartManagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import Login.FunctionLoginTestCase;
import Master.VariableDeclaration;

public class CartCheckOut {

	@Test
	public static void CartCheckOutMethod() throws InterruptedException {
		System.out.println("Inside cartCheckout method");	
		
		int i = 0; 

		for (i = 0; i < 40; i++) {
			System.out.println("Inside CartCheckout for loop");
			if (VariableDeclaration.driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
				DataProcessModule.BroswerMoveToAction(VariableDeclaration.pageSliderXPath);
				System.out.println("Inside CartCheckout for loop log 1");
				Random generator = new Random();
				int randomIndex = generator.nextInt(VariableDeclaration.productItemsXpathArray.length);

				if (VariableDeclaration.driver.findElements(By.xpath(VariableDeclaration.productItemsXpathArray[randomIndex])).size() > 0) {
					System.out.println("Inside CartCheckout for loop log 2");
					//System.out.println("Inside for loop is path value is " + VariableDeclaration.driver.findElements(By.xpath(VariableDeclaration.productItemsXpathArray[randomIndex])).size());
					System.out.println("Product Inventory Index is" + VariableDeclaration.productItemsXpathArray[randomIndex]);
					DataProcessModule.ClickEvent(VariableDeclaration.productItemsXpathArray[randomIndex]);
					System.out.println("Inside CartCheckout for loop log 3");
				} else {
					System.out.println("Xpath is not valid");
				}
			} else {
				System.out.println("Inside CartCheckout for loop else");
				FunctionLoginTestCase.LogintestCaseMethod();
			}
		}
		
		DataProcessModule.BroswerMoveToAction(VariableDeclaration.cartIconXPath);
		Thread.sleep(1000);
		DataProcessModule.ClickEvent(VariableDeclaration.cartIconXPath);
		
		Thread.sleep(1000);
		
		DataProcessModule dataProcessModule = new DataProcessModule();
		DataProcessModule dataProcessModule2 = new DataProcessModule();
		dataProcessModule2.BroswerMoveToAction(VariableDeclaration.linkedInXPath);
		
		Thread.sleep(1000);
		
		DataProcessModule.ClickEvent(VariableDeclaration.checkOutClickXPath);
		Thread.sleep(1000);
		
		DataProcessModule.TextBox(VariableDeclaration.checkOutFirstNameXpath,
				  VariableDeclaration.checkOutFirstName);
		
		Thread.sleep(200);
		
		DataProcessModule.TextBox(VariableDeclaration.checkOutLastNameXPath,
				  VariableDeclaration.checkOutLastName);
		
		Thread.sleep(200);
		
		DataProcessModule.TextBox(VariableDeclaration.checkOutPostalCodeXpath,
				  VariableDeclaration.checkOutPostalCode);
		
		Thread.sleep(200);
		
		DataProcessModule.BroswerMoveToAction(VariableDeclaration.linkedInXPath);
		
		Thread.sleep(700);
		
		DataProcessModule.ClickEvent(VariableDeclaration.checkOutContinueXPath);
		
		Thread.sleep(700);
		
		DataProcessModule.ClickEvent(VariableDeclaration.finishClickXPath);
		
		Thread.sleep(700);
		
		DataProcessModule.BroswerMoveToAction(VariableDeclaration.backHomeButtonXPath);
		
		Thread.sleep(700);
		
	}
}
