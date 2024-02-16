package bluedart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BL_consignee {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//click consignee
		
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/group/personal/addressconsignee\"]"))).click();
				
				// create a address in consignee
				
			      driver.findElement(By.xpath("//a[text()=\"CREATE\"]")).click(); 
			      Thread.sleep(5000);
				  driver.findElement(By.xpath("//input[@placeholder=\"Full Name\" and @id=\"name\"]")).sendKeys("Kiran"); 
				  driver.findElement(By.xpath("//input[@placeholder=\"Shipment to be Delivered to\"]")).sendKeys("Kiran"); 
				  driver.findElement(By.xpath("//input[@placeholder=\"Flat number, Floor, Apartment Name\"]")).sendKeys("N/6,Concore Apartments"); 
				  driver.findElement(By.xpath("//input[@placeholder=\"Street,Locality/Area Name\"]")).sendKeys("Neeladri 4th cross"); 
				  driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("560100"); Thread.sleep(5000); 
				  driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8645235412");
				  driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys("kiran@gmail.com");
				  driver.findElement(By.xpath("//button[text()=\"SUBMIT\"]")).click(); 
				  
				  
			 //alert
				  
				  WebElement Alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("consigneeAlert")));
				  String message = Alert.getText();
				  System.out.print("successmessage :-"+ message);
				  
				  //alert close
				  
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='CLOSE'])[2]"))).click();
				  
				  
				//consignee Address List search
				  
				  driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Arjun");
				  driver.findElement(By.xpath("//input[@placeholder=\"Pin Code\"]")).sendKeys("641026");
				  driver.findElement(By.xpath("//button[text()=\"SEARCH\"]")).click();
				  
				//address edit
				  
					Thread.sleep(4000);
					  driver.findElement(By.xpath("//a[@onclick=\"editConsigneeRow(1413041); \"]")).click();
					  Thread.sleep(5000);
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"KIRAN\"]"))).clear();
					  Thread.sleep(2000);
					  driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("Rohit");
					  driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys("rohit@gmail.com");
					  driver.findElement(By.xpath("//button[text()=\"SUBMIT\"]")).click();
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='CLOSE'])[2]"))).click();
					  
				//delete the address
					  
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick=\"deleteRowConsignee(1413081);\"]"))).click();
					Thread.sleep(3000);
					String get = driver.findElement(By.xpath("//span[text()=\"Are you sure you want to delete the Address?\"]")).getText();
					System.out.print(get);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"YES\"]"))).click();
					
				//Close the popup
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='CLOSE'])[2]"))).click();	  
				  
					  
	}

}
