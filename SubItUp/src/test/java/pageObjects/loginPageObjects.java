package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.publicLibrary;

public class loginPageObjects extends publicLibrary {
	By username = By.xpath("//div[@class='mb-3 mt-3']//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.id("login_accountLogin");
	By employeeRadio = By.xpath("//div//div[@class='mb-3']//div//input[@name='accountType'][@value='employee']");
	By logoutButton = By.cssSelector("[aria-label='Logout']");
	
	public void enterUsername(String loginEmail)
	{
		driver.findElement(username).sendKeys(loginEmail);
	}
	public void enterPassword(String loginPassword)
	{
		driver.findElement(password).sendKeys(loginPassword);
	}
	public void selectEmpRole()
	{
		//driver.findElement(employeeRadio).click();
		clickElement(employeeRadio, "User Role", false);
	}
	public void loginClick()
	{
		driver.findElement(loginButton).click();
	}
	public void logoutClick()
	{
		driver.findElement(logoutButton).click();
	}
	
}
