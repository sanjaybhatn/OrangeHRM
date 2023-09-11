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
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmModulesPage hrmModulesPage=new HrmModulesPage(driver);
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
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmModulesPage hrmModulesPage=new HrmModulesPage(driver);
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
	

