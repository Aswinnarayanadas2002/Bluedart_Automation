package bluedart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends BL_ScheduleAPickup{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluedart.com");
		driver.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-toggle btn-less"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Personal']"))).click();
		WebElement Enter = driver.findElement(By.xpath("//input[@class=\"field clearable form-control\" and @id=\"_com_liferay_login_web_portlet_LoginPortlet_mobileNo\"]"));
		//WebElement Enter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"field clearable form-control\" and @id=\"_com_liferay_login_web_portlet_LoginPortlet_mobileNo\"]"))).click();
		Enter.sendKeys("8754762544");
		Enter.sendKeys(Keys.TAB);
		Thread.sleep(25000);
		schedulepickup(driver);
		    
	}

}
