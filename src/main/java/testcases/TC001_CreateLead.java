package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {

	
	@BeforeTest
	public void setData()
	{
		browserName="firefox";
		testCaseName="TC002_CreateLead";
		testDescription="Create lead in the leafttap site";
		testNodes="Lead1";
		category="smoke";
		authors="Swathi";
		dataSheetName="CreateLead";
	}
	@Test(dataProvider="fetchData")
	public void leadCreate(String uName,String pwd,String cname,String fname,String lname,String phno,String mail)
	{
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cname)
		.typeFirstName(fname)
		.typeLastName(lname)
		.typePhoneNum(phno)
		.typeEmail(mail)
		.clickCreateLeadButton();
	}
}
