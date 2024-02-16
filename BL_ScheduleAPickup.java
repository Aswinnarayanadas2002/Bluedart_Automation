package bluedart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BL_ScheduleAPickup {

	public static void schedulepickup(WebDriver driver) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//click the Schedule a pickup
				driver.findElement(By.xpath("//a[text()=\"Schedule a Pickup\"]")).click();
				
				//click advanced search of From
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@data-tooltip=\"Advanced Search\"])[1]"))).click();
				
				//click the reset
				//driver.findElement(By.xpath("(//a[text()=\"RESET\"])[3]")).click();
				 
		 		//fill the values in the advanced search 
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Name\"])[3]"))).sendKeys("ACHU");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Address Line 1\"])[2]"))).sendKeys("20,NSK STREET");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Pincode\"])[3]"))).sendKeys("641011");
				
				//click the search button 
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//a[text()=\"SEARCH\"])[3]")).click();
				
				//click the radio button
				Thread.sleep(5000);
				driver.findElement(By.id("rad_1413849,CJB,000000")).click();
				
				
				//click advanced search of TO
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class=\"input-group-addon\" and @data-tooltip=\"Advanced Search\"])[2]"))).click();
				
				//fill the values in To field
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Name\"])[4]"))).sendKeys("ROHIT");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Pincode\"])[4]"))).sendKeys("560100");
				
				//click the search
				driver.findElement(By.xpath("(//a[text()=\"SEARCH\"])[4]")).click();
				
				//click the reset
				//driver.findElement(By.xpath("(//a[text()=\"RESET\"])[4]")).click();
				
				//CLICK THE RADIO BUTTON
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id=\"rad_1413041,null,null\" and @onclick=\"loadConsigneeDetailCallBySearch('1413041,null,null','560100')\"]")).click();
				
				//Enter the weight
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@placeholder=\"kgs\"]")).sendKeys("53");
				
				   //volume weight calculator
//				    driver.findElement(By.id("WeightPopup")).click();
//				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"packages_1\"]"))).sendKeys("2");
//				    driver.findElement(By.xpath("//input[@id=\"height_1\"]")).sendKeys("999999");
//				    driver.findElement(By.xpath("//input[@id=\"length_1\"]")).sendKeys("876564");
//				    driver.findElement(By.xpath("//input[@id=\"width_1\"]")).sendKeys("879876");
//				    driver.findElement(By.xpath("//button[text()=\"CALCULATE\"]")).click();
//				    
				    //NEGATIVE TEST SCENARIO OF WEIGHT CALCULATOR
//				    Thread.sleep(2000);
//				    String print = driver.findElement(By.xpath("//div[text()=\"Please enter valid dimensions(Format: 000.00, Maximum value 999.99).\"]")).getText();
//				    System.out.print(print);
//				    driver.findElement(By.xpath("(//span[text()=\"×\"])[1]")).click();
				
				//enter the date of booking
				driver.findElement(By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]")).click();
				   //change the month
				   WebElement click = driver.findElement(By.xpath("(//th[text()=\"»\"])[1]"));
				   click.click();
				   Thread.sleep(3000);
				   click.click();
				   Thread.sleep(3000);
				   click.click();
				   //choose the date
				  driver.findElement(By.xpath("(//td[text()=\"17\"])[1]")).click();
				   
			//enter the time
				   Thread.sleep(4000);
				   driver.findElement(By.xpath("//input[@placeholder=\"--:-- AM/PM\"]")).click();
				    //choose the time
		     	    Thread.sleep(5000);
		    	    driver.findElement(By.xpath("//li[text()=\"01:00 PM\"]")).click();
			    
				   
		    //Click the find button 
				    driver.findElement(By.xpath("//button[text()=\"FIND\"]")).click();
				    
		    //Click the reset button 
				    //driver.findElement(By.xpath("(//button[text()=\"RESET\"])[2]")).click();
				    
			//Transit Time And Price Finder Information
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//input[@onclick=\"valueAddedServiceLoad('A','9636.0');\"]")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//input[@onclick=\"getSelectedSubProd('A','Smart%20Box%2025','undefined','B');\"]")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("(//button[text()=\"CONTINUE\"])[2]")).click();
				    
			//Shipper information
				    //CLICK THE SCHEDULE A PICKUP
				    //driver.findElement(By.xpath("//a[text()=\"SCHEDULE A PICKUP\"]")).click();
				    //CLICK THE BOOK A SHIPMENT
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//a[normalize-space()=\"BOOK A SHIPMENT\"]")).click();
				    
				
				
	
	}

}
