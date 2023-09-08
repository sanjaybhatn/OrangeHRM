package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HRMModulesPage extends BasePage {

	public HRMModulesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='#'][contains(.,'Modules')]")
	private WebElement moduleslink;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pagetext;
	
	@FindBy(xpath = "//div[3]//div[1]//label[1]//span[1]")
	private WebElement leavemoduletoggle;
	
	@FindBy(xpath = "(//span[contains(@class,'oxd-switch-input oxd-switch-input--active --label-right')])[4]")
	private WebElement timemoduletoggle;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;


	public HRMModulesPage clickonmoduleslink() {
		moduleslink.click();
		return this;

	}
	
	public HRMModulesPage valiadtepagename(String Actualtext) {
		String ExpectedText = pagetext.getText();
		Assert.assertTrue(ExpectedText.equals(Actualtext));
		return this;

	}
	
	public HRMModulesPage clickonleavemodetoggle(String modulename) {
		if(driver.findElements(By.xpath("//span[normalize-space()='"+modulename+"']")).size()!=0) {
		leavemoduletoggle.click();
		}
		return this;

	}
	
	public HRMModulesPage clickontimemodetoggle() {
		timemoduletoggle.click();
		return this;

	}
	
	public HRMModulesPage clickonsavebutton() throws Exception {
		try {
			saveButton.click();
			return this;
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking save button");
		}
		
	}
	
	public HRMModulesPage validatemoduleremoved(String modulename) throws Exception {
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
