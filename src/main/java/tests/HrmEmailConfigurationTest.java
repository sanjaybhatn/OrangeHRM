package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmEmailConfigurationPage;

public class HrmEmailConfigurationTest extends BaseTest {

	@Test(groups = { "SmokeTest" }, testName = "TS 01 TC 01")
	public void clickonEmailConfigurationSave() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSendEmailRadionButton();
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle();
			hrmEmailConfigurationPage.enterTestEmail("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			hrmEmailConfigurationPage.validatedSuccussMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading sendmail save functionality");
		}
	}

	@Test(groups = { "SmokeTest" }, testName = "TS 01 TC 02")
	public void clickonEmailConfigurationReset() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSendEmailRadionButton();
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle();
			hrmEmailConfigurationPage.enterTestEmail("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading sendmail reset functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 01 TC 03")
	public void clickonEmailConfigurationSecureSMTPSave() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSecureSMTP();
			hrmEmailConfigurationPage.enterHostName("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortName("587");
			hrmEmailConfigurationPage.clickOnYesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPPass("admin123");
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle2();
			hrmEmailConfigurationPage.enterTestEmail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			hrmEmailConfigurationPage.validatedSuccussMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SecureSMTP save functionality");
		}
	}

	@Test(groups = { "SmokeTest" }, testName = "TS 01 TC 04")
	public void clickonEmailConfigurationSecureSMTPReset() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSecureSMTP();
			hrmEmailConfigurationPage.enterHostName("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortName("587");
			hrmEmailConfigurationPage.clickOnYesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPPass("admin123");
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle2();
			hrmEmailConfigurationPage.enterTestEmail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SecureSMTP Reset functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 01 TC 05")
	public void clickonEmailConfigurationSMTPSave() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSMTP();
			hrmEmailConfigurationPage.enterHostName("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortName("587");
			hrmEmailConfigurationPage.clickOnYesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPPass("admin123");
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle2();
			hrmEmailConfigurationPage.enterTestEmail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			hrmEmailConfigurationPage.validatedSuccussMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SMTP save functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 01 TC 06")
	public void clickonEmailConfigurationSMTPReset() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailConfigurationPage hrmEmailConfigurationPage = new HrmEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickOnEmailConfig();
			hrmEmailConfigurationPage.clickOnSMTP();
			hrmEmailConfigurationPage.enterHostName("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortName("587");
			hrmEmailConfigurationPage.clickOnYesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPPass("admin123");
			hrmEmailConfigurationPage.toggleOnSendTestEmailToggle2();
			hrmEmailConfigurationPage.enterTestEmail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SMTP Reset functionality");
		}
	}

}
