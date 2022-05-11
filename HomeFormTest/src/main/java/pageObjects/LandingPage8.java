package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage8 {
	
	public WebDriver driver;
	
	private By starDate = By.xpath("//button[contains(text(),'Tomorrow')]");
	private By insureType  = By.xpath("//button[contains(text(),'Contents only')]");
	private By cost  = By.xpath("//input[@id='contents_si']");
	private By upgradeNo  = By.xpath("//div[@id='contents_accidental_damage']//button[@type='button'][contains(text(),'No')]");
	private By enoyghToYes  = By.xpath("//div[@id='valuables_total_cover_q']//button[@type='button'][contains(text(),'Yes')]");
	private By worthOverNo  = By.xpath("//div[@id='more_than_2000']//button[@type='button'][contains(text(),'No')]");
	private By bicycleCoveNo  = By.xpath("//div[@id='bicycle_cover']//button[@type='button'][contains(text(),'No')]");
	private By coverAwayHomeNo  = By.xpath("//div[@id='unspecified_items_branch']//button[@type='button'][contains(text(),'No')]");
	private By viewQuote  = By.xpath("//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']");
	
	
	
	//div[@id='unspecified_items_branch']//button[@type='button'][contains(text(),'No')]
	
	
	public LandingPage8(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	
	public WebElement getstarDate()
	{
		return driver.findElement(starDate);
	}
	
	
	public WebElement getinsureType()
	{
		return driver.findElement(insureType);
	}
	
	
	public WebElement getcost()
	{
		return driver.findElement(cost);
	}
	
	
	public WebElement getupgradeNo()
	{
		return driver.findElement(upgradeNo);
	}
	
	
	public WebElement getenoyghToYes()
	{
		return driver.findElement(enoyghToYes);
	}
	
	
	public WebElement getworthOverNo()
	{
		return driver.findElement(worthOverNo);
	}
	
	
	public WebElement getbicycleCoveNo()
	{
		return driver.findElement(bicycleCoveNo);
	}
	
	
	public WebElement getcoverAwayHomeNo()
	{
		return driver.findElement(coverAwayHomeNo);
	}
	
	
	public WebElement getviewQuote()
	{
		return driver.findElement(viewQuote);
	}

	


}
