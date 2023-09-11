package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HrmEmailSubscriptionPage extends BasePage {

	public HrmEmailSubscriptionPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='#'][contains(.,'Email Subscriptions')]")
	private WebElement emailconfigsub;

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
	private WebElement AddButton;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
	private WebElement nameField;
	
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[3]")
	private WebElement EmailnameField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//i[contains(@class,'oxd-icon bi-trash')]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, Delete')]")
	private WebElement yesdeleteButton;
	
	
	
	
	public HrmEmailSubscriptionPage clickonEmailsub() {
		emailconfigsub.click();
		return this;

	}
	
	public HrmEmailSubscriptionPage clickonactionToggle() {
		actionToggle.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonleaveApplicationAction() {
		leaveApplicationActionButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonleaveAssignmentAction() {
		leaveAssignmentsActionButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonleaveapprovalsAction() {
		leaveApprovalsActionButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonleaveCancellationsAction() {
		leaveCancellationsActionButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonleaveRejectionsAction() {
		leaveRejectionsActionButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonaddbutton() {
		AddButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage EnterName(String name) {
		nameField.sendKeys(name);
		return this;
		
	}
	
	public HrmEmailSubscriptionPage EnterEmailName(String emailname) {
		EmailnameField.sendKeys(emailname);
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickonsubmit() {
		submitButton.click();
		return this;
		
	}
	
	public HrmEmailSubscriptionPage clickondelete() {
		deleteButton.click();
		yesdeleteButton.click();
		return this;
		
	}
}
