package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData()
	{
		dataSheetName="DeleteLead";
		browserName="firefox";
		testCaseName="TC003_DeleteLead";
		testDescription="Delete an already existing lead id";
		testNodes="DeleteLead1";
		authors="Swathi";
		category="smoke";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName, String pwd, String phoneNum) {
		
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.verifyLogin()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.typePhone(phoneNum)
		.clickFindLeadbutton()
		.get_ID()
		.clickFirstRow();
		new ViewLead().clickDelete()
		.clickFindLeads()
		.VerifyLeadID().clickFindLeadbutton().verifytable_leadID();
	}
}
