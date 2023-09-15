package Pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Product {

 private static Logger log = LogManager.getLogger(Product.class.getName());	
	
 WebDriver driver;

 public Product(WebDriver driver)
 {
	this.driver=driver; 
 }
	

 By work = By.xpath("//div[@id='navigation']/ul/li[5]");
 By Products = By.xpath("//span[text()='products']");
 By window = By.xpath("//h2[text()='StartupForest - Launch Quickly with Whitelabel Solution']"); 
 By DemoButton = By.xpath("//*[@id='home']/div/div/div[1]/div/div/a[1]");
// By docApp = By.xpath("//a[@href='white-label-telemedicine-app/']/img");                    		 
 
 public void workDropDown()
 {
	 driver.findElement(work).click();
 }
 
 public void selectproduct()
 {
	driver.findElement(Products).click(); 
	System.out.println("Successfully clicked on product");
	
 }
 
 public void window_btn()
 {
	 driver.findElement(window).click();
 }
 

 
 
// public void btn()
// {
//     WebElement frame_element = driver.findElement(By.xpath("//iframe[@src='https://www.googletagmanager.com/ns.html?id=GTM-PTLV7TB']"));
//	 driver.switchTo().frame(frame_element);
	
//	 driver.findElement(DemoButton).click();
//	 log.error("Error Occured");
//	 log.info("Error Occured");
// }

// public void appButton()
 //{
	 
	 
//	JavascriptExecutor jse = (JavascriptExecutor)driver;  
//	jse.executeScript("arguments[0].scrollIntoView();", docApp);
	 
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6)); 
//	wait.until(ExpectedConditions.elementToBeClickable(docApp));
//	driver.findElement(docApp).click();
//	log.error("Error Occured TimeoutException");
//	log.info("Error Occured");
// }
 }
