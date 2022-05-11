package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage6 {
	
	public WebDriver driver;
	
	private By jointPolicyNo = By.xpath("//button[contains(text(),'No')]");
	private By next6  = By.xpath("//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']");
	
	
	
	
	
	
	
	public LandingPage6(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	
	public WebElement getjointPolicyNo()
	{
		return driver.findElement(jointPolicyNo);
	}
	
	
	public WebElement getnext6()
	{
		return driver.findElement(next6);
	}
	

	


}
