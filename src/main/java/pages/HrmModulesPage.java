package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrmModulesPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	public HrmModulesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='#'][contains(.,'Modules')]")
	private WebElement modulesLink;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pageText;
	@FindBy(xpath = "//div[3]//div[1]//label[1]//span[1]")
	private WebElement leaveModuleToggle;
	@FindBy(xpath = "(//span[contains(@class,'oxd-switch-input oxd-switch-input--active --label-right')])[4]")
	private WebElement timeModuleToggle;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

    //Clicking on modules link
	public HrmModulesPage clickOnModulesLink() {
		wait.until(ExpectedConditions.visibilityOf(modulesLink));
		modulesLink.click();
		return this;

	}
	//Validating Page name
	public HrmModulesPage valiadtePageName(String actualText) {
		wait.until(ExpectedConditions.visibilityOf(pageText));
		String ExpectedText = pageText.getText();
		Assert.assertTrue(ExpectedText.equals(actualText));
		return this;

	}
	
	public HrmModulesPage clickonleavemodetoggle(String modulename) {
		wait.until(ExpectedConditions.visibilityOf(leaveModuleToggle));
		if(driver.findElements(By.xpath("//span[normalize-space()='"+modulename+"']")).size()!=0) {
		leaveModuleToggle.click();
		}
		return this;

	}
	//Clicking on time module tag
	public HrmModulesPage clickOnTimeModeToggle() {
		wait.until(ExpectedConditions.visibilityOf(timeModuleToggle));
		timeModuleToggle.click();
		return this;

	}
	
	//Clicking save button
	public HrmModulesPage clickOnSaveButton() throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOf(saveButton));
			saveButton.click();
			return this;
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking save button");
		}
		
	}
	
	//Validating module is removed
	public HrmModulesPage validateModuleRemoved(String modulename) throws Exception {
		try {
			if(driver.findElements(By.xpath("//span[normalize-space()='"+modulename+"']")).size()==0) {
				System.out.println(modulename+" is removed from menu");
			}
			return this;
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating module");
		}
		
	
	}
	
}
