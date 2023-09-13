package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrmOAuthClientPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	public HrmOAuthClientPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Register OAuth Client']")
	private WebElement oauthClientLink;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pageText;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-trash')])[3]")
	private WebElement deleteButton;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, Delete')]")
	private WebElement yesDeleteButton;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add')]")
	private WebElement addButton;
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement nameField;
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement redirectURI;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	public HrmOAuthClientPage clickonOAuthlink() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(oauthClientLink));
		oauthClientLink.click();
		Thread.sleep(2000);
		return this;

	}
	
	public HrmOAuthClientPage valiadtePageName(String actualText) {
		wait.until(ExpectedConditions.visibilityOf(pageText));
		String expectedText = pageText.getText();
		Assert.assertTrue(expectedText.equals(actualText));
		return this;

	}
	
	public HrmOAuthClientPage clickonAddbutton() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(addButton));
		addButton.click();
		return this;
		
	}
	
	public HrmOAuthClientPage enterName(String name) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(nameField));
		nameField.sendKeys(name);
		return this;
		
	}
	
	public HrmOAuthClientPage enterRedirectURI(String URlName) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(redirectURI));
		redirectURI.sendKeys(URlName);
		return this;
		
	}
	
	public HrmOAuthClientPage clickonSaveButton() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		submitButton.click();
		return this;
		
	}
	
	public HrmOAuthClientPage clickonDeleteButton() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(deleteButton));
		deleteButton.click();
		wait.until(ExpectedConditions.visibilityOf(yesDeleteButton));
		yesDeleteButton.click();
		return this;
		
	}
	
	
}
