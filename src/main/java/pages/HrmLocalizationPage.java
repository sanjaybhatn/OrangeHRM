package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HrmLocalizationPage extends BasePage {

	public HrmLocalizationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//li[contains(.,'Localization')])[2]")
	private WebElement localizationlink;

	@FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
	private WebElement savebutton;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	private WebElement pagetext;

	public HrmLocalizationPage clickonlocalization() {
		localizationlink.click();
		return this;
	}

	public HrmLocalizationPage clickonsavebutton() {
		savebutton.click();
		return this;
	}

	public HrmLocalizationPage valiadtepagename(String Actualtext) {
		String ExpectedText = pagetext.getText();
		Assert.assertTrue(ExpectedText.equals(Actualtext));
		return this;

	}
}