package tests;

import org.testng.annotations.Test;



import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmModulesPage;


public class HrmModulesTest extends BaseTest {
	
	@Test(groups ={"SmokeTest"},testName = "TS 04 TC 01")
	public void valiadtemodules() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmModulesPage hrmModulesPage=new HrmModulesPage(driver);
			hrmModulesPage.clickOnModulesLink();
			hrmModulesPage.valiadtePageName("Module Configuration");
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking module link");
		}
		
	}
	@Test(groups ={"Regression Test"},testName = "TS 04 TC 02")
	public void valiadtemodulestoggle() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmModulesPage hrmModulesPage=new HrmModulesPage(driver);
			hrmModulesPage.clickOnModulesLink();
			hrmModulesPage.valiadtePageName("Module Configuration");
			hrmModulesPage.clickonleavemodetoggle("Leave");
			hrmModulesPage.clickOnSaveButton();
			hrmModulesPage.validateModuleRemoved("Leave");
			
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking module link");
		}
		
	}
		
	}
	

