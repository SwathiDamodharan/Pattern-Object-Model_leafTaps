package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods {
	
	public FindLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement fname;
	
	@Then("Enter firstName as (.*)") 
	public FindLead typeFirstName(String data)
	{
		type(fname,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement getId;
	
	@Then("Capture the first resulting lead id")
	public FindLead get_ID()
	{
		leadID=getText(getId);
		return this;
	}	
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement phoneTab;
	
	public FindLead clickPhoneTab()
	{
		click(phoneTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement phoneNumber;
	
	public FindLead typePhone(String data)
	{
		type(phoneNumber,data);
		return this;
	}	
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement emailTab;
	
	public FindLead clickEmailTab()
	{
		click(emailTab);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement emailID;
	
	public FindLead typeEmail(String data)
	{
		type(emailID,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[6]")
	private WebElement getName;
	
	public FindLead captureFirstRowName()
	{
		capturedFirstName=getText(getName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeads;
	
	@And("Click on Find Leads button")
	public FindLead clickFindLeadbutton()
	{
		click(findLeads);
		return this;
	}	
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement verifyLeadID;
	
	public FindLead VerifyLeadID()
	{
		type(verifyLeadID,leadID);		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement verifyTable;
	
	public FindLead verifytable_leadID()
	{
		verifyPartialText(verifyTable,"No records to display");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement firstRow;
	
	@And("click on the first resulting Lead id")
	public MergeLeads clickFirstRow()
	{
		click(firstRow);
		switchToWindow(0);
		return new MergeLeads();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement mergeFName;
	
	public FindLead typeMergeFirstName(String data)
	{
		type(mergeFName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='linktext']")
	private WebElement mergeGetID;
	
	public FindLead merge_getID()
	{
		MergeGetID=getText(mergeGetID);
		return this;
	}	
		
	public FindLead verify_MergeID()
	{
		type(verifyLeadID,MergeGetID);
		return this;
	}
	
	
}