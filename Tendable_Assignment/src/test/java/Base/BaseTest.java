package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.TendablePgae;
import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static WebDriver driver;
	public TendablePgae tendablePage;

	@BeforeClass
	public void driverInstance() throws IOException {
		if (Utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (Utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		} 
		
		else if (Utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(Utility.fetchConfigProperty("testurl").toString());
		tendablePage = new TendablePgae(driver);
	}

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
