package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HRMAdminPage;
import pages.HRMEmailConfigurationPage;

public class HRMEmailConfigurationTest extends BaseTest {

	@Test(testName = "TS 01 TC 01")
	public void clickonEmailConfigurationSave() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonsendEmailRadionButton();
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle();
			hrmEmailConfigurationPage.entertestemail("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			Thread.sleep(2000);

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading sendmail save functionality");
		}
	}

	@Test(testName = "TS 01 TC 02")
	public void clickonEmailConfigurationReset() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonsendEmailRadionButton();
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle();
			hrmEmailConfigurationPage.entertestemail("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading sendmail reset functionality");
		}
	}

	@Test(testName = "TS 01 TC 03")
	public void clickonEmailConfigurationSecureSMTPSave() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonSecureSMTP();
			hrmEmailConfigurationPage.enterHostname("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortname("587");
			hrmEmailConfigurationPage.clickonyesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPpass("admin123");
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle1();
			hrmEmailConfigurationPage.entertestemail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			Thread.sleep(2000);

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SecureSMTP save functionality");
		}
	}

	@Test(testName = "TS 01 TC 04")
	public void clickonEmailConfigurationSecureSMTPReset() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonSecureSMTP();
			hrmEmailConfigurationPage.enterHostname("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortname("587");
			hrmEmailConfigurationPage.clickonyesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPpass("admin123");
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle1();
			hrmEmailConfigurationPage.entertestemail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SecureSMTP Reset functionality");
		}
	}

	@Test(testName = "TS 01 TC 05")
	public void clickonEmailConfigurationSMTPSave() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonSMTP();
			hrmEmailConfigurationPage.enterHostname("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortname("587");
			hrmEmailConfigurationPage.clickonyesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPpass("admin123");
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle1();
			hrmEmailConfigurationPage.entertestemail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.submit();
			Thread.sleep(2000);

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SMTP save functionality");
		}
	}

	@Test(testName = "TS 01 TC 06")
	public void clickonEmailConfigurationSMTPReset() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailConfigurationPage hrmEmailConfigurationPage = new HRMEmailConfigurationPage(driver);
			hrmEmailConfigurationPage.clickonEmailConfig();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.clickonSMTP();
			hrmEmailConfigurationPage.enterHostname("smtp.gmail.com");
			hrmEmailConfigurationPage.enterPortname("587");
			hrmEmailConfigurationPage.clickonyesRadioButton();
			hrmEmailConfigurationPage.enterSMTPUser("Admin");
			hrmEmailConfigurationPage.enterSMTPpass("admin123");
			hrmEmailConfigurationPage.toggleonsendTestEmailToggle1();
			hrmEmailConfigurationPage.entertestemail2("sanjay.bhatv@gmail.com");
			hrmEmailConfigurationPage.reset();
			Thread.sleep(2000);
			hrmEmailConfigurationPage.validateRequiredMessage();

		} catch (Exception e) {
			throw new Exception("Error occurred while the valiading SMTP Reset functionality");
		}
	}

}
