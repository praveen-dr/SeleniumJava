package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class publicLibrary {
	
	public static WebDriver driver;
	ExtentTest test;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("reports/Spark.html");
	
	
	public void reports() {
		extent.attachReporter(spark);
		test = extent.createTest("logsGeneration");
	}
	
	public void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
//			System.setProperty("wedriver.chrome.driver", System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+
//			File.separator+"drivers"+	File.separator+"chromedriver.exe");
			System.out.println("before driver");
//			System.setProperty("webdriver.chrome.driver", System.getProperty("D\\eclipse-workspace\\SubItUp\\src\\test\\resources\\drivers\\chromedriver.exe"));
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SubItUp\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("after driver");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("wedriver.gecko.driver", "D:\\eclipse-workspace\\SubItUp\\src\\main\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("wedriver.chrome.driver", System.getProperty("user.dir")+File.separator+"drivers"+
			File.separator+"chromedriver");
			driver = new ChromeDriver();
		}
	}
	
	
	public void clickElement(By element, String reporttext, boolean log )
	{
		try {
		driver.findElement(element).click();
		if(log) {
			test.log(Status.PASS, reporttext + "Element clicked");
			}
		}
		
		catch(Exception E)
		{
			test.log(Status.FAIL, reporttext + "Element not clicked");
		}
	}
	
}
