package tests;

import org.testng.annotations.Test;



import factory.PageinstancesFactory;
import pages.HRMAdminPage;
import pages.HRMModulesPage;


public class HRMModulesTest extends BaseTest {
	
	@Test(groups ={"SmokeTest"},testName = "TS 04 TC 01")
	public void valiadtemodules() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMModulesPage hrmModulesPage=new HRMModulesPage(driver);
			hrmModulesPage.clickonmoduleslink();
			Thread.sleep(2000);
			hrmModulesPage.valiadtepagename("Module Configuration");
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking module link");
		}
		
	}
	@Test(groups ={"Regression Test"},testName = "TS 04 TC 02")
	public void valiadtemodulestoggle() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMModulesPage hrmModulesPage=new HRMModulesPage(driver);
			hrmModulesPage.clickonmoduleslink();
			Thread.sleep(2000);
			hrmModulesPage.valiadtepagename("Module Configuration");
			hrmModulesPage.clickonleavemodetoggle("Leave");
			Thread.sleep(1000);
			hrmModulesPage.clickonsavebutton();
			Thread.sleep(5000);
			hrmModulesPage.validatemoduleremoved("Leave");
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking module link");
		}
		
	}
		
	}
	

