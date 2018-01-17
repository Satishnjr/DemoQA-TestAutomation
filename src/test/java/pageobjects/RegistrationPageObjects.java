package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPageObjects extends BaseClass {

	public RegistrationPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "a[href*='registration']")
	public static WebElement registration;
	
	@FindBy(how = How.NAME, using = "first_name")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "last_name")
	public static WebElement lastName;
	
	@FindBy(how = How.CSS, using = "input[value='single']")
	public static WebElement singleRadioBtn;
	
	@FindBy(how = How.CSS, using = "input[value='cricket ']")
	public static WebElement cricketCheckBox;
	
	@FindBy(how = How.CSS, using = "#dropdown_7")
	public static WebElement countryDropDown;

	
}
