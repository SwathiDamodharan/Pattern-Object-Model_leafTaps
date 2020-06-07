package Runner;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class ProjectMethods_Cucumber_EditLead extends SeMethods {
	
	@Before
	public void before()
	{
		startResult();
		startTestModule("TC001_EditLead", "Edit already esidting lead id in the leaftap site");	
		test = startTestCase("EditLead1");
		test.assignCategory("Smoke");
		test.assignAuthor("Swathi");
		startApp("firefox");
	}
	
	@After
	public void after()
	{
		closeAllBrowsers();
		endResult();
	}

}
