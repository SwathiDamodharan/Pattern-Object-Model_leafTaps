package Runner;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class ProjectMethods_Cucumber_CReateLead extends SeMethods {
	
	@Before
	public void before()
	{
		startResult();
		startTestModule("TC001_CreateLead", "Create a lead in the leaftap site");	
		test = startTestCase("Lead1");
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
