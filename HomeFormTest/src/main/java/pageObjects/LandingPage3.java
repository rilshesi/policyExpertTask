package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage3 {
	
	public WebDriver driver;
	
	private By address = By.xpath("//input[@id='property_address']");
	private By addressList = By.xpath("//ul[@role='listbox']/li");
	private By address1 = By.xpath("//div[@class='DropdownListstyle__ComboboxContainer-sc-116wfhe-0 gcyVJK']/div[1]");
	private By addressList1 = By.xpath("//div[@class='DropdownListstyle__ComboboxContainer-sc-116wfhe-0 gcyVJK']/ul[1]/li");
	private By page3Yes1 = By.xpath("//div[@id='correspondence_address_ui_only']/*[@aria-label='Yes']");
	private By propertyType = By.xpath("//div[@id='property_type']//*[@aria-label='House']");
	private By propertyDes = By.xpath("//button[contains(text(),'Detached house')]");
	private By properAge = By.xpath("//input[@id='age_of_property.year']");
	private By bedrooms = By.xpath("//div[@data-testid='question'][6]/div/div[1]/div[1]");
	private By bedroomNum = By.xpath("//div[@data-testid='question'][6]/div/div[1]/div[1]/div/ul/li");
	private By bath = By.xpath("//div[@data-testid='question'][6]/div/div[2]/div[1]");
	private By bathNum = By.xpath("//div[@data-testid='question'][6]/div/div[2]/div[1]/div/ul/li");
	private By mainResidentYes = By.xpath("//div[@id='property_use_q']/*[@aria-label='Yes']");
	private By proptyOnwer = By.xpath("//button[contains(text(),'Yes, I own the property outright')]");
	private By proptyOccupier = By.xpath("//button[contains(text(),'You as sole occupier')]");
	private By proptyOccupier1 = By.xpath("//button[contains(text(),'Not by me, by tenant(s)')]");
	private By overAge = By.xpath("//button[@name='number_of_adults_in_property']");
	private By overAgeList = By.xpath("//div[@class='DropdownListstyle__ComboboxContainer-sc-116wfhe-0 gcyVJK']/ul/li");
	private By underAge = By.xpath("//button[@name='number_of_children_in_property']");
	private By underAgeOutView = By.xpath("//label[contains(text(),'How many adults aged 18 or over live at your property?')]");
	private By underAgeList = By.xpath("//div[@class='DropdownListstyle__ComboboxContainer-sc-116wfhe-0 eATrml']/ul/li");
	private By ResidentSmokeYes = By.xpath("//div[@id='does_anyone_in_property_smoke']/button[2]");
	private By occupyTime = By.xpath("//form[@class='Sectionstyle__Form-sc-b4fcid-1 gpMa-dU']/div[13]/div");
	private By TreesNo = By.xpath("//div[@id='trees_within_5m']//button[@type='button'][contains(text(),'No')]");
	private By FlatRoofNo = By.xpath("//div[@id='flat_roof_no']//button[@type='button'][contains(text(),'No')]");
	private By ConcreteYes = By.xpath("//div[@id='walls_type_standard']//button[@type='button'][contains(text(),'Yes')]");
	private By tile_Slate = By.xpath("//div[@id='roof_type_standard']//button[@type='button'][contains(text(),'Yes')]");
	private By wellMainte = By.xpath("//div[@id='property_state_of_repair']//button[@type='button'][contains(text(),'Yes')]");
	private By next3 = By.xpath("//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']");
	

	//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']
	//div[@id='roof_type_standard']//button[@type='button'][contains(text(),'Yes')]
	//div[@id='property_state_of_repair']//button[@type='button'][contains(text(),'Yes')]
	public LandingPage3(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	
	public WebElement getAddress()
	{
		return driver.findElement(address);
	}
	
	public List<WebElement> getaddressList()
	{
		return driver.findElements(addressList);
	}
	
	public WebElement getAddress1()
	{
		return driver.findElement(address1);
	}
	
	public List<WebElement> getaddressList1()
	{
		return driver.findElements(addressList1);
	}
	
	public WebElement getPage3Yes1()
	{
		return driver.findElement(page3Yes1);
	}
	
	public WebElement getpropertyType()
	{
		return driver.findElement(propertyType);
	}
	
	public WebElement getpropertyDes()
	{
		return driver.findElement(propertyDes);
	}
	
	public WebElement getproperAge()
	{
		return driver.findElement(properAge);
	}
	
	public WebElement getbedrooms()
	{
		return driver.findElement(bedrooms);
	}
	
	public List<WebElement> getbedroomNum()
	{
		return driver.findElements(bedroomNum);
	}
	
	public WebElement getbath()
	{
		return driver.findElement(bath);
	}
	
	public List<WebElement> getbathNum()
	{
		return driver.findElements(bathNum);
	}
	
	public WebElement getmainResidentYes()
	{
		return driver.findElement(mainResidentYes);
	}
	
	public WebElement getproptyOnwer()
	{
		return driver.findElement(proptyOnwer);
	}
	
	public WebElement getproptyOccupier()
	{
		return driver.findElement(proptyOccupier);
	}
	
	public WebElement getproptyOccupier1()
	{
		return driver.findElement(proptyOccupier1);
	}
	
	public WebElement getOverAge()
	{
		return driver.findElement(overAge);
	}
	
	public List<WebElement> getOverAgeList()
	{
		return driver.findElements(overAgeList);
	}
	
	public WebElement getUnderAge()
	{
		return driver.findElement(underAge);
	}
	
	public WebElement getUnderAgeOutView()
	{
		return driver.findElement(underAgeOutView);
	}
	
	public List<WebElement> getUnderAgeList()
	{
		return driver.findElements(underAgeList);
	}
	
	public WebElement getResidentSmokeYes()
	{
		return driver.findElement(ResidentSmokeYes);
	}
	
	public WebElement getoccupyTime()
	{
		return driver.findElement(occupyTime);
	}
	
	
	public WebElement getTreesNo()
	{
		return driver.findElement(TreesNo);
	}
	
	
	public WebElement getFlatRoofNo()
	{
		return driver.findElement(FlatRoofNo);
	}
	
	
	public WebElement getConcreteYes()
	{
		return driver.findElement(ConcreteYes);
	}
	
	
	public WebElement getTile_Slate()
	{
		return driver.findElement(tile_Slate);
	}
	
	

	public WebElement getWellMainte()
	{
		return driver.findElement(wellMainte);
	}
	
	
	
	public WebElement getNext3()
	{
		return driver.findElement(next3);
	}

}
