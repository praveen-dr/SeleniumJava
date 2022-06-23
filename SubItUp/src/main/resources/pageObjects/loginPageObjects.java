import org.openqa.selenium.By;
package pageObjects;

public class loginPageObjects {
	By username = By.xpath("//div[@class='mb-3 mt-3']//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.id("//button[@id='login_accountLogin']");
	
	public void enterUsername(String loginEmail)
	{
		driver.findElement(username).sendKeys(loginEmail);
	}
	public void enterPassword(String loginPassword)
	{
		driver.findElement(password).sendKeys(loginPassword);
	}
	public void loginClick()
	{
		driver.findElement(loginButton).click();
	}
	
}
