package bluedart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrackMyOrder {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver = new ChromeDriver();
          

		
		//track my order
		  driver.findElement(By.xpath("//a[text()=\"Track My Order\"]")).click();
		  
		  //NAVIGATE TO ANOTHER PAGE
//	  Set<String> window = driver.getWindowHandles();
//	  Iterator<String> handle= window.iterator();
//		  String parentpage = handle.next();
//		  String childpage = handle.next();
//		  driver.switchTo().window(childpage);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//select[@class=\"form-control\"])[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//option[text()=\"Past 3 Months\"]")).click();
		  
		  //STATUS
		 driver.findElement(By.xpath("(//select[@class=\"form-control\"])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//option[text()=\"Success\"]")).click();
		  //transaction id
		 driver.findElement(By.xpath("//input[@placeholder=\"Enter Transaction Id\"]")).sendKeys("2567254");
		 //click search
		 driver.findElement(By.xpath("//button[text()=\"SEARCH\"]")).click();
		 
		 //get text of the error message
		 Thread.sleep(2000);
		 String error = driver.findElement(By.xpath("//td[text()=\"No matching records found\"]")).getText();
		 System.out.print("Print ="+ error);
		 
		  
		

	}

}
