package modules;

import helpers.Log;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.HomePageObjects;

public class HomePageAction {

	public static void calculator(WebDriver driver) throws Exception {

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions
		 * .presenceOfElementLocated(HomePage.locator));
		 */

		HomePageObjects.calculatorsDropDown.click();

		Log.info("Click action is perfromed on Calculator and Indicators Link");

		Reporter.log("Click action is perfromed on Calculator and Indicators Link");
	}

	public static void faqNav(WebDriver driver) {

		HomePageObjects.faqsDropDown.click();

		Log.info("Click action is perfromed on faqs Link");

		Reporter.log("Click action is perfromed on faqs Link");
	}

	public static void mobileMenuNav(WebDriver driver) {
		HomePageObjects.mobilemenu.click();

		Log.info("Click action is perfromed on faqs Link");

		Reporter.log("Click action is perfromed on faqs Link");

	}

	

}
