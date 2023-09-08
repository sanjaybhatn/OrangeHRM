package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HRMAdminPage;
import pages.HRMLocalizationPage;

public class HRMLocalizationTest extends BaseTest {

	@Test(groups ={"SmokeTest"},testName = "TS 03 TC 01")
	public void ValidateLocalizationpage() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMLocalizationPage hrmLocalizationPage = new HRMLocalizationPage(driver);
			hrmLocalizationPage.clickonlocalization();
			Thread.sleep(2000);
			hrmLocalizationPage.valiadtepagename("Localization");
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validation localization page");
		}

	}
	
	@Test(groups ={"Regression Test"},testName = "TS 03 TC 02")
	public void ValidateLocalizationSavebutton() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMLocalizationPage hrmLocalizationPage = new HRMLocalizationPage(driver);
			hrmLocalizationPage.clickonlocalization();
			Thread.sleep(2000);
			hrmLocalizationPage.clickonsavebutton();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking save button");
		}

	}

}
