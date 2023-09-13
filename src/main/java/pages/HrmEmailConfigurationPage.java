package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrmEmailConfigurationPage extends BasePage {

	public HrmEmailConfigurationPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait = new WebDriverWait(driver, 50);

	@FindBy(xpath = "//a[@href='#'][contains(.,'Email Configuration')]")
	private WebElement emailConfigLink;
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement mailSentAsTextField;
	@FindBy(xpath = "(//span[contains(@class,'oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input')])[3]")
	private WebElement sendMailRadioButton;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement sendTestEmailToggle;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[3]")
	private WebElement sendTestEmailTextField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	private WebElement resetButton;
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement requiredMessage;
	@FindBy(xpath = "//label[normalize-space()='SECURE SMTP']")
	private WebElement secureSmtpRadioButton;
	@FindBy(xpath = "//label[normalize-space()='SMTP']")
	private WebElement smtpRadioButton;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement smtpHostTextfield;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement smtpPortTextField;
	@FindBy(xpath = "//label[normalize-space()='Yes']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	private WebElement useSmtpAuthRadioButton;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	private WebElement smtpUsernameTextField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement smtpPasswordTextField;
	@FindBy(xpath = "//div[@class='oxd-form-row']//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement sendTestEmailToggle2;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
	private WebElement sendTestEmailTextField2;
	@FindBy(xpath = "//p[normalize-space()='Successfully Saved']")
	private WebElement succussMessage;

	// clicking on Email configuration link
	public HrmEmailConfigurationPage clickOnEmailConfig() {
		wait.until(ExpectedConditions.visibilityOf(emailConfigLink));
		emailConfigLink.click();
		return this;

	}

	// entering Email ID to the mailsentasrextfield
	public HrmEmailConfigurationPage enterMailSentAs(String mailId) {
		wait.until(ExpectedConditions.visibilityOf(mailSentAsTextField));
		mailSentAsTextField.clear();
		mailSentAsTextField.sendKeys(mailId);

		return this;

	}

	// Selecting SendEmail Radio Button
	public HrmEmailConfigurationPage clickOnSendEmailRadionButton() {
		wait.until(ExpectedConditions.visibilityOf(sendMailRadioButton));
		sendMailRadioButton.click();
		return this;

	}

	// Turning on send testemail toggle
	public HrmEmailConfigurationPage toggleOnSendTestEmailToggle() {
		wait.until(ExpectedConditions.visibilityOf(sendTestEmailToggle));
		sendTestEmailToggle.click();
		return this;

	}

	// Entering Email ID to the TestEmailTextField
	public HrmEmailConfigurationPage enterTestEmail(String testId) {
		wait.until(ExpectedConditions.visibilityOf(sendTestEmailTextField));
		sendTestEmailTextField.sendKeys(testId);
		return this;

	}

	// Clicking on Submit Button
	public HrmEmailConfigurationPage submit() {
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		submitButton.click();
		return this;

	}

	// Clicking on Reset Button
	public HrmEmailConfigurationPage reset() {
		wait.until(ExpectedConditions.visibilityOf(resetButton));
		resetButton.click();
		return this;

	}

	// Validating Required error message on UI
	public HrmEmailConfigurationPage validateRequiredMessage() {
		String expectedText = "Required";
		wait.until(ExpectedConditions.visibilityOf(requiredMessage));
		String actualText = requiredMessage.getText();
		Assert.assertTrue(expectedText.equals(actualText));
		return this;

	}

	// Clicking on SecureSMTP Radio Button
	public HrmEmailConfigurationPage clickOnSecureSMTP() {
		wait.until(ExpectedConditions.visibilityOf(secureSmtpRadioButton));
		secureSmtpRadioButton.click();
		return this;
	}

	// clicking on SMTP Radio Button
	public HrmEmailConfigurationPage clickOnSMTP() {
		wait.until(ExpectedConditions.visibilityOf(smtpRadioButton));
		smtpRadioButton.click();
		return this;
	}

	// Entering Host Name
	public HrmEmailConfigurationPage enterHostName(String hostName) {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(smtpHostTextfield));
		a.click(smtpHostTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(hostName).build().perform();
		return this;
	}

	// Entering Port number
	public HrmEmailConfigurationPage enterPortName(String portName) {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(smtpPortTextField));
		a.click(smtpPortTextField).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(portName).build().perform();
		return this;
	}

	// Selecting clickonYesRadio Button
	public HrmEmailConfigurationPage clickOnYesRadioButton() {
		wait.until(ExpectedConditions.visibilityOf(useSmtpAuthRadioButton));
		useSmtpAuthRadioButton.click();
		return this;
	}

	// Entring SMTP Username
	public HrmEmailConfigurationPage enterSMTPUser(String userName) {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(smtpUsernameTextField));
		a.click(smtpUsernameTextField).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(userName).build().perform();
		return this;
	}

	// Entering SMTP Password
	public HrmEmailConfigurationPage enterSMTPPass(String passWord) {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(smtpPasswordTextField));
		a.click(smtpPasswordTextField).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
				.sendKeys(passWord).build().perform();
		return this;
	}

	// Clicking on TestEmail Toggle
	public HrmEmailConfigurationPage toggleOnSendTestEmailToggle2() {
		wait.until(ExpectedConditions.visibilityOf(sendTestEmailToggle2));
		sendTestEmailToggle2.click();
		return this;

	}

	// Entering test Email
	public HrmEmailConfigurationPage enterTestEmail2(String testId) {
		wait.until(ExpectedConditions.visibilityOf(sendTestEmailTextField2));
		sendTestEmailTextField2.clear();
		sendTestEmailTextField2.sendKeys(testId);
		return this;

	}

	// SuccussMessageValidation
	public HrmEmailConfigurationPage validatedSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(succussMessage));
		Assert.assertTrue(succussMessage.isDisplayed());
		return this;
	}

}
