package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmOAuthClientPage;

public class HrmOAuthClientTest extends BaseTest {

	@Test(groups ={"SmokeTest"},testName = "TS 05 TC 01")
	public void clickonOAuthClientConfig() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmOAuthClientPage hrmoAuthClientPage = new HrmOAuthClientPage(driver);
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.valiadtePageName("OAuth Client List");

		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking OAuth Client link");
		}

	}
    @Test(groups ={"Regression Test"},testName = "TS 05 TC 02")
	public void clickonaddOAuthClientConfig() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmOAuthClientPage hrmoAuthClientPage = new HrmOAuthClientPage(driver);
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.valiadtePageName("OAuth Client List");
			hrmoAuthClientPage.clickonAddbutton();
			hrmoAuthClientPage.enterName("Test2");
			hrmoAuthClientPage.enterRedirectURI("http://localhost:5173/#/oauth/redirect2");
			hrmoAuthClientPage.clickonSaveButton();
			hrmAdminPage.clickOnConfig();
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.clickonDeleteButton();

		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating OAuth Client link");
		}

	}

}
