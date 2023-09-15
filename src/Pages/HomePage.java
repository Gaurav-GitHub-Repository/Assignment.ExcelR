package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Headers = By.xpath("//ul[@class='navigation-menu nav-right ']");
	
	public void head()
	{
		String vartxt = driver.findElement(Headers).getText();
		System.out.println(vartxt);
	
	}
}
