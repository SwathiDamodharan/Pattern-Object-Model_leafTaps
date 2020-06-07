package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import pages.MergeLeads;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData()
	{
		dataSheetName="MergeLead";
		browserName="firefox";
		testCaseName="TC004_MergeLead";
		testDescription="To merge already existing lead id";
		testNodes="MergeLead1";
		authors="Swathi";
		category="smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName, String pwd, String fromFName, String toFName) throws InterruptedException
	{
		new LoginPage().typeUserName(uName).typePassword(pwd)
		.verifyLogin().clickLogin().clickCrmsfa().clickLeads().clickMergeLeadd().clickFromLeadIcon()
		.typeMergeFirstName(fromFName).clickFindLeadbutton().merge_getID().clickFirstRow()
		.clickToLeadIcon().typeMergeFirstName(toFName).clickFindLeadbutton().clickFirstRow()
		.clickMergeLeadButton()
		.clickFindLeads()
		.verify_MergeID().clickFindLeadbutton().verifytable_leadID();
	}
}
