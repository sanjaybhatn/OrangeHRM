package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HRMAdminPage extends BasePage {
	
	
	public HRMAdminPage(WebDriver driver) {
		super(driver);
	}
     
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminLink;
	
	@FindBy(xpath = "(//span[contains(@class,'oxd-topbar-body-nav-tab-item')])[5]")
	private WebElement configLink;
	
	
	
	
	public HRMAdminPage clickadmin() {
		adminLink.click();
		return this;
	}

	public HRMAdminPage clickonconfig() {
		configLink.click();
		return this;
		
		
	}

	

}
