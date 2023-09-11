package tests;

import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;


public class HrmAdminTest extends BaseTest {
	
	@Test
	public void clickonAdmin() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user clicking admin link");
		}
		
	}
	
	
	

	
		
		
	}
	

