package tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmEmailSubscriptionPage;


public class HrmEmailSubscriptionTest extends BaseTest {
	
	@Test(groups ={"SmokeTest"},testName = "TS 02 TC 01")
	public void clickonLeaveapplication() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage=new HrmEmailSubscriptionPage(driver);
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
	
	@Test(groups ={"Regression Test"},testName = "TS 02 TC 02")
	public void clickonLeaveapprovals() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage=new HrmEmailSubscriptionPage(driver);
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
	
	@Test(groups ={"Regression Test"},testName = "TS 02 TC 03")
	public void clickonLeaveassignments() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage=new HrmEmailSubscriptionPage(driver);
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
	
	@Test(groups ={"Regression Test"},testName = "TS 02 TC 04")
	public void clickonLeavecancellation() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage=new HrmEmailSubscriptionPage(driver);
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
	
	@Test(groups ={"Regression Test"},testName = "TS 02 TC 05")
	public void clickonLeaverejection() throws Exception  {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			Thread.sleep(2000);
			hrmAdminPage.clickOnConfig();
			Thread.sleep(2000);
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage=new HrmEmailSubscriptionPage(driver);
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
	

