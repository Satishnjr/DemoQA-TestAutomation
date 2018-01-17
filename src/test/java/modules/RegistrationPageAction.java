package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.RegistrationPageObjects;

public class RegistrationPageAction {

	public static void click(WebDriver driver) {
		RegistrationPageObjects.registration.click();

	}

	public static void registrationForm(String fname, String lname)
			throws Throwable {

		RegistrationPageObjects.firstName.sendKeys(fname);
		RegistrationPageObjects.lastName.sendKeys(lname);
	}

	public static void maritalStatus(WebDriver driver)
			throws InterruptedException {
		RegistrationPageObjects.singleRadioBtn.click();
	}

	public static void hobby(WebDriver driver) {
		RegistrationPageObjects.cricketCheckBox.click();

	}
	
	public static void country() throws InterruptedException {
		RegistrationPageObjects.countryDropDown.click();
		Select country = new Select(RegistrationPageObjects.countryDropDown);
		country.selectByValue("India");
		Thread.sleep(5000);	
	}
/*
	public static void country(WebDriver driver) throws InterruptedException {
		RegistrationPageObjects.countryDropDown.click();
		Select country = new Select(driver.findElement(By
				.cssSelector("#dropdown_7")));
		country.selectByValue("India");
		Thread.sleep(5000);
	}*/

}
