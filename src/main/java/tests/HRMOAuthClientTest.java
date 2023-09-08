package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HRMAdminPage;
import pages.HRMOAuthClientPage;

public class HRMOAuthClientTest extends BaseTest {

	@Test
	public void clickonOAuthClientConfig() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMOAuthClientPage hrmoAuthClientPage = new HRMOAuthClientPage(driver);
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.valiadtepagename("OAuth Client List");

		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking OAuth Client link");
		}

	}
    @Test
	public void clickonaddOAuthClientConfig() throws Exception {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMOAuthClientPage hrmoAuthClientPage = new HRMOAuthClientPage(driver);
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.valiadtepagename("OAuth Client List");
			hrmoAuthClientPage.clickonAddbutton();
			hrmoAuthClientPage.enterName("Test2");
			hrmoAuthClientPage.enterRedirectURI("http://localhost:5173/#/oauth/redirect2");
			hrmoAuthClientPage.clickonsaveButton();
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			hrmoAuthClientPage.clickonOAuthlink();
			hrmoAuthClientPage.clickondeleteButton();

		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating OAuth Client link");
		}

	}

}
