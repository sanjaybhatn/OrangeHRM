package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HrmEmailConfigurationPage extends BasePage {

	public HrmEmailConfigurationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='#'][contains(.,'Email Configuration')]")
	private WebElement emailconfigLink;
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement mailsentAStextfield;
	@FindBy(xpath = "(//span[contains(@class,'oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input')])[3]")
	private WebElement sendmailRadioButton;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement sendTestEmailtoggle;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[3]")
	private WebElement sendTestEmailtextfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	private WebElement resetButton;
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement requiredMessage;
	@FindBy(xpath = "//label[normalize-space()='SECURE SMTP']")
	private WebElement secureSMTPRadiobutton;
	@FindBy(xpath = "//label[normalize-space()='SMTP']")
	private WebElement SMTPRadiobutton;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement SMTPHostTextfield;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement SMTPPortTextfield;
	@FindBy(xpath = "//label[normalize-space()='Yes']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	private WebElement UseSMTPAuthRadioButton;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	private WebElement SMTPUsernameTextfield;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement SMTPPasswordTextfield;
	@FindBy(xpath = "//div[@class='oxd-form-row']//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement sendTestEmailtoggle2;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
	private WebElement sendTestEmailtextfield2;

	public HrmEmailConfigurationPage clickonEmailConfig() {
		emailconfigLink.click();
		return this;

	}
	public HrmEmailConfigurationPage EntermailsentAs(String mailid) {
		mailsentAStextfield.clear();
		mailsentAStextfield.sendKeys(mailid);
		return this;

	}
	public HrmEmailConfigurationPage clickonsendEmailRadionButton() {
		sendmailRadioButton.click();
		return this;

	}
	public HrmEmailConfigurationPage toggleonsendTestEmailToggle() {
		sendTestEmailtoggle.click();
		return this;

	}
	public HrmEmailConfigurationPage entertestemail(String testid) {
		sendTestEmailtextfield.sendKeys(testid);
		return this;

	}
	public HrmEmailConfigurationPage submit() {
		submitButton.click();
		return this;

	}
	public HrmEmailConfigurationPage reset() {
		resetButton.click();
		return this;

	}
	public HrmEmailConfigurationPage validateRequiredMessage() {
		String ExpectedText = "Required";
		String ActualText = requiredMessage.getText();
		Assert.assertTrue(ExpectedText.equals(ActualText));
		return this;

	}
	public HrmEmailConfigurationPage clickonSecureSMTP() {
		secureSMTPRadiobutton.click();
		return this;
	}
	public HrmEmailConfigurationPage clickonSMTP() {
		SMTPRadiobutton.click();
		return this;
	}
	public HrmEmailConfigurationPage enterHostname(String hostName) {
		Actions a = new Actions(driver);
		a.click(SMTPHostTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(hostName).build().perform();
		return this;
	}
	public HrmEmailConfigurationPage enterPortname(String portName) {
		Actions a = new Actions(driver);
		a.click(SMTPPortTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(portName).build().perform();
		return this;
	}
	public HrmEmailConfigurationPage clickonyesRadioButton() {
		UseSMTPAuthRadioButton.click();
		return this;
	}
	public HrmEmailConfigurationPage enterSMTPUser(String username) {
		Actions a = new Actions(driver);
		a.click(SMTPUsernameTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(username).build().perform();
		return this;
	}
	public HrmEmailConfigurationPage enterSMTPpass(String password) {
		Actions a = new Actions(driver);
		a.click(SMTPPasswordTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(password).build().perform();
		return this;
	}
	public HrmEmailConfigurationPage toggleonsendTestEmailToggle1() {
		sendTestEmailtoggle2.click();
		return this;

	}
	public HrmEmailConfigurationPage entertestemail2(String testid) {
		sendTestEmailtextfield2.clear();
		sendTestEmailtextfield2.sendKeys(testid);
		return this;

	}

}
