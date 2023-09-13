package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrmLocalizationPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);

	public HrmLocalizationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//li[contains(.,'Localization')])[2]")
	private WebElement localizationLink;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
	private WebElement saveButton;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pageText;

	// Clicking on localization link
	public HrmLocalizationPage clickOnLocalization() {
		wait.until(ExpectedConditions.visibilityOf(localizationLink));
		localizationLink.click();
		return this;
	}

	// Clicking on Save Button
	public HrmLocalizationPage clickOnSaveButton() {
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		saveButton.click();
		return this;
	}

	// Validating page name text
	public HrmLocalizationPage valiadtePageName(String actualText) {
		wait.until(ExpectedConditions.visibilityOf(pageText));
		String expectedText = pageText.getText();
		Assert.assertTrue(expectedText.equals(actualText));
		return this;

	}
}
