package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HRMOAuthClientPage extends BasePage {

	public HRMOAuthClientPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Register OAuth Client']")
	private WebElement oauthClientLink;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pagetext;
	
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-trash')])[3]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, Delete')]")
	private WebElement yesdeleteButton;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add')]")
	private WebElement AddButton;
	
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement NameField;
	
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement redirectURI;
	

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	

	public HRMOAuthClientPage clickonOAuthlink() throws Exception {
		oauthClientLink.click();
		Thread.sleep(2000);
		return this;

	}
	
	public HRMOAuthClientPage valiadtepagename(String Actualtext) {
		String ExpectedText = pagetext.getText();
		Assert.assertTrue(ExpectedText.equals(Actualtext));
		return this;

	}
	
	public HRMOAuthClientPage clickonAddbutton() throws Exception {
		AddButton.click();
		Thread.sleep(3000);
		return this;
		
	}
	
	public HRMOAuthClientPage enterName(String name) throws Exception {
		NameField.sendKeys(name);
		return this;
		
	}
	
	public HRMOAuthClientPage enterRedirectURI(String URlName) throws Exception {
		redirectURI.sendKeys(URlName);
		return this;
		
	}
	
	public HRMOAuthClientPage clickonsaveButton() throws Exception {
		submitButton.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public HRMOAuthClientPage clickondeleteButton() throws Exception {
		deleteButton.click();
		Thread.sleep(3000);
		yesdeleteButton.click();
		Thread.sleep(3000);
		return this;
		
	}
	
	
}
