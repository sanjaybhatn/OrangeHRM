package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrmAdminPage extends BasePage {
  WebDriverWait wait=new WebDriverWait(driver, 50);
	public HrmAdminPage(WebDriver driver) {
		super(driver);
	}

	// admin link locator initializing
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminLink;
	// Configuation link locator initializing
	@FindBy(xpath = "(//span[contains(@class,'oxd-topbar-body-nav-tab-item')])[5]")
	private WebElement configLink;

	public HrmAdminPage clickOnAdmin() {
		wait.until(ExpectedConditions.visibilityOf(adminLink));
		// Clicking on Admin link
		adminLink.click();
		return this;
	}

	public HrmAdminPage clickOnConfig() {
		wait.until(ExpectedConditions.visibilityOf(configLink));
		// Clicking on Configuration link
		configLink.click();
		return this;

	}

}
