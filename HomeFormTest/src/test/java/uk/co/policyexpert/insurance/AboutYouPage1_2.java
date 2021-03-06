package uk.co.policyexpert.insurance;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.LandingPage1;
import pageObjects.LandingPage2;
import pageObjects.LandingPage3;
import pageObjects.LandingPage4;
import pageObjects.LandingPage5;
import pageObjects.LandingPage6;
import pageObjects.LandingPage7;
import pageObjects.LandingPage8;
import resources.base;
import test.listeners.L3;

public class AboutYouPage1_2 extends base {
	
	public WebDriver driver;
	LandingPage1 l=new LandingPage1(driver);
	LandingPage2 L=new LandingPage2(driver);
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 
	}
	
	
	@Test
	public void titleEntry()
	{
		l=new LandingPage1(driver);
		
		
		String title = prop.getProperty("title");
		
		int titleAll = l.getTitle().size();
		for(int i=0; i<titleAll; i++)
		{
			String titleText = l.getTitle().get(i).getText();
		
	
			if (titleText.equalsIgnoreCase(title))
			{
				l.getTitle().get(i).click();
			}
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		
	}	
	
	@Test	
	public void nameEntry()
	{
		l=new LandingPage1(driver);
		String firstName = prop.getProperty("firstName");
		l.firstName().sendKeys(firstName);
		
		String lastName = prop.getProperty("lastName");
		l.last_name().sendKeys(lastName);
	}
		
	
	
	@Test	
	public void dateEntry()
	{
		String dd = prop.getProperty("DD");
		String d = prop.getProperty("D");
		String mm = prop.getProperty("MM");
		String m = prop.getProperty("M");
		String yy = prop.getProperty("YYYY");
		String y = prop.getProperty("Y");
		l=new LandingPage1(driver);
		int dob = l.getDOB().size();
		
		for (int i=0; i<dob; i++){
			{
				String dob_text = l.getDOB().get(i).getAttribute("placeholder");
				
				if(dob_text.equalsIgnoreCase(dd))
				{
					l.getDOB().get(i).sendKeys(d);
				}
				
				else if(dob_text.equalsIgnoreCase(mm))
				{
					l.getDOB().get(i).sendKeys(m);
				}
				
				else if(dob_text.equalsIgnoreCase(yy))
				{
					l.getDOB().get(i).sendKeys(y);
				}
			}
		}	
		
	}
		
		

	
	@Test	
	public void maritalSatus()
	{
		l=new LandingPage1(driver);
		String maritalstat = prop.getProperty("maritalStatus").toLowerCase();
		
		int marryStat = l.getMaritalStat().size();
		
		for(int i=0; i<marryStat; i++)
		{
			String maritalstatus = l.getMaritalStat().get(i).getText().toLowerCase();
	
			if (maritalstatus.contains(maritalstat))
			{
				
				l.getMaritalStat().get(i).click();
			}
			
		}
	}
	
	
	
	
	@Test	
	public void occuaption() throws InterruptedException
	
	{
		String occupaSearch = prop.getProperty("occupationSearch");
		String occupationField = prop.getProperty("occupationField").toLowerCase();
		//System.out.println(occupaSearch);
		
		l.getOccupation().sendKeys(occupaSearch);
		Thread.sleep(3000L);
		List<WebElement> occSuggests = l.getOccupaSuggest();
		
		for(WebElement occSuggest : occSuggests)
		{
			
			l.getOccupation().sendKeys(Keys.ARROW_DOWN);
			String occupationList = occSuggest.getText().toLowerCase();
			
			if (occupationList.contains(occupationField))
			{
				occSuggest.click();
				break;
			}
			
		}
		// other occupation
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String scrit = "return document.getElementById(\"fromPlaceName\").value;";
	}
	
	
	@Test
	public void others() throws InterruptedException
	{
		l.getOtherOccuNo().click();
	
		l.getMobile().sendKeys(prop.getProperty("PhoneNumber"));
		l.getEmail().sendKeys(prop.getProperty("email"));
		l.getNext().click();
		
		
		
		//Page 2
		L=new LandingPage2(driver);
		L.getOtherResident().click();
		L.getPage2Next().click();
	}
	
				
	
	
	
	
	//About you Page 3
	@Test
	public void AboutYouPage3() throws InterruptedException
	{
		LandingPage3 l3 = new LandingPage3(driver);
		l3.getAddress().sendKeys("me45qg");
		Thread.sleep(3000L);
		List<WebElement> addressLists = l3.getaddressList();
		
		for(WebElement addressList : addressLists)
		{
			String addList = addressList.getText();
			System.out.println(addList);
			l3.getAddress().sendKeys(Keys.ARROW_DOWN);
			
			if (addList.contains("ME4 5QG, Glencoe Road, Chatham - 42 Addresses"))
			{
				addressList.click();
				break;
			}
			
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//ul[@role='listbox']/li"))));
//			
//					JavascriptExecutor js = (JavascriptExecutor)driver;
//					String scrit = "document.getElementsByClassName(\"DropdownListstyle__ResultListItem-sc-116wfhe-2 giJluw\").value";
//					String text = (String) js.executeScript(scrit);
//					System.out.println(text);
		
		}	
		
		Thread.sleep(5000L);
		
		
		
		
	List<WebElement> addressLists1 = l3.getaddressList1();
		
		for(WebElement addressList1 : addressLists1)
		{
			String addList1 = addressList1.getText();
			//System.out.println(addList1);
			l3.getAddress().sendKeys(Keys.ARROW_DOWN);
			
			if (addList1.contains("76 Glencoe Road"))
			{
				addressList1.click();
				break;
			}
			

		
		}
		
		
		
		
		l3.getPage3Yes1().click();
		
		l3.getpropertyType().click();
		
		l3.getpropertyDes().click();
		
		l3.getproperAge().sendKeys("1980");
		
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = l3.getproperAge();
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		

		
		l3.getbedrooms().click();
		List<WebElement> bedRoomNums = l3.getbedroomNum();
		Thread.sleep(3000L);
		for(WebElement bedRoomNum : bedRoomNums)
		{
			String bedroomNum = bedRoomNum.getText();
			int bedInt = Integer.parseInt(bedroomNum);
			if(bedInt==3){
				{
					bedRoomNum.click();
					break;
				}
			}		
		}
		
		
		
		
		l3.getbath().click();
		List<WebElement> bathRoomNums = l3.getbathNum();
		Thread.sleep(3000L);
		for(WebElement bathRoomNum : bathRoomNums)
		{
			String bedroomNum = bathRoomNum.getText();
			int bathInt = Integer.parseInt(bedroomNum);
			if(bathInt==1){
				{
					bathRoomNum.click();
					break;
				}
			}		
		}
		
		
		
		
		l3.getmainResidentYes().click();
		
		l3.getproptyOnwer().click();
		
		l3.getproptyOccupier().click();
		
		
		
//		WebElement element1 = l3.getproptyOccupier1();
//		je.executeScript("arguments[0].scrollIntoView(true);",element1);
//		
		l3.getOverAge().click();
		List<WebElement> ageLists = l3.getOverAgeList();
		Thread.sleep(3000L);
		for(WebElement ageList:ageLists)
		{
			
			String ages = ageList.getText();
			int age_Int = Integer.parseInt(ages);
			if(age_Int==9)
			{
				ageList.click();
				break;
			}
		}
		
		
		
		
//		WebElement element2 = l3.getUnderAgeOutView();
//		je.executeScript("arguments[0].scrollIntoView(true);",element2);
//		
		
	}
	
	
	@Test
	public void underage() throws InterruptedException
	{
		LandingPage3 l3 = new LandingPage3(driver);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element2 = l3.getUnderAgeOutView();
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(3000L);
		l3.getUnderAge().click();
		//List<WebElement> uageLists = l3.getUnderAgeList();
		//System.out.println(uageLists);
		Actions a = new Actions(driver);
		WebElement move = l3.getUnderAge();
		a.moveToElement(move).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		
		
		l3.getResidentSmokeYes().click();
	
		
		
		l3.getoccupyTime().click();
		WebElement move1 =l3.getoccupyTime();
		a.moveToElement(move1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		l3.getTreesNo().click();
		
		
		l3.getFlatRoofNo().click();
		
		
		l3.getConcreteYes().click();
		
		
		l3.getTile_Slate().click();
		
		
		l3.getWellMainte().click();
		
		
		l3.getNext3().click();
	}
	
	
	
	
	@Test
	public void aboutPg4()
	
	
	{
		
		LandingPage4 l4 = new LandingPage4(driver);
		
		
		l4.getquestion4().click();
		
		l4.getnext4().click();
		
	
		
	}
	
	
	
	@Test
	public void aboutPg5() throws InterruptedException
	
	
	{
		
		LandingPage5 l5 = new LandingPage5(driver);
		
		
		l5.getwindowSec().click();
		
		l5.getself_contained().click();
		
		l5.getFrenchPatio().click();
		
		l5.getexternalDoors().click();
		Thread.sleep(3000L);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element5 = l5.getwindowSec1();
		je.executeScript("arguments[0].scrollIntoView(true);",element5);
		l5.getburglaralarm().click();
		
		l5.getnext5().click();
		
	
		
	}
	
	

	

	@Test
	public void aboutPg6()
	
	
	{
		
		LandingPage6 l6 = new LandingPage6(driver);
		
		
		l6.getjointPolicyNo().click();
		
		l6.getnext6().click();
		
			
	}
	
	
	
	
	@Test
	public void aboutPg7()
	
	
	{
		
		LandingPage7 l7 = new LandingPage7(driver);
		
		
		Actions a = new Actions(driver);
		l7.getinsureYears().click();
		WebElement move7 =l7.getinsureYears();
		a.moveToElement(move7).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		l7.getclaim().click();
		
		l7.getnext7().click();
		
			
	}
	

	
	
	
	@Test
	public void aboutPg8()
	
	
	{
		
		LandingPage8 l8 = new LandingPage8(driver);
		
		
		l8.getstarDate().click();
		
		l8.getinsureType().click();
		
		l8.getcost().sendKeys("10,000");
		
		l8.getupgradeNo().click();
		
		l8.getenoyghToYes().click();
		
		l8.getworthOverNo().click();
		
		l8.getbicycleCoveNo().click();
		
		l8.getcoverAwayHomeNo().click();
		
		l8.getviewQuote().click();
		
			
	}
	
	
	
	@Test
	public void quit()
	{
		driver.close();
	}
	
	
	
	
}
