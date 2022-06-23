package LoginPage;

import pageObjects.loginPageObjects;
import org.testng.annotations.Test;
import utils.Constants;
import utils.publicLibrary;

public class loginPage extends publicLibrary{
	
	//WebDriver driver;
	
	loginPageObjects loginobj = new loginPageObjects();
	
	
	@Test
	public void login()
	{
		openBrowser("chrome");
		driver.get(Constants.url);
		driver.manage().window().maximize();
		
		loginobj.enterUsername("praveenponduru144@gmail.com");
		loginobj.enterPassword("test");
		loginobj.selectEmpRole();
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_accountLogin")));
		loginobj.loginClick();
		//WebDriverWait wait1 = new WebDriverWait(driver, 7);
		
		loginobj.logoutClick();
				
		//driver.quit();
	}
	
	
	
	
}
