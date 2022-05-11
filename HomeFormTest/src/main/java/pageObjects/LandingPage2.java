package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage2 {
	
	public WebDriver driver;
	
	private By page2No = By.xpath("//button[contains(text(),'No')]");
	private By page2Next = By.xpath("//button[contains(text(),'Next')]");
	
	
	public LandingPage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	
	
	
	
	
	public WebElement getOtherResident()
	{
		return driver.findElement(page2No);
	}
	
	public WebElement getPage2Next()
	{
		return driver.findElement(page2Next);
	}

}
