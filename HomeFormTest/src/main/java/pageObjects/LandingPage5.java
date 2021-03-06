package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage5 {
	
	public WebDriver driver;
	
	private By windowSec = By.xpath("//div[@id='property_windows_locks']//button[@type='button'][contains(text(),'No')]");
	private By windowSec1 = By.xpath("//div[@id='property_windows_locks']//button[@type='button'][contains(text(),'No')]");
	private By self_contained  = By.xpath("//div[@id='self_contained']//button[@type='button'][contains(text(),'No')]");
	private By FrenchPatio = By.xpath("//div[@id='sliding_door']//button[@type='button'][contains(text(),'No')]");
	private By  externalDoors = By.xpath("//div[@id='other_external_doors_branch_question']//button[@type='button'][contains(text(),'No')]");
	private By burglaralarm = By.xpath("//div[@id='property_alarm']//button[@type='button'][contains(text(),'No')]");
	private By next5 = By.xpath("//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']");
	
	
	
	
	
	
	public LandingPage5(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	
	public WebElement getwindowSec()
	{
		return driver.findElement(windowSec);
	}
	
	
	public WebElement getwindowSec1()
	{
		return driver.findElement(windowSec);
	}
	
	
	public WebElement getself_contained()
	{
		return driver.findElement(self_contained);
	}
	
	
	public WebElement getFrenchPatio()
	{
		return driver.findElement(FrenchPatio);
	}
	
	
	public WebElement getexternalDoors()
	{
		return driver.findElement(externalDoors);
	}
	
	
	public WebElement getburglaralarm()
	{
		return driver.findElement(burglaralarm);
	}
	
	
	public WebElement getnext5()
	{
		return driver.findElement(next5);
	}
	


}
