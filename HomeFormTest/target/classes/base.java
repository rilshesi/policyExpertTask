package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public  WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		
		// set capability for ie
				DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
				cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				cap.setCapability("requireWindowFocus", true);
				cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				cap.setCapability("nativeEvents", false);
				InternetExplorerOptions i = new InternetExplorerOptions();
				//fileUploadDialogTimeout
				i.waitForUploadDialogUpTo(Duration.ofSeconds(10));
				//ensureCleanSession
				i.destructivelyEnsureCleanSession();
				//ignoreZoomSetting
				i.ignoreZoomSettings();
				//ignoreProtectedModeSettings
				i.introduceFlakinessByIgnoringSecurityDomains();
				//silent
				i.setCapability("silent", true);
				i.merge(cap);
		
		
		
		
		
		
	 prop= new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	
	prop.load(fis);
	
	// Using prop to get browser from properties file
	String browserName=prop.getProperty("browser");
	
	//Using Maven command to get browser
	//String browserName = System.getProperty("browser");
	
	System.out.println(browserName);
	
	if(browserName.contains("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 if(browserName.contains("headless"))
		 {
			 options.addArguments("headless");
		 }
		 
		 driver= new ChromeDriver(options);
		 driver.manage().window().maximize();
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		//firefox code
	}
	else if (browserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(i);
		driver.manage().window().maximize();
	//	IE code
	}
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	return driver;
	
	
	}
	


}
