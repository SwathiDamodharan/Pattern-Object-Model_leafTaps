package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData()
	{
		dataSheetName="DuplicateLead";
		browserName="firefox";
		testCaseName="TC005_DuplicateLead";
		testDescription="TO create duplicate of laready existing lead name";
		testNodes="DuplicateLead1";
		authors="Swathi";
		category="samoke";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName, String pwd, String email)
	{
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.verifyLogin()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.typeEmail(email)
		.clickFindLeadbutton()
		.captureFirstRowName()
		.clickFirstRow();
		new ViewLead().clickDuplicateLead()
		.clickDuplicateCreateLead()
		.comapreduplicatedFirstName();
	}

}
