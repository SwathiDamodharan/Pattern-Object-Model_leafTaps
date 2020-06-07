package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setdata()
	{
		browserName="firefox";
		dataSheetName="EditLead";
		category="smoke";
		authors="Swathi";
		testCaseName="TC002_EditLead";
		testDescription="To edit already exitsng Lead";
		testNodes="EditeLead1";
		
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName, String pwd, String findFName, String cName, String fName, String lName)
	{
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.verifyLogin()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(findFName)
		.clickFindLeadbutton()
		.get_ID()
		.clickFirstRow();
		new ViewLead().clickEditLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickUpdate()
		.verifyCompanyNameUpdate(cName);
	}

}
