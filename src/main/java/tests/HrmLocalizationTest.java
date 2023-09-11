package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmLocalizationPage;

public class HrmLocalizationTest extends BaseTest {

	@Test(groups ={"SmokeTest"},testName = "TS 03 TC 01")
	public void ValidateLocalizationpage() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmLocalizationPage hrmLocalizationPage = new HrmLocalizationPage(driver);
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
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmLocalizationPage hrmLocalizationPage = new HrmLocalizationPage(driver);
			hrmLocalizationPage.clickonlocalization();
			Thread.sleep(2000);
			hrmLocalizationPage.clickonsavebutton();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking save button");
		}

	}

}
