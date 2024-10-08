package Testscases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import Utilities.Utility;

public class tendableTest extends BaseTest {

	@Test
	public void verifyAccessibilityOfTopLevelMenus() throws Exception {

		Assert.assertEquals(Utility.fetchConfigProperty("data_homeTitle").toString(), tendablePage.getHomeTitle());

		// Our story
		tendablePage.ourStory();
		Assert.assertEquals(Utility.fetchConfigProperty("data_ourstoryTitle").toString(),
				tendablePage.getourStoryTitle());

		// Our solution
		tendablePage.ourSolution();
		Assert.assertEquals(Utility.fetchConfigProperty("data_ourSolutionTitle").toString(),
				tendablePage.getourSolutionTitle());

		// Why tendable
		tendablePage.whyTendable();
		Assert.assertEquals(Utility.fetchConfigProperty("data_whytendable").toString(),
				tendablePage.getwhyTendableTitle());

	}

	@Test
	public void verifyRequestDemoButtonPresentAndActive() throws Exception {

		// Home Page
		tendablePage.requestDemo();
		Assert.assertEquals(Utility.fetchConfigProperty("data_requestDemotitle").toString(),
				tendablePage.getRequestDemoTitle());

		// Our story request Demo
		tendablePage.ourStory();
		tendablePage.requestDemo();
		Assert.assertEquals(Utility.fetchConfigProperty("data_requestDemotitle").toString(),
				tendablePage.getRequestDemoTitle());

		// Our solution request Demo
		tendablePage.ourSolution();
		tendablePage.requestDemo();
		Assert.assertEquals(Utility.fetchConfigProperty("data_requestDemotitle").toString(),
				tendablePage.getRequestDemoTitle());

		// Why tendable request Demo
		tendablePage.whyTendable();
		tendablePage.requestDemo();
		Assert.assertEquals(Utility.fetchConfigProperty("data_requestDemotitle").toString(),
				tendablePage.getRequestDemoTitle());

		// About us request Demo
		tendablePage.aboutUs();
		tendablePage.requestDemo();
		Assert.assertEquals(Utility.fetchConfigProperty("data_requestDemotitle").toString(),
				tendablePage.getRequestDemoTitle());

	}

	@Test
	public void submitForm() throws Exception {

		// navigate to contact us and marketing
		tendablePage.navigateToContactUSMarketing();

		// Fill Form
		tendablePage.fillAndSubmitForm();

		// Asserting error message
		Assert.assertEquals(Utility.fetchConfigProperty("data_errorMassage").toString(),
				tendablePage.getErrorMessage());
	}
}
