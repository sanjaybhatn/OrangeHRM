package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import factory.WebDriverContext;
import listeners.LogListener;
import listeners.ReportListener;
import util.LoggerUtil;
import util.TestProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({ ReportListener.class, LogListener.class })
public class BaseTest {

	protected WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void globalSetup() {
		LoggerUtil.log("************************** Test Execution Started ************************************");
		TestProperties.loadAllPropertie();
	}

	@AfterSuite(alwaysRun = true)
	public void wrapAllUp(ITestContext context) {
		int total = context.getAllTestMethods().length;
		int passed = context.getPassedTests().size();
		int failed = context.getFailedTests().size();
		int skipped = context.getSkippedTests().size();
		LoggerUtil.log("Total number of testcases : " + total);
		LoggerUtil.log("Number of testcases Passed : " + passed);
		LoggerUtil.log("Number of testcases Failed : " + failed);
		LoggerUtil.log("Number of testcases Skipped  : " + skipped);
		LoggerUtil.log("************************** Test Execution Finished ************************************");
	}

	@BeforeMethod
	protected void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("disable-infobars");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverContext.setDriver(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(15000);
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		login.sendKeys("Admin");
		pass.sendKeys("admin123");
		submit.click();

	}

	@AfterMethod
	public void wrapUp() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
