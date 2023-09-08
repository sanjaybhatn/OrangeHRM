package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HRMAdminPage;


public class HRMAdminTest extends BaseTest {
	
	@Test
	public void clickonAdmin() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking admin link");
		}
		
	}
	
	
	

	
		
		
	}
	

