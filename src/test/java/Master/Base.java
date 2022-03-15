package Master;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataSelector.DataProcessModule;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	@BeforeSuite
	public static void BeforeSuiteMethod() throws AWTException {
		System.out.println("Beforesuite log");

		if (VariableDeclaration.browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			VariableDeclaration.driver = new ChromeDriver();
			System.out.println("Chrome browser open log");
		} else if (VariableDeclaration.browserName.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			VariableDeclaration.driver = new FirefoxDriver();
			System.out.println("FireFix browser open log");
		}

		VariableDeclaration.driver.manage().window().maximize();
		System.out.println("Window maximize log");

		VariableDeclaration.driver.get((String) VariableDeclaration.testURL);
		System.out.println("Broswer URL loaded log");

	}

	@AfterSuite
	public static void AfterSuiteMethod() throws InterruptedException {
		System.out.println("Aftersuite log");

		Thread.sleep((long) VariableDeclaration.timeMS);
		// VariableDeclaration.driver.quit();

		System.out.println("Browser closed log");

	}

}
