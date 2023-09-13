package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import factory.PageinstancesFactory;
import pages.HrmAdminPage;
import pages.HrmEmailSubscriptionPage;

public class HrmEmailSubscriptionTest extends BaseTest {

	@Test(groups = { "SmokeTest" }, testName = "TS 02 TC 01")
	public void clickonLeaveapplication() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage = new HrmEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickOnEmailSub();
			hrmEmailSubscriptionPage.clickOnLeaveApplicationAction();
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickOnDelete();
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickOnAddButton();
			hrmEmailSubscriptionPage.enterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.enterName("sanjay");
			hrmEmailSubscriptionPage.clickOnSubmit();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave application functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 02 TC 02")
	public void clickonLeaveapprovals() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage = new HrmEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickOnEmailSub();
			hrmEmailSubscriptionPage.clickOnLeaveapprovalsAction();
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickOnDelete();
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickOnAddButton();
			hrmEmailSubscriptionPage.enterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.enterName("sanjay");
			hrmEmailSubscriptionPage.clickOnSubmit();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave approvals functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 02 TC 03")
	public void clickonLeaveassignments() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage = new HrmEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickOnEmailSub();
			hrmEmailSubscriptionPage.clickOnLeaveAssignmentAction();
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickOnDelete();
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickOnAddButton();
			hrmEmailSubscriptionPage.enterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.enterName("sanjay");
			hrmEmailSubscriptionPage.clickOnSubmit();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave assignments functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 02 TC 04")
	public void clickonLeavecancellation() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage = new HrmEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickOnEmailSub();
			hrmEmailSubscriptionPage.clickOnLeaveCancellationsAction();
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickOnDelete();
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickOnAddButton();
			hrmEmailSubscriptionPage.enterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.enterName("sanjay");
			hrmEmailSubscriptionPage.clickOnSubmit();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave cancellation functionality");
		}
	}

	@Test(groups = { "Regression Test" }, testName = "TS 02 TC 05")
	public void clickonLeaverejection() throws Exception {
		try {
			HrmAdminPage hrmAdminPage = PageinstancesFactory.getInstance(HrmAdminPage.class);
			hrmAdminPage.clickOnAdmin();
			hrmAdminPage.clickOnConfig();
			HrmEmailSubscriptionPage hrmEmailSubscriptionPage = new HrmEmailSubscriptionPage(driver);
			hrmEmailSubscriptionPage.clickOnEmailSub();
			hrmEmailSubscriptionPage.clickOnLeaveRejectionsAction();
			while (true) {
				if (driver.findElements(By.xpath("//i[contains(@class,'oxd-icon bi-trash')]")).size() != 0) {
					hrmEmailSubscriptionPage.clickOnDelete();
				} else {
					break;
				}
			}
			hrmEmailSubscriptionPage.clickOnAddButton();
			hrmEmailSubscriptionPage.enterEmailName("sanjay.bhatv@gmail.com");
			hrmEmailSubscriptionPage.enterName("sanjay");
			hrmEmailSubscriptionPage.clickOnSubmit();
		} catch (Exception e) {
			throw new Exception("Error occurred while the user validating leave rejection functionality");
		}
	}
}
