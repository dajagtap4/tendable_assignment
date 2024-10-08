package Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import Utilities.Utility;

public class TendablePgae {
	private WebDriver driver;
	private Actions actions;

	// Constructor
	public TendablePgae(WebDriver driver) {
		this.driver = driver;
	}

	public void ourStory() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("ourStory"))).click();
	}

	public void ourSolution() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("ourSolution"))).click();
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("mobileapp"))).click();
	}

	public void whyTendable() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("whyTendable"))).click();
	}

	public void aboutUs() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("aboutUs"))).click();
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("ourteam"))).click();
	}

	public void requestDemo() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("requestDemo"))).click();
	}

	public String getHomeTitle() throws InterruptedException {
		Thread.sleep(500);
		return driver.getTitle();
	}

	public String getourStoryTitle() throws InterruptedException {
		Thread.sleep(500);
		return driver.getTitle();
	}

	public String getourSolutionTitle() throws InterruptedException {
		Thread.sleep(500);
		return driver.getTitle();
	}

	public String getwhyTendableTitle() throws InterruptedException {
		Thread.sleep(500);
		return driver.getTitle();
	}

	public String getRequestDemoTitle() throws InterruptedException {
		Thread.sleep(500);
		return driver.getTitle();
	}

	public void navigateToContactUSMarketing() throws IOException, InterruptedException {
		actions = new Actions(driver);
		// Thread.sleep(500);
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("contactUs"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("marketing"))).click();
		Thread.sleep(1000);
	}

	public void fillAndSubmitForm() throws IOException, InterruptedException {

		// enter fullname
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("fullname")))
				.sendKeys(Utility.fetchConfigProperty("data_fullname").toString());

		Thread.sleep(500);

		// enter Org name
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("orgname")))
				.sendKeys(Utility.fetchConfigProperty("data_orgname").toString());

		Thread.sleep(500);

		// enter Phone
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("phonenumber")))
				.sendKeys(Utility.fetchConfigProperty("data_phonenumber").toString());

		Thread.sleep(500);

		// enter email
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("email")))
				.sendKeys(Utility.fetchConfigProperty("data_email").toString());

		Thread.sleep(500);

		// select job roll
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("jobrolldropdown"))).sendKeys("Other");

		Thread.sleep(500);

		// select i agree
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("redio"))).click();

		Thread.sleep(500);

		// Submit form
		driver.findElement(By.xpath(Utility.fetchLocatorProperty("submit"))).click();
	}
	
	public String getErrorMessage() throws IOException {
		String errormsg = driver.findElement(By.xpath(Utility.fetchLocatorProperty("errorMassage")))
				.getAttribute("value");
		return errormsg;
	}
}
