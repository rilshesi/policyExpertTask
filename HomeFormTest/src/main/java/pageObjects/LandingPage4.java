package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage4 {
	
	public WebDriver driver;
	
	private By question4 = By.xpath("//button[contains(text(),'No')]");
	private By next4 = By.xpath("//button[@class='styled__PrimaryButton-sc-qy8nbl-2 Sectionstyle__PrimaryButton-sc-b4fcid-4 lcLfTk fPpkjj']");
	
	
	
	
	
	
	
	public LandingPage4(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	
	public WebElement getquestion4()
	{
		return driver.findElement(question4);
	}
	
	public WebElement getnext4()
	{
		return driver.findElement(next4);
	}
	


}
