package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrmEmailSubscriptionPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);

	public HrmEmailSubscriptionPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='#'][contains(.,'Email Subscriptions')]")
	private WebElement emailConfigSub;
	@FindBy(xpath = "(//div[contains(@class,'oxd-table-cell-actions')])[1]")
	private WebElement actionToggle;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-person-plus-fill')])[1]")
	private WebElement leaveApplicationActionButton;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-person-plus-fill')])[2]")
	private WebElement leaveApprovalsActionButton;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-person-plus-fill')])[3]")
	private WebElement leaveAssignmentsActionButton;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-person-plus-fill')])[4]")
	private WebElement leaveCancellationsActionButton;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-person-plus-fill')])[5]")
	private WebElement leaveRejectionsActionButton;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add')]")
	private WebElement addButton;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
	private WebElement nameField;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[3]")
	private WebElement emailNameField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//i[contains(@class,'oxd-icon bi-trash')]")
	private WebElement deleteButton;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, Delete')]")
	private WebElement yesDeleteButton;
	@FindBy(xpath = "//p[normalize-space()='Successfully Saved']")
	private WebElement succussMessage;

	// Clicking on Email Subscription link
	public HrmEmailSubscriptionPage clickOnEmailSub() {
		wait.until(ExpectedConditions.visibilityOf(emailConfigSub));
		emailConfigSub.click();
		return this;

	}

	// Clicking on Action Toggle
	public HrmEmailSubscriptionPage clickOnActionToggle() {
		wait.until(ExpectedConditions.visibilityOf(actionToggle));
		actionToggle.click();
		return this;

	}

	// Clicking on Leave application action button
	public HrmEmailSubscriptionPage clickOnLeaveApplicationAction() {
		wait.until(ExpectedConditions.visibilityOf(leaveApplicationActionButton));
		leaveApplicationActionButton.click();
		return this;

	}

	// Clicking on Leave assignment action button
	public HrmEmailSubscriptionPage clickOnLeaveAssignmentAction() {
		wait.until(ExpectedConditions.visibilityOf(leaveAssignmentsActionButton));
		leaveAssignmentsActionButton.click();
		return this;

	}

	// Clicking on Leave approvals action button
	public HrmEmailSubscriptionPage clickOnLeaveapprovalsAction() {
		wait.until(ExpectedConditions.visibilityOf(leaveApprovalsActionButton));
		leaveApprovalsActionButton.click();
		return this;

	}

	// Clicking on Leave cancellation action button
	public HrmEmailSubscriptionPage clickOnLeaveCancellationsAction() {
		wait.until(ExpectedConditions.visibilityOf(leaveCancellationsActionButton));
		leaveCancellationsActionButton.click();
		return this;

	}

	// Clicking on Leave rejection action button
	public HrmEmailSubscriptionPage clickOnLeaveRejectionsAction() {
		wait.until(ExpectedConditions.visibilityOf(leaveRejectionsActionButton));
		leaveRejectionsActionButton.click();
		return this;

	}

	// Clicking on add action button
	public HrmEmailSubscriptionPage clickOnAddButton() {
		wait.until(ExpectedConditions.visibilityOf(addButton));
		addButton.click();
		return this;

	}

	// Entering username to name field
	public HrmEmailSubscriptionPage enterName(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameField));
		nameField.sendKeys(name);
		return this;

	}

	// Entering Email to email field
	public HrmEmailSubscriptionPage enterEmailName(String emailname) {
		wait.until(ExpectedConditions.visibilityOf(emailNameField));
		emailNameField.sendKeys(emailname);
		return this;

	}

	// Clicking on submit button
	public HrmEmailSubscriptionPage clickOnSubmit() {
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		submitButton.click();
		return this;

	}

	// clicking on delete button
	public HrmEmailSubscriptionPage clickOnDelete() {
		wait.until(ExpectedConditions.visibilityOf(deleteButton));
		deleteButton.click();
		yesDeleteButton.click();
		return this;

	}

	// SuccussMessageValidation
	public HrmEmailSubscriptionPage validatedSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(succussMessage));
		Assert.assertTrue(succussMessage.isDisplayed());
		return this;
	}
}
