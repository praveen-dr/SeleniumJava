package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SubItUp\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.subitup.com");
		
		driver.findElement(By.cssSelector("a[href='https://account.subitup.com'][class='button watchdemo']")).click();
		
		 // identify element and click()
	      
	      // explicit wait condition
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	      // presenceOfElementLocated condition
	      wait.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("a[href='https://account.subitup.com'][class='button watchdemo']")));
	      
	      WebElement login =driver.findElement(By.cssSelector("a[href='https://account.subitup.com'][class='button watchdemo']"));
	      login.click();
	      
	      driver.quit();
		
		
		//driver.quit();
		
	}

}
