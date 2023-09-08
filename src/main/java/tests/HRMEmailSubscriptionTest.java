package tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HRMAdminPage;
import pages.HRMEmailSubscriptionPage;


public class HRMEmailSubscriptionTest extends BaseTest {
	
	@Test
	public void clickonLeaveapplication() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailSubscriptionPage hrmEmailSubscriptionPage=new HRMEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickonEmailsub();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.clickonleaveApplicationAction();
			Thread.sleep(2000);
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickondelete();
					Thread.sleep(2000);
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickonaddbutton();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.EnterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.EnterName("sanjay");
			hrmEmailSubscriptionPage.clickonsubmit();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave application functionality");
		}
		
	}
	
	@Test
	public void clickonLeaveapprovals() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailSubscriptionPage hrmEmailSubscriptionPage=new HRMEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickonEmailsub();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.clickonleaveapprovalsAction();
			Thread.sleep(2000);
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickondelete();
					Thread.sleep(2000);
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickonaddbutton();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.EnterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.EnterName("sanjay");
			hrmEmailSubscriptionPage.clickonsubmit();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave approvals functionality");
		}
		
	}
	
	@Test
	public void clickonLeaveassignments() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailSubscriptionPage hrmEmailSubscriptionPage=new HRMEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickonEmailsub();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.clickonleaveAssignmentAction();
			Thread.sleep(2000);
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickondelete();
					Thread.sleep(2000);
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickonaddbutton();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.EnterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.EnterName("sanjay");
			hrmEmailSubscriptionPage.clickonsubmit();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave assignments functionality");
		}
		
	}
	
	@Test
	public void clickonLeavecancellation() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailSubscriptionPage hrmEmailSubscriptionPage=new HRMEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickonEmailsub();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.clickonleaveCancellationsAction();
			Thread.sleep(2000);
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickondelete();
					Thread.sleep(2000);
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickonaddbutton();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.EnterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.EnterName("sanjay");
			hrmEmailSubscriptionPage.clickonsubmit();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave cancellation functionality");
		}
		
	}
	
	@Test
	public void clickonLeaverejection() throws Exception  {
		try {
			HRMAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HRMAdminPage.class);
			hrmAdminPage.clickadmin();
			Thread.sleep(2000);
			hrmAdminPage.clickonconfig();
			Thread.sleep(2000);
			HRMEmailSubscriptionPage hrmEmailSubscriptionPage=new HRMEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickonEmailsub();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.clickonleaveRejectionsAction();
			Thread.sleep(2000);
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickondelete();
					Thread.sleep(2000);
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickonaddbutton();
			Thread.sleep(2000);
			hrmEmailSubscriptionPage.EnterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.EnterName("sanjay");
			hrmEmailSubscriptionPage.clickonsubmit();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave rejection functionality");
		}
		
	}
	
	
	
		
		
	}
	

