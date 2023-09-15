package Tests;

import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.Product;
import Pages.ProductFeatures;

public class TestCase {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Selenium Temp\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	    driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory");
	
		HomePage homepage = new HomePage(driver);
	    homepage.head();
	 
	    Product product = new Product(driver);
	    product.workDropDown();
	    
	    Thread.sleep(1000);
	    product.selectproduct();
	    
	    Thread.sleep(5000);
	    product.window_btn();
	    

	    
	    
//	    Thread.sleep(5000);
//	    product.btn();
	   
	 
//	    product.appButton();
//	    System.out.println("Product Button is clicked");
	    
//	    driver.navigate().to("https://startupfo.rest/white-label-telemedicine-app/");
	    
//	    ProductFeatures profeature = new ProductFeatures(driver);
//	    Thread.sleep(1000);
//	    profeature.featureBtn();
	}

}
