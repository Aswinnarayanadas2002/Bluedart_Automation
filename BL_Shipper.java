package bluedart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BL_Shipper {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//click address Book
				driver.findElement(By.xpath("//a[text()=\"AddressBook\"]")).click();
				
				//click shipper options
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()=\"Shipper\"]"))).click();
				
				//Click create button in the shipper option
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()=\"CREATE\"]"))).click();
				
				//Enter the data in all the fields
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("Amrutha");
				driver.findElement(By.xpath("//input[@placeholder=\"Shipment to be Pickuped from\"]")).sendKeys("Amrutha");
				driver.findElement(By.xpath("//input[@placeholder=\" Flat number, Floor, Apartment Name\"]")).sendKeys("14,West Apartment");
				driver.findElement(By.xpath("//input[@placeholder=\"Street,Locality/Area Name\"]")).sendKeys("Selevapuram");
				driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("691020");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8754762599");
				driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys("amrutha@gmail.com");
				driver.findElement(By.xpath("//select[@class=\"form-control\"]")).click();
				driver.findElement(By.xpath("//option[text()=\"--SELECT--\"]")).click();
				Thread.sleep(3000);
				WebElement tab = driver.findElement(By.xpath("//option[text()=\"6:00 P.M.\"]"));
				tab.click();
				//tab.sendKeys(Keys.TAB);
				Thread.sleep(2000);
				
				//click submit
				driver.findElement(By.xpath("//button[@class=\"btn btn-success\" and @id=\"submitAddShipperAddressBtn\"]")).click();
				
				//click cancel
				
				//driver.findElement(By.xpath("//button[text()=\"CANCEL\"]")).click();
				
				//click reset
				
				//driver.findElement(By.xpath("//button[text()=\"RESET\"]")).click();
				
				//print the text in that is in the alert
				
			  Thread.sleep(2000); String printText = driver.findElement(By.
			  xpath("//span[text()=\"Shipper address created successfully.\"]")).getText();
			  System.out.print("print :-"+ printText);
			

				//handling alert
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[text()=\"CLOSE\"])[2]")).click();
				
				//Search by name in the Address list
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Amrutha");
				
				//search by address in the Adderess list
				driver.findElement(By.xpath("//input[@placeholder=\"Address Line 1\"]")).sendKeys("14,West Apartment");
				
				//search by pincode in the address list
				driver.findElement(By.xpath("//input[@placeholder=\"Pin Code\"]")).sendKeys("641020");
				
				//click the search button 
				driver.findElement(By.xpath("//button[text()=\"SEARCH\"]")).click();
				
				//Search by name in the Address list
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Amrutha");//name change into AmruthaRajan//
				
				//search by address in the Adderess list
				driver.findElement(By.xpath("//input[@placeholder=\"Address Line 1\"]")).sendKeys("14,West Apartment");
				
				//search by pincode in the address list
				driver.findElement(By.xpath("//input[@placeholder=\"Pin Code\"]")).sendKeys("691020");
				
				//click the search button 
				driver.findElement(By.xpath("//button[text()=\"SEARCH\"]")).click();
				
				//click edit button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
				
				//edit name
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("AmruthaRajan");
				Thread.sleep(1500);
				driver.findElement(By.xpath("//button[@class=\"btn btn-success modalCloseBtnShow\" and @id=\"submitUpdateShipperAddressBtn\"]")).click();
				
				//handeling alert
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[text()=\"CLOSE\"])[2]")).click();
				
				//click the delete button
				driver.findElement(By.xpath("(//a[text()=\"Delete\"])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()=\"YES\"]")).click();
				driver.findElement(By.xpath("(//button[text()=\"CLOSE\"])[2]")).click();
				

	}

}

