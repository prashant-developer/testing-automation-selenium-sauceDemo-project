package DataSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Master.VariableDeclaration;

public class DataProcessModule {

	public static Wait<WebDriver> wait = new FluentWait<WebDriver>(VariableDeclaration.driver)
			.withTimeout(Duration.ofMillis(VariableDeclaration.out_time))
			.pollingEvery(Duration.ofMillis(VariableDeclaration.polling_time))
			.withMessage("There is some Exception from Xpath").ignoring(NoSuchElementException.class);

	
	public static void TextBox(String xp, String ky) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp))).sendKeys(ky);
		System.out.println("Textbox module log");
	}
	
	public static void ClickEvent(String xp) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp))).click();
		System.out.println("Click event module log");
	}
	
	public static void BroswerMoveToAction(String xp) throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
		Actions action = new Actions(VariableDeclaration.driver);
		action.moveToElement(element).perform();
	}
}
