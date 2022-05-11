package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage1 {

	
	public WebDriver driver;
	
	private By title=By.xpath("//div[@id='title']/button");
	private By firstName=By.id("first_name");
	private By last_name=By.id("last_name");
	private By DOB = By.xpath("//div[@data-testid='policyholder_date_of_birth']//*[@type='number']");
	private By mm = By.xpath("//input[@id='policyholder_date_of_birth.month']");
	private By maritalStat = By.xpath("//div[@id='marital_status']/button");
	private By occupation = By.xpath("//input[@name='occupation']");
	private By occupaSuggest = By.xpath("//ul[@id='downshift-0-menu']/li");
	private By otherOccu = By.xpath("//button[contains(text(),'No')]");
	private By mobile = By.cssSelector("#primary_phone_number");
	private By email = By.xpath("//input[@id='customer_email']");
	private By next = By.xpath("//button[contains(text(),'Next')]");
	
	
	
	public LandingPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




//	public LoginPage getLogin()
//	{
//		 driver.findElement(signin).click();
//		 LoginPage lp=new LoginPage(driver);   //Login page is linked with Landing page so it can have access to LoginPage Object
//		 return lp;	 
//	}
	
	public List<WebElement> getTitle()
	{
		return driver.findElements(title);
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement last_name()
	{
		return driver.findElement(last_name);
	}
	
	public List<WebElement> getDOB()
	{
		return driver.findElements(DOB);
	}
	
	public WebElement getMonth()
	{
		return driver.findElement(mm);
		
	}

	public List<WebElement> getMaritalStat()
	{
		return driver.findElements(maritalStat);
	}
	
	
	public WebElement getOccupation()
	{
		return driver.findElement(occupation);
	}
	
	public List<WebElement> getOccupaSuggest()
	{
		return driver.findElements(occupaSuggest);
	}
	
	public WebElement getOtherOccuNo()
	{
		return driver.findElement(otherOccu);
	}
	
	public WebElement getMobile()
	{
		return driver.findElement(mobile);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getNext()
	{
		return driver.findElement(next);
	}
	
	
}
